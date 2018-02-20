import java.util.Arrays;
import java.util.Scanner;

public class enterSameInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		
		String[] actualWords;
		String[] enteredWords;
		
			String pharse = "boy girl man woman guy lady";
			String exactpharse;
			
			System.out.println("This is your secret phrase - \""+pharse+"\"");
			
			System.out.println();
			System.out.println("Enter the exact same string");
			exactpharse = aScanner.nextLine();
			
			actualWords = pharse.split(" ");
			
			enteredWords = exactpharse.split(" ");
			
			if (Arrays.equals(enteredWords, actualWords)) {
				System.out.println();
				System.out.println("Input Match Phrase! Congratulations");
			}
			else {
				System.out.println("Input don't Match Phrase!");
			}
			
	}
}