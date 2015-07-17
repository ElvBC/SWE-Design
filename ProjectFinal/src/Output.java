import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class Output {
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		Lottery lot = new Lottery();
		int check = 0;
		
		while (true) {

			System.out.println("=== Lottery Menu ===");
			System.out.print("1 Enter ticket\n2 Lottery drawing\n3 Show result\n0 Quit\nPlease enter (0-3): ");
			
			String option1 = scan.next();
			while(!option1.matches("[0-3]")){
				System.out.println("Please insert only Integer numbers between 0-3");
				option1 = scan.next();
			}
			int option = Integer.parseInt(option1);
			
			if (option == 1) {
				System.out.println("-------------------------------------");
				System.out.print("How many players?: ");
				
				int players = scan.nextInt();
				String fn = null, ln = null;
				for (int i = 0; i < players; i++) {
					System.out.println("Player number" + (i+1));
					System.out.print("Enter Firstname: ");
					fn = scan.next();
					System.out.print("Enter Lastname: ");
					ln = scan.next();
					Player pl = new Player(ln, fn);
					pl.getTicket().readNumbers();
					lot.getAllPlayers().add(pl);
					System.out.println("-------------------------------------\n");
				}
				check = 1;
			}
			else if (option == 2) {
				if (!lot.getAllPlayers().isEmpty()){
					lot.newNumbers();
					Iterator<Integer> it = lot.getRandomNumberGen().iterator();
					System.out.print("-------------------------------------\nDrawn numbers: [");
					for (int i = 0; i < 6; i++) {
						System.out.print("(" + it.next() + ")");
					}
					System.out.println("]\n-------------------------------------\n");
					check = 2;
				}
				else{
					System.out.println("-------------------------------------\nYou have to enter a ticket first.\n-------------------------------------\n");
				}
			}
			else if (option == 3) {
				if (!lot.getAllPlayers().isEmpty() && check == 2) {
					int same = 0;
					ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
					ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
					for (int i = 0; i < lot.getAllPlayers().size(); i++) {
						same = 0;
						arrayList1 = lot.getAllPlayers().get(i).getTicket().ticketNumbers;
						arrayList2 = lot.getRandomNumberGen();
						int[] nrs = new int[6];
						for (int j = 0; j < 6; j++) {
							if (arrayList2.contains(arrayList1.get(j))) {
								same++;
							}
							nrs[j] = arrayList1.get(j);
						}
						System.out.println("-------------------------------------");
						System.out.print("Entered numbers: ");
						System.out.println(Arrays.toString(nrs));
						String fn = lot.getAllPlayers().get(i).getFirstName();
						String ln = lot.getAllPlayers().get(i).getLastName();
						System.out.println("You have " + same + " number(s) right for " + fn + " " + ln + "(Player " + (i+1) + ")\n");
					}
				}
				else{
					System.out.println("-------------------------------------\nThe Lottery isn't drawn.\n-------------------------------------\n");
				}
			}
			else if (option == 0) {
				System.exit(0);
			}
		}
	}
}
