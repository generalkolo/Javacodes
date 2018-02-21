import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int enteredAnswers;
		int correctAnswers = 0;
		String nameOfStd;
		
		System.out.println("Please Enter your name _");
		nameOfStd = aScanner.nextLine();
		
		String[] questions = {"What is the addition of 2 + 18 ?",
				"What is the mean of 2,5,9,18 ?",
				"If I Substract 8 from 30 what do I have left ?",
				"Write some more exam Questions ?",
				"What can i still write ?",
				"Black and Black come together to form ?"
		};
		
		int[] answers = {3,8,15,30,18,29};
		int[] enteredAnswer = new int[answers.length];
		
		for(int i = 0; i < questions.length;i++) {
			System.out.println(questions[i]);
			enteredAnswer[i] = aScanner.nextInt();
		}
		
		for(int counter = 0; counter < answers.length; counter++) {
			if (enteredAnswer[counter] == answers[counter]) {
				correctAnswers++;
			}
		}
		
		System.out.println();
		System.out.println(nameOfStd+", You Got "+correctAnswers+" questions out of "+answers.length);
		
	}
}