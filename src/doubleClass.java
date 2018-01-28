import java.util.Scanner;

public class doubleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double aDouble;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a Double Value ");
		
		aDouble = scanner.nextDouble();
		
		/*System.out.println("The maximum value of a Double is "+Double.MAX_VALUE);
		
		System.out.println("The minimum value of a Double is "+Double.MIN_VALUE);
		
		System.out.println("The bits taken my a Double variable is "+Double.SIZE+" bits");*/
		
		System.out.println("The Hex String Value of "+aDouble+" is "+Double.toHexString(aDouble));
	}
}