import java.util.Scanner;

public class IntegerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer aInteger;
		Integer bInteger;
		Integer cInteger;
		String aString;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter an Integer Value ");
		aInteger = scanner.nextInt();
		
		System.out.println("Please enter another Integer Value ");
		bInteger = scanner.nextInt();
		
		System.out.println("Please a numerical String Value ");
		cInteger = Integer.parseInt(scanner.next());
		
//		cInteger = Integer.parseInt(aString);
		
		System.out.println("The Hexadecimal value of "+aInteger+" is "+Integer.toHexString(aInteger));
		
		System.out.println("The Binary value of "+aInteger+" is "+Integer.toBinaryString(aInteger));
		
		System.out.println("The Maximum entered value is "+Integer.max(aInteger, bInteger));
		
		System.out.println("The Minimum entered value is "+Integer.min(aInteger, bInteger));
		
		System.out.println("The Value of cInteger is "+cInteger);
	}
}