public class NestedIF {
	public static void main(String[] args) {
		int numberOne = 10;
		
		if(numberOne > 3) {
			//numberOne(6) is greater than 3
			if(numberOne > 4) {
				///numberOne(4) is not greater than 4
				if(numberOne > 5) {
					//numberOne(5) is not greater than 5
					System.out.println("yes number one is greater than them all");
				}
				else {
					System.out.println("Number one is greater than 3 and Four but less than 5");
				}
			}
			else {
				System.out.println("Number one is greater than 3 but not greater than four(4)");
			}
		}
		else {
			System.out.println("Number One is not greater than three(3)");
		}
	}
}