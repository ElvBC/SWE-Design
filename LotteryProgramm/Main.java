import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner eing = new Scanner(System.in);
		int players,MenuSelection;
		int playersNumbers[][]=new int [1000][6]; //Max. 1000 Players
		String playerFirstName[]= new String [50]; //Max 50. Chars
		String playerLastName[]= new String [50]; //Max. 50 Chars

		while(true){
			System.out.println("=== Lottery Menu ==="); //Menu
			System.out.println("1 Enter ticket\n2 Lottery drawing\n3 Show result\n0 Quit\nPlease enter (0-3):");
			MenuSelection=eing.nextInt();
			switch(MenuSelection){
			case 0://Quit
			System.exit(0);
			break; 
			
			case 1:
        		break;
			
			case 2:
			break;
			
			case 3:
			break;
			
			default: //Wrong Input
			System.out.println(MenuSelection +"is a not allowed input");
			break;
			}//switch
		}//while
	}//public static void 
}//Main
