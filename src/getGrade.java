import java.util.Scanner;

public class getGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your score ");
		score = scanner.nextInt();
		
		System.out.println("Your grade is "+getGardeMethod(score));
		
	}
	
	//char = 'A' 'B' 'C' 'D'
	public static char getGardeMethod(int inputedScore) {
		if (inputedScore >= 70) {
			return 'A';
		}
		
		if (inputedScore >=60 && inputedScore <=69) {
			return 'B';
		}
		
		if (inputedScore >=50 && inputedScore <=59) {
			return 'C';
		}
		if (inputedScore >=40 && inputedScore <=49) {
			return 'D';
		}
		
		else {
			return 'F';
		}
	}
}