import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("How long would you want the password to be?");
		
		int length = aScanner.nextInt();
		
		System.out.println("Your Password is :");
		
		System.out.println(generatePassword(length));
		
		aScanner.close();
	}

	private static String generatePassword(int length) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String symbols = "!@#$%^&*()?/|";
		
		StringBuilder passwordLetters = new StringBuilder();
		
		passwordLetters.append(capitalLetters+smallLetters+symbols);
		
		StringBuilder password = new StringBuilder();
		
		for(int counter = 0; counter < length; counter++) {
			password.append(passwordLetters.charAt(random.nextInt(passwordLetters.length())));
		}
		
		return password.toString();
	}

}