import java.util.Scanner;

public class rangeTimeTableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		char reply;
		int singleMul = 0,startNumber = 0,endNumber = 0, multiplicationLimit = 0;
		
		System.out.println("Enter S for single multiplicatio table and M for multiple multiplication table");
		reply = aScanner.next().charAt(0);
		
		switch(reply) {
		
		case 'S':
			System.out.println("Enter a single number for its multiplication table");;
			singleMul = aScanner.nextInt();
			System.out.println("Enter multiplication limit");;
			multiplicationLimit = aScanner.nextInt();
			displaySingleMultipliationTable(singleMul, multiplicationLimit);
			break;
			
		case 'M':
			System.out.println("Enter the start number");;
			startNumber = aScanner.nextInt();
			System.out.println("Enter the end number");;
			endNumber = aScanner.nextInt();
			System.out.println("Enter multiplication limit");;
			multiplicationLimit = aScanner.nextInt();
			displayMultipleMultipliationTable(startNumber,endNumber,multiplicationLimit);
			break;
		default:
			System.out.println("Input not Valid");
				break;
		}
	}
	
	public static void displaySingleMultipliationTable(int number, int multiplicationLimit) {
		for(int i = number;i <=number; i++) {
			System.out.println();
			System.out.println("The Multiplication table for "+i);
			System.out.println("---------------------------------------");
			for(int j = 1 ; j <= multiplicationLimit; j++) {
				System.out.println(i+" X "+j +" = "+i*j);
			}
		}
	}
	
	public static void displayMultipleMultipliationTable(int startNumber, int endNumeber, int multiplicationLimit) {
		for(int i = startNumber;i <= endNumeber; i++) {
			System.out.println();
			System.out.println("The Multiplication table for "+i);
			System.out.println("---------------------------------------");
			for(int j = 1 ; j <= multiplicationLimit; j++) {
				System.out.println(i+" X "+j +" = "+i*j);
			}
		}
	}
}
