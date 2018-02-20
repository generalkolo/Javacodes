import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		String input = myScanner.nextLine();
		
		System.out.println(displayWords(input));
	}

	private static boolean displayWords(String input) {
		String[] actualWords = {"I","am","he","who","knows","all"};
		// TODO Auto-generated method stub
		String[] words = input.split(" ");
		for(int counter = 0; counter < actualWords.length;counter++) {
			if (!Arrays.equals(words, actualWords)) {
				return false;
			}
		}
		return true;
	}
}