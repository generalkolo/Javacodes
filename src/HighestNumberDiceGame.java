import java.util.Random;
import java.util.Scanner;

public class HighestNumberDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Highest Number wins the GAME!!");
		System.out.println();
		
		Scanner aScanner = new Scanner(System.in);
		int playerOneRolls = 0,playerTwoRolls = 0,numberOfGamesLeft, diceRolled;
		char keyRoll;
		
		System.out.println("Enter how many times you would like to play_");
		
		numberOfGamesLeft = aScanner.nextInt();
		
		do {
			System.out.println("Player One: Press 'r' to roll your dice!!");
			keyRoll = aScanner.next().charAt(0);
			diceRolled = rollDice(keyRoll);
			
			playerOneRolls += diceRolled;
			
			System.out.println("You rolled "+diceRolled);
			System.out.println();
			
			System.out.println("Player Two: Press 'r' to roll your dice!!");
			keyRoll = aScanner.next().charAt(0);
			diceRolled = rollDice(keyRoll);
			
			playerTwoRolls += diceRolled;
			
			System.out.println("You rolled "+diceRolled);
			
			numberOfGamesLeft--;
			
			System.out.println();
			System.out.println("You have "+numberOfGamesLeft+" games left");
			System.out.println();
			
		}while(numberOfGamesLeft != 0);
		
		if (playerOneRolls > playerTwoRolls) {
			System.out.println("Player One won with a total of "+playerOneRolls+" points");
			System.out.println("while Player Two had "+playerTwoRolls);
		}
		else if(playerTwoRolls > playerOneRolls) {
			System.out.println("Player Two won with a total of "+playerTwoRolls+" points");
			System.out.println("while Player One had "+playerOneRolls);
		}
		
		else {
			System.out.println("Draw!!....");
			System.out.println("You both had "+playerOneRolls+" points");
		}
		
	}

	private static int rollDice(char keyRoll) {
		// TODO Auto-generated method stub
		Random myRandom = new Random();
		int randomNumber = 0;
		
		switch (keyRoll) {
		case 'r':
			randomNumber = 1 + myRandom.nextInt(6);
			break;

		default:
			break;
		}
		return randomNumber;
	}
}