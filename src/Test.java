import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		int playerOneRolls = 0,playerTwoRolls = 0,numberOfGames;
		char rollDice;
		numberOfGames = 2;
		
		do {
			System.out.println("Player One: \npress 'r' to roll your dice!!!");
			rollDice = myScanner.nextLine().charAt(0);
			
			playerOneRolls+=rollDice(rollDice);
			
			System.out.println("You rolled "+rollDice(rollDice));
			System.out.println();
			
			System.out.println("Player Two: \npress 'r' to roll your dice!!!");
			rollDice = myScanner.nextLine().charAt(0);
			
			playerTwoRolls+=rollDice(rollDice);
			
			System.out.println("You rolled "+rollDice(rollDice));
			
			numberOfGames--;
			
			System.out.println();
			System.out.println("Number of games left "+numberOfGames);
			System.out.println();
			
		}while(numberOfGames != 0);
		
		System.out.println(playerOneRolls+" Player One rollings "+playerTwoRolls+" player Two rollings");
		
		if (playerOneRolls > playerTwoRolls) {
			System.out.println("Player One wins!! Congratulations");
		}
		else if (playerTwoRolls > playerOneRolls) {
			System.out.println("Player Two wins!! Congratulations");
		}
		else {
			System.out.println("Its a draw!! Awww");
		}
		
		myScanner.close();
	}

	private static int rollDice(char rollDice) {
		Random myRandom = new Random();
		int randomNumber1 = 0;
		
		// TODO Auto-generated method stub
		switch (rollDice) {
		case 'r':
			randomNumber1 = 1 + myRandom.nextInt(6);
			break;
		default:
			do {
				
			}while(rollDice != 'r');
			System.out.println("Wrong input entered!!");
		}
		return randomNumber1;
	}	
}