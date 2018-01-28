import java.util.Scanner;

public class doubleClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double aDouble;
		Double bDouble;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a Double Value ");
		aDouble = scanner.nextDouble();
		
		System.out.println("Please enter another Double Value ");
		bDouble = scanner.nextDouble();
		
		System.out.println("IS "+aDouble+" equal to "+bDouble+" ? "+aDouble.equals(bDouble));
		
		//-1 means than aDouble is less than bDouble
		//0 means that aDouble is equal to bDouble
		//1 means that aDouble is greater to bDouble
		
		int answer = Double.compare(aDouble, bDouble);
		
		switch (answer) {
		case 1:
			System.out.println(aDouble+" is greater than "+bDouble);
			break;
		case 0:
			System.out.println(aDouble+" is equal to "+bDouble);
			break;
		case -1:
			System.out.println(aDouble+" is less than "+bDouble);
			break;
		}
	}
}