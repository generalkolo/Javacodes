import java.util.Random;
import java.util.Scanner;

public class TwoPlayerGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random myRandom = new Random();
		
		
		int playerOneGuess,playerTwoGuess;
		int random;
		int counter = 3;
		int playerOneCounter = 0;
		int playerTwoCounter = 0;
		int draws = 0;
		String playerOneName = "";
		String playerTwoName = "";
		
		System.out.println("Player One, Enter your name ");
		playerOneName = scanner.next();
		
		System.out.println("Player Two, Enter your name ");
		playerTwoName = scanner.next();
		
		do {
			System.out.println("--------------------------------------");
			random = 1 + myRandom.nextInt(10);
			
			System.out.println(random);
			
			System.out.println("Lucky Number Guessing Game for a $1000");
			System.out.println();
			
			System.out.println("Enter your guess Number "+playerOneName);
			playerOneGuess = scanner.nextInt();
			
			System.out.println("Your turn "+playerTwoName+ " enter your guess number");
			playerTwoGuess = scanner.nextInt();
			
			if (playerOneGuess == random && playerTwoGuess == random) {
				System.out.println("You both got it...DRAW!");
				counter--;
				draws++;
				System.out.println("You have "+counter+" game(s) left");
			}
			else if(playerOneGuess == random) {
				playerOneCounter++;
				System.out.println("Correct! "+playerOneName+" You Guessed right");
				counter--;
				System.out.println("You have "+counter+" game(s) left");
			}
			else if(playerTwoGuess == random) {
				playerTwoCounter++;
				System.out.println("Correct! "+playerTwoName+" You Guessed right");
				counter--;
				System.out.println("You have "+counter+" game(s) left");
			}
			else {
				counter--;
				System.out.println("My Random Number was :"+random);
				System.out.println("You have "+counter+" game(s) left");
			}
			
		}while(counter!=0);
		
		System.out.println();
		
		System.out.println("Statistic -------------------------------");
		
		System.out.println(playerOneName+" WON "+playerOneCounter+" GAMES!");
		System.out.println(playerTwoName+" WON "+playerTwoCounter+" GAMES!");
		System.out.println("DRAWS - "+draws);
		
		System.out.println();
		
		if (playerOneCounter > playerTwoCounter) {
			System.out.println("Congratulatons to you "+playerOneName+"! You Win");
		} 
		else if(playerOneCounter < playerTwoCounter) {
			System.out.println("Congratulatons to you "+playerTwoName+"! You Win");
		}
		else {
			System.out.println("It was a Draw!");
		}
	}
}
