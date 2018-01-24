
public class BreakAndContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before the For Loop");
		System.out.println();
		
		for(int counter = 0;counter <= 10;counter++) {
			if(counter == 5) {
				continue;
			}
			System.out.println(counter);
			if(counter == 9) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("After the For Loop");
	}
}