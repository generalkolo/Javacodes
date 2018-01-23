import java.util.Scanner;

public class SwitchStatement {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int check;	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any Number from 1 - 7 and I will guess if it is a weekday or weekend! ");
		check = scanner.nextInt();
		
		System.out.println("Before the Switch Statement");
		
		switch (check) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("You entered a WeekDay");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("You entered WeekEnd");
			break;
		default:
			System.out.println("Not within the range of 1 - 7");
			break;
		}
		
		System.out.println("After the Switch Statement");
	}
}