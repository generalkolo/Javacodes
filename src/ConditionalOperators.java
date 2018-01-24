public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne = 3;
		int numberTwo = 4;
		
		//AND(&&) CONDITIONAL OPERATOR
		if (numberOne == 5 && numberTwo == 4) {
			System.out.println("You Win!");
		}
		else {
			System.out.println("You Lost!");
		}
		
		//OR(||) CONDITIONAL OPERATOR
		if (numberOne == 3 || numberTwo == 12) {
			System.out.println("You Win!");
		}
		else {
			System.out.println("You Lost!");
		}	
		
		//NOT(!) CONDITIONAL OPERATOR
		if (!(numberOne == 5)) {
			System.out.println("You Win!");
		} else {
			System.out.println("You Lost!");
		}
	}
}