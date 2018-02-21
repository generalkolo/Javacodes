import java.util.Random;
import java.util.Scanner;

public class snakeEyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aScanner = new Scanner(System.in);
		char input;
		Random random = new Random();
		int die1 = 0,die2 = 0,numberOfRolls = 0;
		
		System.out.println("Snake Eyes Dice Game");
		System.out.println();
		
		do {
			System.out.println("Enter 'r' to roll your dice or 0 to quit");
			input = aScanner.next().charAt(0);
			
			if (input == 'r') {
				die1 = 1 + random.nextInt(6);
				die2 = 1 + random.nextInt(6);
				
				System.out.println("You Rolled - ("+die1+" , "+die2+")");
				System.out.println();
				numberOfRolls++;
			} 
			else if (input == '0') {
				break;
			}
			else {
				System.out.println("Wrong input please re-enter");
				System.out.println();
			}
			
		}while(input != 'r' || (die1 != 1 || die2 != 1));
		
		System.out.println();
		
		if (die1 == 1 && die2 == 1) {
			System.out.println("Finally, You rolled "+numberOfRolls+" time(s) to get a snake eye");
		} else {
			System.out.println("No Snake Eye rolled");
		}
	}
}