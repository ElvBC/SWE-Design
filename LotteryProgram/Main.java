import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner eing = new Scanner(System.in);
		int players = 0,MenuSelection,rights = 0,tmp=0;
		int  lotteryNumbers[]=new int [6]; //6 lottery number
		int playersNumbers[][]=new int [1000][6]; //Max. 1000 Players each 6 numbers.
		String playerFirstName[]= new String [50]; //Max 50. Chars
		String playerLastName[]= new String [50]; //Max. 50 Chars

		while(true){
		System.out.println("=== Lottery Menu ==="); //Menu
			System.out.println("1 Enter ticket\n2 Lottery drawing\n3 Show result\n0 Quit\nPlease enter (0-3):");
			MenuSelection=eing.nextInt();
			switch(MenuSelection){
//Case0--------------------------------------------------------------------------------------------------------------
		case 0:
		System.exit(0);
		break; //Quit//Case1--------------------------------------------------------------------------------------------------------------	
		case 1:
		System.out.println("How many are playing this game: ");
		players=eing.nextInt();
		for (int i = 0; i <players; i++) {
			eing.nextLine();
			System.out.println("Give in your First Name: ");
			playerFirstName[i]=eing.nextLine();
			System.out.println("Give in your Last Name: ");
			playerLastName[i]=eing.nextLine();//First & LastName
			for (int j = 0; j <6; j++){
				System.out.println(j+1+". Number");
		//----------------------ERROR HANDLING----------------------START
				if((playersNumbers[i][j] = eing.nextInt())>49){//INPUT: Give player i the number j
				System.out.println("Only numbers >0 and <50 are allowed."); 
				j--;
				continue;
				}else{
				if((playersNumbers[i][j])<1){//Give player i the number j
				System.out.println("Only numbers >0 and <50 are allowed."); 
				j--;
				continue;
			}
			for (int a = j-1; a >=0; a--) {
				if(playersNumbers[i][j]==playersNumbers[i][a]){
				System.out.println("You cant give in the same number twice.");
				j--;
				}//if
			}//for
			}//else
		}//for2
		//----------------------ERROR HANDLING----------------------END
		System.out.println("\n");
	}//for
			break; //Adding player + his numbers
			
//Case2--------------------------------------------------------------------------------------------------------------
			case 2:
			break;

//Case3--------------------------------------------------------------------------------------------------------------
			case 3:
			break;

//Default------------------------------------------------------------------------------------------------------------
			default: //Wrong Input
			System.out.println(MenuSelection +"is a not allowed input");
			break;
			}//switch
		}//while
	}//public static void 
}//Main
