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
		String thirtyTwo = "";
		String sweetSixteen = "";
		String eliteEight = "";
		String finalFour = "";
		String finalTwo = "";
		String winner = "";
		float n=2000;
		for(int i = 0; i < n; i++) {
			out = "";
			out = createRegions(teamList, out);
			ArrayList<Team> finalFourTeams = new ArrayList<Team>();
			//add the final four teams to the final four list
			for(int j = 0; j<teamList.size(); j++){
				if(teamList.get(j).getWonLastGame()) finalFourTeams.add(teamList.get(j));
			}
			out = finalFour(finalFourTeams, out);
			thirtyTwo = thirtyTwo + out.split("\n")[0] + out.split("\n")[4] + out.split("\n")[8] + out.split("\n")[12];
			sweetSixteen = sweetSixteen + out.split("\n")[1] + out.split("\n")[5] + out.split("\n")[9] + out.split("\n")[13];
			eliteEight = eliteEight + out.split("\n")[2] + out.split("\n")[6] + out.split("\n")[10] + out.split("\n")[14];
			finalFour = finalFour + out.split("\n")[3] + out.split("\n")[7] + out.split("\n")[11] + out.split("\n")[15];
			finalTwo = finalTwo + out.split("\n")[16];
			winner = winner + out.split("\n")[17];
		}
		
		float round32count1 = thirtyTwo.chars().filter(ch -> ch == '1').count()/n;
		float round32count2 = thirtyTwo.chars().filter(ch -> ch == '2').count()/n;
		float round32count3 = thirtyTwo.chars().filter(ch -> ch == '3').count()/n;
		float round32count4 = thirtyTwo.chars().filter(ch -> ch == '4').count()/n;
		float round32count5 = thirtyTwo.chars().filter(ch -> ch == '5').count()/n;
		float round32count6 = thirtyTwo.chars().filter(ch -> ch == '6').count()/n;
		float round32count7 = thirtyTwo.chars().filter(ch -> ch == '7').count()/n;
		float round32count8 = thirtyTwo.chars().filter(ch -> ch == '8').count()/n;
		float round32count9 = thirtyTwo.chars().filter(ch -> ch == '9').count()/n;
		float round32count10 = thirtyTwo.chars().filter(ch -> ch == '!').count()/n;
		float round32count11 = thirtyTwo.chars().filter(ch -> ch == '@').count()/n;
		float round32count12 = thirtyTwo.chars().filter(ch -> ch == '#').count()/n;
		float round32count13 = thirtyTwo.chars().filter(ch -> ch == '$').count()/n;
		float round32count14 = thirtyTwo.chars().filter(ch -> ch == '%').count()/n;
		float round32count15 = thirtyTwo.chars().filter(ch -> ch == '^').count()/n;
		float round32count16 = thirtyTwo.chars().filter(ch -> ch == '&').count()/n;

		float round16count1 = sweetSixteen.chars().filter(ch -> ch == '1').count()/n;
		float round16count2 = sweetSixteen.chars().filter(ch -> ch == '2').count()/n;
		float round16count3 = sweetSixteen.chars().filter(ch -> ch == '3').count()/n;
		float round16count4 = sweetSixteen.chars().filter(ch -> ch == '4').count()/n;
		float round16count5 = sweetSixteen.chars().filter(ch -> ch == '5').count()/n;
		float round16count6 = sweetSixteen.chars().filter(ch -> ch == '6').count()/n;
		float round16count7 = sweetSixteen.chars().filter(ch -> ch == '7').count()/n;
		float round16count8 = sweetSixteen.chars().filter(ch -> ch == '8').count()/n;
		float round16count9 = sweetSixteen.chars().filter(ch -> ch == '9').count()/n;
		float round16count10 = sweetSixteen.chars().filter(ch -> ch == '!').count()/n;
		float round16count11 = sweetSixteen.chars().filter(ch -> ch == '@').count()/n;
		float round16count12 = sweetSixteen.chars().filter(ch -> ch == '#').count()/n;
		float round16count13 = sweetSixteen.chars().filter(ch -> ch == '$').count()/n;
		float round16count14 = sweetSixteen.chars().filter(ch -> ch == '%').count()/n;
		float round16count15 = sweetSixteen.chars().filter(ch -> ch == '^').count()/n;
		float round16count16 = sweetSixteen.chars().filter(ch -> ch == '&').count()/n;

		float round8count1 = eliteEight.chars().filter(ch -> ch == '1').count()/n;
		float round8count2 = eliteEight.chars().filter(ch -> ch == '2').count()/n;
		float round8count3 = eliteEight.chars().filter(ch -> ch == '3').count()/n;
		float round8count4 = eliteEight.chars().filter(ch -> ch == '4').count()/n;
		float round8count5 = eliteEight.chars().filter(ch -> ch == '5').count()/n;
		float round8count6 = eliteEight.chars().filter(ch -> ch == '6').count()/n;
		float round8count7 = eliteEight.chars().filter(ch -> ch == '7').count()/n;
		float round8count8 = eliteEight.chars().filter(ch -> ch == '8').count()/n;
		float round8count9 = eliteEight.chars().filter(ch -> ch == '9').count()/n;
		float round8count10 = eliteEight.chars().filter(ch -> ch == '!').count()/n;
		float round8count11 = eliteEight.chars().filter(ch -> ch == '@').count()/n;
		float round8count12 = eliteEight.chars().filter(ch -> ch == '#').count()/n;
		float round8count13 = eliteEight.chars().filter(ch -> ch == '$').count()/n;
		float round8count14 = eliteEight.chars().filter(ch -> ch == '%').count()/n;
		float round8count15 = eliteEight.chars().filter(ch -> ch == '^').count()/n;
		float round8count16 = eliteEight.chars().filter(ch -> ch == '&').count()/n; 

		float round4count1 = finalFour.chars().filter(ch -> ch == '1').count()/n;
		float round4count2 = finalFour.chars().filter(ch -> ch == '2').count()/n;
		float round4count3 = finalFour.chars().filter(ch -> ch == '3').count()/n;
		float round4count4 = finalFour.chars().filter(ch -> ch == '4').count()/n;
		float round4count5 = finalFour.chars().filter(ch -> ch == '5').count()/n;
		float round4count6 = finalFour.chars().filter(ch -> ch == '6').count()/n;
		float round4count7 = finalFour.chars().filter(ch -> ch == '7').count()/n;
		float round4count8 = finalFour.chars().filter(ch -> ch == '8').count()/n;
		float round4count9 = finalFour.chars().filter(ch -> ch == '9').count()/n;
		float round4count10 = finalFour.chars().filter(ch -> ch == '!').count()/n;
		float round4count11 = finalFour.chars().filter(ch -> ch == '@').count()/n;
		float round4count12 = finalFour.chars().filter(ch -> ch == '#').count()/n;
		float round4count13 = finalFour.chars().filter(ch -> ch == '$').count()/n;
		float round4count14 = finalFour.chars().filter(ch -> ch == '%').count()/n;
		float round4count15 = finalFour.chars().filter(ch -> ch == '^').count()/n;
		float round4count16 = finalFour.chars().filter(ch -> ch == '&').count()/n; 

		float round2count1 = finalTwo.chars().filter(ch -> ch == '1').count()/n;
		float round2count2 = finalTwo.chars().filter(ch -> ch == '2').count()/n;
		float round2count3 = finalTwo.chars().filter(ch -> ch == '3').count()/n;
		float round2count4 = finalTwo.chars().filter(ch -> ch == '4').count()/n;
		float round2count5 = finalTwo.chars().filter(ch -> ch == '5').count()/n;
		float round2count6 = finalTwo.chars().filter(ch -> ch == '6').count()/n;
		float round2count7 = finalTwo.chars().filter(ch -> ch == '7').count()/n;
		float round2count8 = finalTwo.chars().filter(ch -> ch == '8').count()/n;
		float round2count9 = finalTwo.chars().filter(ch -> ch == '9').count()/n;
		float round2count10 = finalTwo.chars().filter(ch -> ch == '!').count()/n;
		float round2count11 = finalTwo.chars().filter(ch -> ch == '@').count()/n;
		float round2count12 = finalTwo.chars().filter(ch -> ch == '#').count()/n;
		float round2count13 = finalTwo.chars().filter(ch -> ch == '$').count()/n;
		float round2count14 = finalTwo.chars().filter(ch -> ch == '%').count()/n;
		float round2count15 = finalTwo.chars().filter(ch -> ch == '^').count()/n;
		float round2count16 = finalTwo.chars().filter(ch -> ch == '&').count()/n; 

		float round1count1 = winner.chars().filter(ch -> ch == '1').count()/n;
		float round1count2 = winner.chars().filter(ch -> ch == '2').count()/n;
		float round1count3 = winner.chars().filter(ch -> ch == '3').count()/n;
		float round1count4 = winner.chars().filter(ch -> ch == '4').count()/n;
		float round1count5 = winner.chars().filter(ch -> ch == '5').count()/n;
		float round1count6 = winner.chars().filter(ch -> ch == '6').count()/n;
		float round1count7 = winner.chars().filter(ch -> ch == '7').count()/n;
		float round1count8 = winner.chars().filter(ch -> ch == '8').count()/n;
		float round1count9 = winner.chars().filter(ch -> ch == '9').count()/n;
		float round1count10 = winner.chars().filter(ch -> ch == '!').count()/n;
		float round1count11 = winner.chars().filter(ch -> ch == '@').count()/n;
		float round1count12 = winner.chars().filter(ch -> ch == '#').count()/n;
		float round1count13 = winner.chars().filter(ch -> ch == '$').count()/n;
		float round1count14 = winner.chars().filter(ch -> ch == '%').count()/n;
		float round1count15 = winner.chars().filter(ch -> ch == '^').count()/n;
		float round1count16 = winner.chars().filter(ch -> ch == '&').count()/n; 

		fileScnr.close();	
		
		System.out.print("Expected Number of each seed in Round of 32:" +"\n" +
				"1: " + round32count1 + ", 2: " + round32count2 + ", 3: " + round32count3 + ", 4: " + round32count4 + ", 5: " + round32count5 + ", 6: " + round32count6 + ", 7: " + round32count7 + ", 8: " + round32count8 + ", 9: " + round32count9 + ", 10: " + round32count10 + ", 11: " + round32count11 + ", 12: " + round32count12 + ", 13: " + round32count13 + ", 13: " + round32count13 + ", 14: " + round32count14 + ", 15: " + round32count15 + ", 16: " + round32count16 + "\n" + 
				"Expected Number of each seed in the Sweet Sixteen:" + "\n" + "1: "  + round16count1 + ", 2: " + round16count2 + ", 3: " + round16count3 + ", 4: " + round16count4 + ", 5: " + round16count5 + ", 6: " + round16count6 + ", 7: " + round16count7 + ", 8: " + round16count8 + ", 9: " + round16count9 + ", 10: " + round16count10 + ", 11: " + round16count11 + ", 12: " + round16count12 + ", 13: " + round16count13 + ", 13: " + round16count13 + ", 14: " + round16count14 + ", 15: " + round16count15 + ", 16: " + round16count16 + "\n" + 
				"Expected Number of each seed in the Elite Eight:" + "\n " + "1: "  + round8count1 + ", 2: " + round8count2 + ", 3: " + round8count3 + ", 4: " + round8count4 + ", 5: " + round8count5 + ", 6: " + round8count6 + ", 7: " + round8count7 + ", 8: " + round8count8 + ", 9: " + round8count9 + ", 10: " + round8count10 + ", 11: " + round8count11 + ", 12: " + round8count12 + ", 13: " + round8count13 + ", 13: " + round8count13 + ", 14: " + round8count14 + ", 15: " + round8count15 + ", 16: " + round8count16 + "\n" + 
				"Expected Number of each seed in the Final Four:" + "\n " + "1: "  + round4count1 + ", 2: " + round4count2 + ", 3: " + round4count3 + ", 4: " + round4count4 + ", 5: " + round4count5 + ", 6: " + round4count6 + ", 7: " + round4count7 + ", 8: " + round4count8 + ", 9: " + round4count9 + ", 10: " + round4count10 + ", 11: " + round4count11 + ", 12: " + round4count12 + ", 13: " + round4count13 + ", 13: " + round4count13 + ", 14: " + round4count14 + ", 15: " + round4count15 + ", 16: " + round4count16 + "\n" + 
				"Expected Number of each seed in the Final Two:" + "\n " + "1: "  + round2count1 + ", 2: " + round2count2 + ", 3: " + round2count3 + ", 4: " + round2count4 + ", 5: " + round2count5 + ", 6: " + round2count6 + ", 7: " + round2count7 + ", 8: " + round2count8 + ", 9: " + round2count9 + ", 10: " + round2count10 + ", 11: " + round2count11 + ", 12: " + round2count12 + ", 13: " + round2count13 + ", 13: " + round2count13 + ", 14: " + round2count14 + ", 15: " + round2count15 + ", 16: " + round2count16 + "\n" + 
				"Expected Probability of each seed to win:" + "\n " + "1: "  + round1count1 + ", 2: " + round1count2 + ", 3: " + round1count3 + ", 4: " + round1count4 + ", 5: " + round1count5 + ", 6: " + round1count6 + ", 7: " + round1count7 + ", 8: " + round1count8 + ", 9: " + round1count9 + ", 10: " + round1count10 + ", 11: " + round1count11 + ", 12: " + round1count12 + ", 13: " + round1count13 + ", 13: " + round1count13 + ", 14: " + round1count14 + ", 15: " + round1count15 + ", 16: " + round1count16 
				);
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
	public static double getWinProbability(Team team1, Team team2){
		int seed1 = team1.getSeed();
		int seed2 = team2.getSeed();
		double prob = 0;
		if(seed2 > seed1){
			if(seed2-seed1==15) prob = 99.908589;
			if(seed2-seed1==14) prob = 96.564493;
			if(seed2-seed1==13) prob = 93.220396;
			if(seed2-seed1==12) prob = 89.8763;
			if(seed2-seed1==11) prob = 86.532203;
			if(seed2-seed1==10) prob = 83.188107;
			if(seed2-seed1==9) prob = 79.844011;
			if(seed2-seed1==8) prob = 76.499914;
			if(seed2-seed1==7) prob = 73.155818;
			if(seed2-seed1==6) prob = 69.811721;
			if(seed2-seed1==5) prob = 66.467625;
			if(seed2-seed1==4) prob = 63.123528;
			if(seed2-seed1==3) prob = 59.779432;
			if(seed2-seed1==2) prob = 56.435336;
			if(seed2-seed1==1) prob = 53.091239;
		}
		else{
			if(seed1-seed2==15) prob = 00.091411;
			if(seed1-seed2==14) prob = 3.435507;
			if(seed1-seed2==13) prob = 6.779604;
			if(seed1-seed2==12) prob = 10.1237;
			if(seed1-seed2==11) prob = 13.467797;
			if(seed1-seed2==10) prob = 16.811893;
			if(seed1-seed2==9) prob = 20.155989;
			if(seed1-seed2==8) prob = 23.500086;
			if(seed1-seed2==7) prob = 26.844182;
			if(seed1-seed2==6) prob = 30.188279;
			if(seed1-seed2==5) prob = 33.532375;
			if(seed1-seed2==4) prob = 36.876472;
			if(seed1-seed2==3) prob = 40.220568;
			if(seed1-seed2==2) prob = 43.564664;
			if(seed1-seed2==1) prob = 46.908761;
			if(seed1-seed2==0) prob = 50;
		}
		return prob;
	}
	
	//takes two teams and returns whether team1 wins
	public static boolean doesTeam1Win(Team team1, Team team2){
		double prob = getWinProbability(team1, team2);
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
	
	//get the final four
	public static String finalFour(ArrayList<Team> finalFour, String out){
		boolean west = doesTeam1Win(finalFour.get(1), finalFour.get(0));
		if(west) out+=finalFour.get(1).getName()+", ";
		else out+=finalFour.get(0).getName()+", ";
		boolean midwest = doesTeam1Win(finalFour.get(3), finalFour.get(2));
		if(midwest) out+=finalFour.get(3).getName()+"\n";
		else out+=finalFour.get(2).getName()+"\n";
		if(midwest&west){
			boolean right = doesTeam1Win(finalFour.get(1), finalFour.get(3));
			if(right) out+=finalFour.get(3).getName();
			else out+=finalFour.get(1).getName();
		}
		if(midwest&!west){
			boolean right = doesTeam1Win(finalFour.get(0), finalFour.get(3));
			if(right) out+=finalFour.get(3).getName();
			else out+=finalFour.get(0).getName();
		}
		if(!midwest&west){
			boolean right = doesTeam1Win(finalFour.get(1), finalFour.get(2));
			if(right) out+=finalFour.get(2).getName();
			else out+=finalFour.get(1).getName();
		}
		if(!midwest&!west){
			boolean right = doesTeam1Win(finalFour.get(0), finalFour.get(2));
			if(right) out+=finalFour.get(2).getName();
			else out+=finalFour.get(0).getName();
		}
		return out;
	}
	
}
