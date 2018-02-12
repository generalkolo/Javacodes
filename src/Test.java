import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("Enter text to be encrypted using Ceasar Cypher___");
	
//		String message = aScanner.nextLine();
		
		String message = "abcdefghijklmnopqrstuvwxyz";
		
//		System.out.println("Encrypted String : "+decryptData(message, 5));
		
		System.out.println("Encrypted String : "+(26+-5));
	}
	
	public static String encryptData(String plainText, int shiftKey) {
		final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
		
		plainText = plainText.toLowerCase();
		StringBuilder toBeDisplayed = new StringBuilder();
		for (int i = 0; i < plainText.length(); i++) {
						
			if(!Character.isLetter(plainText.charAt(i))) {
					toBeDisplayed.append(plainText.charAt(i));
				}
			else {
				int charPosition = ALPHABETS.indexOf(plainText.charAt(i));
				
				int keyValue = (shiftKey + charPosition) % 26;
				char replaceValue = ALPHABETS.charAt(keyValue);
				toBeDisplayed.append(replaceValue);
			}
			
		}
		return toBeDisplayed.toString();
	}
	
	public static String decryptData(String plainText, int shiftKey) {
		final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
		
		plainText = plainText.toLowerCase();
		StringBuilder toBeDisplayed = new StringBuilder();
		for (int i = 0; i < plainText.length(); i++) {
						
			if(!Character.isLetter(plainText.charAt(i))) {
					toBeDisplayed.append(plainText.charAt(i));
				}
			else {
				int charPosition = ALPHABETS.indexOf(plainText.charAt(i));
				
				int keyValue = (charPosition - shiftKey) % 26;
				
				if (keyValue < 0) {
					keyValue = ALPHABETS.length() + keyValue;
				}
				char replaceValue = ALPHABETS.charAt(keyValue);
				toBeDisplayed.append(replaceValue);
			}
			
		}
		return toBeDisplayed.toString();
	}
	
	
}