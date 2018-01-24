import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[]  args) {
		int numberOne;
		int randomNumber;
		int counter = 5;
		
		Random myRandom = new Random();
		Scanner myScanner = new Scanner(System.in);
		
		do {
			randomNumber = 1 + myRandom.nextInt(6);
			System.out.println("Guess my Random number to win $1,000");
			
			System.out.println("Enter 0 to quit the game.");
			
			numberOne = myScanner.nextInt();
			
			if(numberOne == randomNumber) {
				System.out.println("Congratulations you won $1,000");
				break;
			}
			else {
				System.out.println("My random Number was "+randomNumber);
				System.out.println("You have "+counter+" more chance(s)");
				counter--;
			}
			
		}while(numberOne != 0 && counter>-1);
		
		System.out.println("GAME OVER!");
		
	}
}
