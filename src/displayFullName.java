import java.util.Scanner;

public class displayFullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName,lastName,fullNameGotten;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		
		firstName = scanner.next();
		
		System.out.println("Enter Last Name");
		
		lastName = scanner.next();
		
		fullNameGotten = getFullName(firstName,lastName);
		
		System.out.println("Your full name is "+fullNameGotten);
		
	}
	
	public static String getFullName(String firstNameEntered, String lastNameEntered) {
		
		String fullname = firstNameEntered + " "+lastNameEntered;
		
		return fullname;
	}
}