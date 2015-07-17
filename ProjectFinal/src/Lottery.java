import java.util.ArrayList;


public class Lottery {
	private RandomNumberGen rng;
	private ArrayList<Player> allPlayers;
	
	public Lottery(){
		rng  = new RandomNumberGen();
		allPlayers = new ArrayList<Player>();
	}
	
	public ArrayList<Integer> getRandomNumberGen(){
		return rng.getRandoms();
	}
	
	public void addPlayer(Player pl){
		allPlayers.add(pl);
	}
	
	public ArrayList<Player> getAllPlayers(){
		return allPlayers;
	}
	
	public void newNumbers(){
		rng = new RandomNumberGen();
	}
}
