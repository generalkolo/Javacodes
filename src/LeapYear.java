import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 0, month = 0;
		Scanner aScanner = new Scanner(System.in);
		String monthName = "";
		int NumberOfDays = 0;
		boolean isLeapYear = false;

		System.out.println("Enter a year ");
		year = aScanner.nextInt();
		
		System.out.println("Enter a month ");
		month = aScanner.nextInt();
		if ((year % 4 == 0) || (year % 400 == 0) && (year %100 != 0)) {
			isLeapYear = true;
		}
		else {
			isLeapYear = false;
		}
		
		switch (month) {
		case 1:
			monthName = "January";
			NumberOfDays = 31;
			break;
		case 2:
			monthName = "February";
			if (isLeapYear) {
				NumberOfDays = 29;
			}
			else {
				NumberOfDays = 28;
			}
			break;
		case 3:
			monthName = "March";
			NumberOfDays = 31;
	
			break;
		case 4:
			monthName = "April";
			NumberOfDays = 30;
			
			break;
		case 5:
			monthName = "May";
			NumberOfDays = 31;
	
			break;
		case 6:
			monthName = "June";
			NumberOfDays = 30;
	
			break;
		case 7:
			monthName = "July";
			NumberOfDays = 31;
	
			break;
		case 8:
			monthName = "August";
			NumberOfDays = 31;
			break;
		case 9:
			monthName = "September";
			NumberOfDays = 30;
	
			break;
		case 10:
			monthName = "October";
			NumberOfDays = 31;
	
			break;
		case 11:
			monthName = "Novemember";
			NumberOfDays = 30;
			break;
		case 12:
			monthName = "December";
			NumberOfDays = 31;
			break;

		default:
			System.out.println("Month Value not within 1 -12 ");
			break;
		}
		
		System.out.println(monthName+" "+year+" has "+NumberOfDays+" Days");
		System.out.println();
		System.out.println(year+" is a leap year ? "+isLeapYear);
	}
}