import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet;
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("Please enter an alphaet" );
		 alphabet = aScanner.next().toLowerCase();
		 
		 boolean upperCaseAplhabet = alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90;
		 boolean lowerCaseAplhabet = alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122;
		 
		 boolean vowelAlphabet = alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i")
				 || alphabet.equals("o") || alphabet.equals("u");
		 
		 if (vowelAlphabet) {
			 System.out.println("You enetered a vowel");			
		}
		 else if (!(upperCaseAplhabet || lowerCaseAplhabet )) {
			 System.out.println("You neither entered a lower case or an upper case alphabet.");
		}
		 else {
			 System.out.println("You entered a consonant");
		 }
		 
	}
}