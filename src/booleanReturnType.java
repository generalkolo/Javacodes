import java.util.Scanner;

public class booleanReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check for Prime ");
		
		number = scanner.nextInt();
		
		System.out.println("Is "+number+" a prime number? "+checkPrime(number));
	}
	
	public static boolean checkPrime(int numberInputted) {
		int temp;
	
		for(int check = 2;check <= numberInputted/2;check++) {
			temp = numberInputted % check;
			
			if (temp == 0) {
				System.out.println(numberInputted+" is divisible by "+check);
				return false;
			}
		}
		return true;
	}
}