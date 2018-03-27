import java.util.Scanner;

public class AutoMorphic {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean isAutoMorphic;
        
        System.out.println("WELCOME TO AUTOMORPHIC NUMBER APP V1.0");
        System.out.println();
        System.out.println("ENTER \n1 to check if a number is autoMorphic, \n2 to display a range of "
        + "automorphic numbers from 1 to N and \n3 to display automorphic numbers in a given range"
        + "\n4 to display N numbers of auto morphic numbers");
        int choice = sc.nextInt();
        switch (choice) {
		case 1:
			System.out.println("Enter number : ");
			number = sc.nextInt();
			isAutoMorphic = checkAutoMorphicNumber(number);
			print("Is "+number+" auto morphic ? "+isAutoMorphic);
			break;
		case 2:
			System.out.println("Enter End Number : ");
			number = sc.nextInt();
			if (number < 0 || number == 1) {
				print("End number cannot be less than 0 or be 1");
			}
			displayAutomorphicNumbers(1,number);
			break;
		case 3:
			print("Enter start Number : ");
			number = sc.nextInt();
			print("Enter End Number : ");
			int endNumber = sc.nextInt();
			displayAutomorphicNumbers(number, endNumber);
			break;
		case 4:
			print("How many auto morphic numbers would you want to be displayed");
			number = sc.nextInt();
			displayAutomorphicNumbers(number);
			break;
		default:
			print(choice+ " is a wrong entry. Valid entries - 1,2,3");
			break;
		}
        sc.close();
	}

	private static void displayAutoMorphs(int number) {
		// TODO Auto-generated method stub
		int counter = 0;
		while(counter < number) {
			displayAutomorphicNumbers(1, 1000000);
		}
	}

	private static void print(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
	private static boolean checkAutoMorphicNumber(int numberToCheck) {
		// TODO Auto-generated method stub
		String number = String.valueOf(numberToCheck);
		String answer = String.valueOf((int)Math.pow(numberToCheck,2));
		boolean yes = false;
		
		switch (number.length()) {
		case 1:
			if (answer.substring(answer.length() - 1).equals(number)) {
				yes = true;
			}
			break;
		case 2:
			if (answer.substring(answer.length() - 2).equals(number)) {
				yes = true;
			}
			break;
		case 3:
			if (answer.substring(answer.length() - 3).equals(number)) {
				yes = true;
			}
			break;
		case 4:
			if (answer.substring(answer.length() - 4).equals(number)) {
				yes = true;
			}
			break;
		case 5:
			if (answer.substring(answer.length() - 5).equals(number)) {
				yes = true;
			}
			break;
		case 6:
			if (answer.substring(answer.length() - 6).equals(number)) {
				yes = true;
			}
			break;
		case 7:
			if (answer.substring(answer.length() - 7).equals(number)) {
				yes = true;
			}
			break;
		}
		return yes;
	}

	private static void displayAutomorphicNumbers(int startNumber,int endNumber) {
		// TODO Auto-generated method stub
		int counter = 0;
		for(int i= startNumber; i <= endNumber; i++) {
			if (checkAutoMorphicNumber(i)) {
				System.out.println(i+" is auto Morphic");
				counter++;
			}
		}
		print("There are "+counter+" auto Morphic numbers between "+startNumber+" and "+endNumber);
	}
	
	private static void displayAutomorphicNumbers(int range) {
		// TODO Auto-generated method stub
		int counter = 0;
			for(int i= 1; i <= 100000000; i++) {
				if (checkAutoMorphicNumber(i)) {
					System.out.println(i+" is auto Morphic");
					counter++;
				}
				if (counter == range) {
					break;
				}
			}
	}
}
