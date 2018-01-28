import java.util.Scanner;

public class IntegerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer integer = new Integer(50);
		
		/*System.out.println("The Maximum Value for an Integer is "+Integer.MAX_VALUE);
		
		System.out.println("The Minimum Value for an Integer is "+Integer.MIN_VALUE);*/
		
		Integer aInteger;
		Integer bInteger;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Integer Value ");
		aInteger = scanner.nextInt();
		
		System.out.println("Enter another Integer Value ");
		bInteger = scanner.nextInt();
		
		System.out.println("Is "+aInteger+" equal to "+bInteger+ " ? "+aInteger.equals(bInteger));
		
		//.compareTo Key
		//-1 is lesser
		//0 the same
		//1 is greater
		
		if(aInteger.compareTo(bInteger) == -1) {
			System.out.println(aInteger+" is lesser than "+bInteger);
		}
		if(aInteger.compareTo(bInteger) == 0) {
			System.out.println(aInteger+" is the same as "+bInteger);
		}
		if(aInteger.compareTo(bInteger) == 1) {
			System.out.println(aInteger+" is greter than "+bInteger);
		}
		else {
			System.out.println(bInteger+" is greter than "+aInteger);
		}
	}
}