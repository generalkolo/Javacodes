import java.util.Scanner;

public class TwinPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int numberRange,startNumber,endNumber;
		char key;
		
		System.out.println("Enter 's' for single range or 'm' for multiple range");
		key = aScanner.next().charAt(0);
		
		switch (key) {
		case 's':
			System.out.println("Please enter an end number for the calculation  of twin prime");
			numberRange = aScanner.nextInt();
			
			showTwinPrimeNumbers(numberRange);
			break;
		case 'm':
			System.out.println("Please enter start range");
			startNumber = aScanner.nextInt();
			
			System.out.println("Please enter end range");
			endNumber = aScanner.nextInt();
			
			showTwinPrimeNumbers(startNumber,endNumber);
			break;
		default:
			System.out.println("Invalid key entered");
			break;
		}
	}
	
	private static void showTwinPrimeNumbers(int number) {
		int primeOccurance = 0;
		for(int counter = 1;counter<=number;counter++) {
			if (checkPrime(counter) && checkPrime(counter + 2)) {
				primeOccurance++;
				System.out.println("("+counter+","+(counter + 2) +")");
			}
		}
		System.out.println(primeOccurance+" twin prime numbers exist between 1 and "+number);
	}
	
	private static void showTwinPrimeNumbers(int startNumber,int endNumber) {
		int primeOccurance = 0;
		for(int counter = startNumber;counter<=(endNumber - 2);counter++) {
			if (checkPrime(counter) && checkPrime(counter + 2)) {
				System.out.println("("+counter+","+(counter + 2) +")");
				primeOccurance++;
			}
		}
		System.out.println(primeOccurance+" twin prime numbers exist between "+startNumber+" and "+endNumber);
	}
	
	
	public static boolean checkPrime(int numberInputted) {
		int temp;
	
		for(int check = 2;check <= numberInputted/2;check++) {
			temp = numberInputted % check;
			
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}
}