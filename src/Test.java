import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random myRandom = new Random();
		Scanner myScanner = new Scanner(System.in);
		
		int playerOne,playerTwo;
		int randomNumber;
		int counter = 3;
		int playerOneCounter = 0,playerTwoCounter = 0, draws = 0;
		String playerOneName,playerTwoName;
		
		System.out.println("Enter Player One Name");
		playerOneName = myScanner.next();
		
		System.out.println("Enter Player Two Name");
		playerTwoName = myScanner.next();
		
			
		do {
			System.out.println("-----------------------------------------------");
			randomNumber = 1 + myRandom.nextInt(10);
			
			System.out.println("Guess my Random number to win $1,000");
			
			System.out.println();
			
			System.out.println("Enter Your guess number "+playerOneName);
			
			playerOne = myScanner.nextInt();
			
			System.out.println("Your Turn "+playerTwoName);
			
			playerTwo = myScanner.nextInt();
			
			if(playerTwo == randomNumber && playerOne == randomNumber) {
				System.out.println("You both got it..DRAW!");
				counter--;
				draws++;
				System.out.println("You have "+counter+" more game(s)");
			}
			
			else if(playerOne == randomNumber) {
				playerOneCounter++;
				System.out.println("Correct "+playerOneName+", You Guessed Right ");
				counter--;
				System.out.println("You have "+counter+" more game(s)");
			}
			else if(playerTwo == randomNumber) {
				System.out.println("Correct "+playerTwoName+", You Guessed Right ");
				playerTwoCounter++;
				counter--;
				System.out.println("You have "+counter+" more game(s)");
			}
			
			else {
				counter--;
				System.out.println("My random Number was "+randomNumber);
				System.out.println("You have "+counter+" more game(s)");
			}
			
		}while(playerOne != 0 && counter!=0);
		
		System.out.println();
		
		System.out.println("Statistics ----------");
		
		System.out.println(playerOneName+" WON "+playerOneCounter+" games ");
		System.out.println(playerTwoName+" WON "+playerTwoCounter+" games ");
		System.out.println("DRAWS "+draws);
		
		if (playerOneCounter > playerTwoCounter) {
			System.out.println(playerOneName+" WINS!");
		}
		else if(playerOneCounter < playerTwoCounter) {
			System.out.println(playerTwoName+" WINS!");
		}
		else {
			System.out.println("AWWWWW its a Draw!");
		}
		
		System.out.println("GAME OVER!");
	}
}
