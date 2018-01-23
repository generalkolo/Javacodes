import java.text.BreakIterator;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

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
		
		/*if(check == 1) {
			System.out.println("Monday");
		}
		if(check == 2) {
			System.out.println("Tuesday");
		}
		if(check == 3) {
			System.out.println("Wednesday");
		}
		if(check == 4) {
			System.out.println("Thursday");
		}
		if(check == 5) {
			System.out.println("Friday");
		}
		if(check == 6) {
			System.out.println("Saturdday");
		}
		if(check == 7) {
			System.out.println("Sunday");
		}*/
	}
}