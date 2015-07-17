import java.util.ArrayList;


public class RandomNumberGen {
	private int randomNumber;
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public RandomNumberGen(){
		for (int i = 0; i < 6; i++) {
			randomNumber = (int) ((Math.random()*49));
			while (list.contains(randomNumber) || randomNumber == 0) {
				randomNumber = (int) ((Math.random()*49)+1);
			}
			list.add(randomNumber);
		}
	}
	
	public ArrayList<Integer> getRandoms(){
		return list;
	}
}
