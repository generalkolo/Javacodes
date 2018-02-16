import java.util.Scanner;

public class StringDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String enetredInput;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter a Sentence _ ");
		enetredInput = myScanner.nextLine();
		
		displayCountOfVowelsAndConsonants(enetredInput);
	}

	private static void displayCountOfVowelsAndConsonants(String enetredInput) {
		// TODO Auto-generated method stub
		int vowels = 0,consonants = 0,whiteSpaces = 0,digits = 0;
		enetredInput = enetredInput.toLowerCase();
		
		for(int counter = 0;counter < enetredInput.length(); counter++) {
			if (enetredInput.charAt(counter) == 'a' || enetredInput.charAt(counter) == 'e' || enetredInput.charAt(counter) == 'i' ||
					enetredInput.charAt(counter) == 'o' || enetredInput.charAt(counter) == 'u') {
				vowels++;
			}
			else if (Character.isWhitespace(enetredInput.charAt(counter))) {
				whiteSpaces++;
			}
			else if (Character.isDigit(enetredInput.charAt(counter))) {
				digits++;
			}
			else {
				consonants++;
			}
		}
		
		System.out.println("You entered "+enetredInput.length()+" characters .");
		System.out.println(+vowels+ " vowels ");
		System.out.println(+consonants+ " consonants ");
		System.out.println(+whiteSpaces+ " white spaces ");
		System.out.println(+digits+ " Digits");
		
	}
}