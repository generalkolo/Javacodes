import java.util.Scanner;

/**
 * 
 */

/**
 * @author GeneralKolo
 *
 */
public class examMarker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aScanner = new Scanner(System.in);
		int correctAnswers = 0;
		String studentName;
		
		System.out.print("Enter your name: ");
		studentName = aScanner.nextLine();
		
		String[] questions = {"20 % of 2 is equal to?",
				"A school committee consists of 2 teachers and 4 students. The number of different committees \r\n" + 
				"that can be formed from 5 teachers and 10 students is ?",
				"The exam scores of all 500 students were recorded and it was determined that these scores were normally distributed. If Jane's score is 0.8 standard deviation above the mean, \r\n" + 
				"then how many, to the nearest unit, students scored above Jane?",
				"What is 2 + 18 ?",
				"The population of a country increased by an average of 2% per year from 2000 to 2003. If the population of this country was 2 000 000 on December 31, 2003, then the population \r\n" + 
				"of this country on January 1, 2000, to the nearest thousand would have been?"
		};
		
		int[] answers = {(int)0.2,2100,106,20,1846000};
		
		int[] enteredAnswers = new int[answers.length];
		
		for(int counter = 0;counter < questions.length;counter++) {
			System.out.println(questions[counter]);
			
			enteredAnswers[counter] = aScanner.nextInt();
		}
		
		System.out.println("Below are the statistic of your Test");
		System.out.println();
		System.out.println("Corrections:");
		System.out.println("------------------------------------------------------");
		for(int i = 0; i < enteredAnswers.length;i++) {
			if(enteredAnswers[i] == answers[i]) {
				correctAnswers++;
			}
			else {
				System.out.println();
				System.out.println("The answer to "+questions[i]+" is "+answers[i]);
			}
		}
		System.out.println();
		System.out.println(studentName+" You got "+correctAnswers+" question(s) out of "+questions.length);
	}

}