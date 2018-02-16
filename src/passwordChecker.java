import java.util.Scanner;

public class passwordChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		boolean eightOrMoreCharaters,upperAndLowerCaseLetters,atLeastOneDigit;
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Password Checker 1.0");
		System.out.println();
		System.out.println("Your password must contain the follwing: \nEight or more "
				+ "Characters \nUpper and lower case letters \nAt least one number");
		
		do {
			System.out.println();
			System.out.println("Enter your password_");
			System.out.println("Enter '0' to quit");
			password = myScanner.next();
			
			if (password.equals("0")) {
				System.out.println("You Quit");
				break;
			}
			
			eightOrMoreCharaters = checkeightOrMoreCharaters(password);
			upperAndLowerCaseLetters = checkupperAndLowerCaseLetters(password);
			atLeastOneDigit = checkatLeastOneDigit(password);
						
		}while(!eightOrMoreCharaters || !upperAndLowerCaseLetters || !atLeastOneDigit);
				
	}

	private static boolean checkatLeastOneDigit(String password) {
		// TODO Auto-generated method stub
		for(int counter = 0; counter < password.length(); counter++) {
			if (Character.isDigit(password.charAt(counter))) {
				return true;
			}
		}
		System.out.println("Error: Password must contain one (1) or more Digits");
		return false;
	}

	private static boolean checkupperAndLowerCaseLetters(String password) {
		// TODO Auto-generated method stub
		for(int counter = 0; counter < password.length(); counter++) {
			
			if (Character.isLowerCase(password.charAt(counter)) || Character.isUpperCase(password.charAt(counter))){
				if (Character.isUpperCase(password.charAt(counter))  ||  Character.isLowerCase(password.charAt(counter))) {
					return true;
				}
			}
			
		}
		System.out.println("Error: Password must contain Lower and Upper case letters");
		
		return false;
	}

	private static boolean checkeightOrMoreCharaters(String password) {
		// TODO Auto-generated method stub
		if (password.length() < 8 ) {
			System.out.println("Error: Password must be more than eight(8) characters"); 
			return false;	
		}
		
		return true;
	}
}