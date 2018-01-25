import java.util.Scanner;

public class ReturnStatementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne,numberTwo;
		
		int result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		
		numberOne = scanner.nextInt();
		
		System.out.println("Enter Second Number");
		
		numberTwo = scanner.nextInt();
		
		result = getAddition(numberOne, numberTwo);
		
		System.out.println("The Multiplication Result is "+getMultiplication(numberOne, numberTwo));
		
		System.out.println("The Maximum Number is "+getMaximum(numberOne, numberTwo));
		
		System.out.println("The Minimum Number is "+getMinimum(numberOne, numberTwo));
		
		System.out.println("The Addition Result is "+result);
			
	}	
	
	public static int getMultiplication(int userInputOne,int userInputTwo) {
		
		int result = userInputOne * userInputTwo;
		
		return result;
	}
	
	public static int getMaximum(int userInputOne,int userInputTwo) {
		
		if(userInputOne > userInputTwo) {
			return userInputOne;
		}
		else {
			return userInputTwo;
		}
	}
	
	public static int getMinimum(int userInputOne,int userInputTwo) {
		
		if(userInputOne < userInputTwo) {
			return userInputOne;
		}
		else {
			return userInputTwo;
		}
	}
	
	public static int getAddition(int userInputOne,int userInputTwo) {
		return userInputOne + userInputTwo;
	}
	
	
	
}