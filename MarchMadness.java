import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MarchMadness {
	
	public static void main(String[] args) throws IOException {
		ArrayList<Team> teamList = new ArrayList<Team>();
		//an ArrayList that stores all of the teams
		Scanner fileScnr = new Scanner(new File("C:\\Users\\catmc\\OneDrive\\Documents\\Java\\MarchMadness\\TeamList.txt"));
		while (fileScnr.hasNextLine()) {
		//reads each team in and adds it to teamList
			String line = fileScnr.nextLine();
			String[] tokens = line.split(",");
			Team team = new Team(tokens[0].trim(), Integer.parseInt(tokens[1].trim()), tokens[2].trim(), false);
			teamList.add(team);	
		}
		String out = "";
		out = createRegions(teamList, out);
		ArrayList<Team> finalFour = new ArrayList<Team>();
		//add the final four teams to the final four list
		for(int i = 0; i<teamList.size(); i++){
			if(teamList.get(i).getWonLastGame()) finalFour.add(teamList.get(i));
		}
		out = finalFour(finalFour, out);
		fileScnr.close();
		System.out.print(out);
	}
	
	
	//makes an arraylist for each region
	//returns the results of each region
	public static String createRegions(ArrayList<Team> teamList, String out){
		ArrayList<Team> southList = new ArrayList<Team>();
		for(int i = 0; i < 16; i++){
			southList.add(teamList.get(i));
		}
		String out1 = tournament(southList, out);
		ArrayList<Team> westList = new ArrayList<Team>();
		for(int i = 16; i < 32; i++){
			westList.add(teamList.get(i));
		}
		String out2 = tournament(westList, out);
		ArrayList<Team> eastList = new ArrayList<Team>();
		for(int i = 32; i < 48; i++){
			eastList.add(teamList.get(i));
		}
		String out3 = tournament(eastList, out);
		ArrayList<Team> midwestList = new ArrayList<Team>();
		for(int i = 48; i < 64; i++){
			midwestList.add(teamList.get(i));
		}
		String out4 = tournament(midwestList, out);
		return out1+out2+out3+out4;
	}
	
	//returns the probability of the higher seeded (smaller number) team winning
	//probabilities from https://www.stats.com/insights/ncaa-basketball/ncaa-march-madness-seeding-probabilities/
	//assumed difference between seeds hold same probs ie. 12 v 14 == 3 v 5
	//for even difference, averaged the adjacent odds and rounded up
	//probabilities will continue to be tweaked
	public static int getWinProbability(Team team1, Team team2){
		int seed1 = team1.getSeed();
		int seed2 = team2.getSeed();
		int prob = 0;
		if(seed2 > seed1){
			if(seed2-seed1==15) prob = 100;
			if(seed2-seed1==14) prob = 98;
			if(seed2-seed1==13) prob = 96;
			if(seed2-seed1==12) prob = 91;
			if(seed2-seed1==11) prob = 85;
			if(seed2-seed1==10) prob = 82;
			if(seed2-seed1==9) prob = 79;
			if(seed2-seed1==8) prob = 73;
			if(seed2-seed1==7) prob = 67;
			if(seed2-seed1==6) prob = 67;
			if(seed2-seed1==5) prob = 67;
			if(seed2-seed1==4) prob = 64;
			if(seed2-seed1==3) prob = 60;
			if(seed2-seed1==2) prob = 54;
			if(seed2-seed1==1) prob = 47;
		}
		else{
			if(seed1-seed2==15) prob = 0;
			if(seed1-seed2==14) prob = 2;
			if(seed1-seed2==13) prob = 4;
			if(seed1-seed2==12) prob = 9;
			if(seed1-seed2==11) prob = 15;
			if(seed1-seed2==10) prob = 18;
			if(seed1-seed2==9) prob = 21;
			if(seed1-seed2==8) prob = 27;
			if(seed1-seed2==7) prob = 33;
			if(seed1-seed2==6) prob = 33;
			if(seed1-seed2==5) prob = 33;
			if(seed1-seed2==4) prob = 36;
			if(seed1-seed2==3) prob = 40;
			if(seed1-seed2==2) prob = 46;
			if(seed1-seed2==1) prob = 53;
			if(seed1-seed2==0) prob = 50;
		}
		return prob;
	}
	
	//takes two teams and returns whether team1 wins
	public static boolean doesTeam1Win(Team team1, Team team2){
		int prob = getWinProbability(team1, team2);
		Random rand = new Random();
		int randProb = rand.nextInt(100);
		if(randProb<prob) return true;
		else return false;
	}
	
	//runs the tournament for a region and returns a String of each round
	public static String tournament(ArrayList<Team> region, String out) {
		ArrayList<Team> nextRound = new ArrayList<Team>();
		//for each team in the round, have them play the adjacent guy
		for(int i = 0; i<region.size()-1; i=i+2){
			boolean won = doesTeam1Win(region.get(i), region.get(i+1));
			region.get(i).setWonLastGame(won);
			region.get(i+1).setWonLastGame(!won);
			if(won) nextRound.add(region.get(i));
			else nextRound.add(region.get(i+1));
		}
		//initialize String for just this round
		String round="";
		//identify the teams by seed and region until there are names to be used
		for(int i = 0; i<nextRound.size(); i++) round+=nextRound.get(i).getName()+", ";
		out+=round+"\n";
		//stop recursion if we've found a regional winner
		if (nextRound.size()==1) return out;
		//otherwise go onto the next round
		//return the String of the whole tournament for the particular region
		else return tournament(nextRound, out);
	}
	
	//indexing is convaluted because the regions were shifted around in 2017 bracket
	public static String finalFour(ArrayList<Team> finalFour, String out){
		boolean west = doesTeam1Win(finalFour.get(1), finalFour.get(0));
		if(west) out+=finalFour.get(1).getName()+", ";
		else out+=finalFour.get(3).getName()+", ";
		boolean midwest = doesTeam1Win(finalFour.get(3), finalFour.get(0));
		if(midwest) out+=finalFour.get(3).getName()+"\n";
		else out+=finalFour.get(0).getName()+"\n";
		if(midwest&west){
			boolean right = doesTeam1Win(finalFour.get(1), finalFour.get(3));
			if(right) out+=finalFour.get(3).getName();
			else out+=finalFour.get(1).getName();
		}
		if(midwest&!west){
			boolean right = doesTeam1Win(finalFour.get(3), finalFour.get(2));
			if(right) out+=finalFour.get(3).getName();
			else out+=finalFour.get(2).getName();
		}
		if(!midwest&west){
			boolean right = doesTeam1Win(finalFour.get(0), finalFour.get(1));
			if(right) out+=finalFour.get(0).getName();
			else out+=finalFour.get(1).getName();
		}
		if(!midwest&!west){
			boolean right = doesTeam1Win(finalFour.get(0), finalFour.get(2));
			if(right) out+=finalFour.get(0).getName();
			else out+=finalFour.get(2).getName();
		}
		return out;
	}
	
}
