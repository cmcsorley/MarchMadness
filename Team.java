
public class Team {
	
	private String name;
	private int seed;
	private String region;
	private boolean wonLastGame;
	
	//constructs a team
	public Team(String name, int seed, String region, boolean wonLastGame){
		this.name = name;
		this.seed = seed;
		this.region = region;
		this.wonLastGame = wonLastGame;
	}

	public String getName(){return this.name;}
	public int getSeed(){return this.seed;}
	public String getRegion(){return this.region;}
	public boolean getWonLastGame(){return this.wonLastGame;}
	public void setWonLastGame(boolean won){this.wonLastGame = won;}
	
}
