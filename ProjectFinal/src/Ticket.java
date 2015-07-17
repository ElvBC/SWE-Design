import java.util.ArrayList;
import java.util.Scanner;


public class Ticket {
	ArrayList<Integer> ticketNumbers;
	public Ticket(){
		ticketNumbers = new ArrayList<Integer>();
		
	}
	
	public void readNumbers(){
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < 6; i++) {
				System.out.print("Insert number "+(i+1)+": ");
				String line = scan.nextLine();
				
				while(!line.matches("[0-9]+")){
					System.out.println("Only integer numbers allowed.");
					line = scan.nextLine();
				}
				
				int nr = Integer.parseInt(line);
				while(ticketNumbers.contains(nr) || nr > 49 || nr < 1){
					System.out.println("Error you already choose the number , or the number is bigger than 49 or smaller than 1.");
					line = scan.nextLine();
					while(!line.matches("[0-9]+")){
						System.out.println("Only numbers between 1-49 allowed");
						line = scan.nextLine();
					}
					nr = Integer.parseInt(line);
				}
				ticketNumbers.add(nr);
			}
	}
}
