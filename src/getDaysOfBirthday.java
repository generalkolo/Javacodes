import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class getDaysOfBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		   
		        System.out.println("Enter your DOB in the format 09 JANUARY/JAN 1990");
		        
		        System.out.println("Enter your date of birth i.e 21 or 11");
		        int day = sc.nextInt();
		        
		        System.out.println("Enter your month of birth i.e OCT or OCTOBER");
		        String month = sc.next();
		        
		        System.out.println("Enter your year of birth i.e 1990");
		        int year = sc.nextInt();
		 
		        if (checkValidity(day,month,year)) {
		        	String validMonth = formatInput(month);
		        	
		        	System.out.println("Enter the end year that you want your days of birthday celebrated");
				    int endyear = sc.nextInt();
		        	
		        	month = getNumericalMonth(validMonth);
		        	
		        	int realMonth = Integer.parseInt(month);
		            
		            showDaysOfBirthDay(year,endyear,realMonth,validMonth,day);         
		            
				} else {
					displayValidInput();
		       sc.close();
				}
		    }

			private static void showDaysOfBirthDay(int year, int endyear, int realMonth, String validMonth, int day) {
				// TODO Auto-generated method stub
				
				int currentYear = Calendar.getInstance().get(Calendar.YEAR);
				int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
				
				System.out.println();
				System.out.println("Below are the days your birthdays were / will be celebrated ");
				System.out.println("-----------------------------------------------------------------");
				
				GregorianCalendar birthDay = new GregorianCalendar();
		        		
				for(int i = year;i <= endyear; i++) {
					
					birthDay.set(i, realMonth,day);
			        
			        int weekDay = birthDay.get(GregorianCalendar.DAY_OF_WEEK);
			        
			        String weekday = getWeekDayOfBirth(weekDay);
		            
			        String tense = (currentYear >= i) ? "you celebrated your birthday": "you will be celebrating your birthday";
			    
		            System.out.println("In "+i +" "+tense + " on "+weekday);
				}
				
				String tense = (currentYear >= endyear &&  realMonth < currentMonth ) ? "you were": "you will be";
			
				System.out.println("By "+endyear+" "+tense+" "+(endyear - year)+" years old!");
			}

			private static String getWeekDayOfBirth(int weekDay) {
				// TODO Auto-generated method stub
				
				String weekday = String.valueOf(weekDay - 1);
				
				 weekday = weekday.replace("0", "SUNDAY");
		         weekday = weekday.replace("1", "MONDAY");
		         weekday = weekday.replace("2", "TUESDAY");
		         weekday = weekday.replace("3", "WEDNESDAY");
		         weekday = weekday.replace("4", "THURSDAY");
		         weekday = weekday.replace("5", "FRIDAY");
		         weekday = weekday.replace("6", "SATURDAY");
				
				return weekday;
			}
			
			private static void displayValidInput() {
				// TODO Auto-generated method stub
				
				Scanner aScanner = new Scanner(System.in);
				
				System.out.println();
				System.out.println("Entry must be in this format DD MMM YYYY");
				System.out.println("e.g 09 OCT 1990");
				System.out.println();
				
				System.out.println("Enter 1 for valid entry of months or 0 to quit");
				
				char reply = aScanner.next().charAt(0);
				
				if (reply == '1') {
					showValidMonthEntry();
				} else {
					System.exit(1);
				}
				aScanner.close();
			}

			private static void showValidMonthEntry() {
				// TODO Auto-generated method stub
				System.out.println("Valid Month Entry");
				System.out.println("---------------------------------------");
				System.out.println("JAN/JANUARY \nFEB/FEBRUARY \nMAR/MARCH \nAPR/APRIL \nMAY \nJUN/JUNE \nJUL/JULY"
						+ "\nAUG/AUGUST \nSEP/SEPTEMBER \nOCT/OCTOBER \nNOV/NOVEMBER \nDEC/DECEMBER");
			}

			private static String getNumericalMonth(String validMonth) {
				// TODO Auto-generated method stub
				String numbericalMonth = "";
			
				switch (validMonth) {
				case "JANUARY":
					numbericalMonth = "0";
					break;
				case "FEBRUARY":
					numbericalMonth = "1";
					break;
				case "MARCH":
					numbericalMonth = "2";
					break;
				case "APRIL":
					numbericalMonth = "3";
					break;
				case "MAY":
					numbericalMonth = "4";
					break;
				case "JUNE":
					numbericalMonth = "5";
					break;
				case "JULY":
					numbericalMonth = "6";
					break;
				case "AUGUST":
					numbericalMonth = "7";
					break;
				case "SEPTEMBER":
					numbericalMonth = "8";
					break;
				case "OCTOBER":
					numbericalMonth = "9";
					break;
				case "NOVEMBER":
					numbericalMonth = "10";
					break;
				case "DECEMBER":
					numbericalMonth = "11";
					break;
				}
				return numbericalMonth;
			}

			private static String formatInput(String month) {
				// TODO Auto-generated method stub
				String output = month;
				
				switch (output.toUpperCase()) {
				case "JAN":
					output = "JANUARY";
					break;
				case "FEB":
					output = "FEBRUARY";
					break;
				case "MAR":
					output = "MARCH";
					break;
				case "APR":
					output = "APRIL";
					break;
				case "MAY":
					output = "MAY";
					break;
				case "JUN":
					output = "JUNE";
					break;
				case "JUL":
					output = "JUL";
					break;
				case "AUG":
					output = "AUGUST";
					break;
				case "SEP":
					output = "SEPTEMBER";
					break;
				case "OCT":
					output = "OCTOBER";
					break;
				case "NOV":
					output = "NOVEMBER";
					break;
				case "DEC":
					output = "DECEMBER";
					break;
				}
				return output;
			}

			private static boolean checkValidity(int day, String month, int year) {
				// TODO Auto-generated method stub
				
				int currentYear = Calendar.getInstance().get(Calendar.YEAR);
				
				if (day < 0 || day > 31) {
					System.out.println(day+" DAY cannot be less than 1 or greater than 31");
					return false;
				}
				if (!ValidateMonth(month , day , year)) {
					return false;
				}
				if ((year < 0 || year > currentYear)) {
					System.out.println(year+" YEAR cannot be less than 1 or greater than current year :"+currentYear);
					return false;
				}
				
				return true;
			}

			private static boolean ValidateMonth(String month, int day , int year) {
				// TODO Auto-generated method stub
				switch (month.toUpperCase()) {
				case "JAN":
				case "JANUARY":
				case "MAR":
				case "MARCH":
				case "MAY":
				case "JUL":
				case "JULY":
				case "AUG":
				case "AUGUST":
				case "OCT":
				case "OCTOBER":
				case "DEC":
				case "DECEMBER":
				if (day > 31) {
					System.out.println("JANUARY MARCH MAY JULY AUGUST OCTOBER and DECEMBER can't have more than 31 Days");
					return false;
				}
				
					
				case "FEB":
				case "FEBUARY":
				if ((year % 4 == 0) || (year % 400 == 0) && (year %100 != 0)) {
					if (day > 29) {
						System.out.println(year+" is a leap year and hence cant have more than 29 days");
						return false;
					}
				}
				else if (day > 28) {
					System.out.println(year+" is not a leap year and hence cant have more than 28 days");
					return false;
				}
				
				case "APR":
				case "APRIL":
				case "JUN":
				case "JUNE":
				case "SEP":
				case "SEPTEMEBR":
				case "NOV":
				case "NOVEMBER":
				if (day > 30) {
					System.out.println("SEPTEMBER APRIL JUNE and NOVMBER can't have more than 30 Days");
					return false;
					}
				}
				return true;
		}
}