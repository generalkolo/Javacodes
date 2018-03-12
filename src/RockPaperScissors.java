import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("Please enter: rock, scissors or paper");
		System.out.println("or r , s , p");
		
		String userChoice = aScanner.next();
		
		if (!userChoice.isEmpty()) {
			String userInput = formatInput(userChoice);
			
			if (checkValidity(userInput)) {
				playGame(userInput);
			}
		}
		
		aScanner.close();
	}

	private static void playGame(String userInput) {
		// TODO Auto-generated method stub
		String Computer = getComputerOption();
		
		System.out.println(userInput + " VS " +Computer +"\n");
		
		if (userInput.equalsIgnoreCase(Computer)) {
			System.out.println("AWWW!, That makes a tie!");
		} else {
			if (checkWinner(userInput,Computer)) {
				System.out.println("You won Computer! Hurray!");
			} else {
				System.out.println("You lost to Computer! Better Luck Next Time!");
			}
		}
		
	}

	private static boolean checkWinner(String userInput, String computer) {
		// TODO Auto-generated method stub
		if (!(checkValidity(userInput)) || !(checkValidity(computer))) {
			return false;
		}
		if (userInput.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("scissors")) {
			System.out.println("Rock crushes Scissors");
			return true;
		}
		else if (computer.equalsIgnoreCase("rock") && userInput.equalsIgnoreCase("scissors")) {
			System.out.println("Rock crushes Scissors");
			return false;
		}
		if (userInput.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("rock")) {
			System.out.println("paper covers rock");
			return true;
		}
		else if (computer.equalsIgnoreCase("paper") && userInput.equalsIgnoreCase("rock")) {
			System.out.println("paper covers rock");
			return false;
		}
		if (userInput.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("paper")) {
			System.out.println("scissors cuts paper");
			return true;
		}
		else if (computer.equalsIgnoreCase("scissors") && userInput.equalsIgnoreCase("paper")) {
			System.out.println("scissors cuts paper");
			return false;
		}
		return false;
	}

	private static String getComputerOption() {
		// TODO Auto-generated method stub
		String[] options = {"rock","paper","scissors"};
		
		Random random = new Random();
		
		int computerPick = random.nextInt(3);
		
		return options[computerPick];
	}

	private static boolean checkValidity(String userInput) {
		// TODO Auto-generated method stub
		
		if (userInput.toLowerCase().equals("rock") || userInput.toLowerCase().equals("paper") 
				||userInput.toLowerCase().equals("scissors")) {
			return true;
		}
		return false;
	}

	private static String formatInput(String userChoice) {
		
		String output = userChoice;
		
		switch (userChoice.toLowerCase()) {
		case "r":
			output = "rock";
			break;
		case "s":
			output = "scissors";
			break;
		case "p":
			output = "paper";
			break;
		}
		return output;
	}
}