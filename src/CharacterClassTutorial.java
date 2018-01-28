import java.util.Scanner;

public class CharacterClassTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int counter = 64;counter<=123;counter++) {
			System.out.println("The numerical value "+counter+" represents "+(char)counter);
		}*/
		
		Character aCharacter;
		Character bCharacter;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a character ");
		
		aCharacter = scanner.next().charAt(0);
		
		System.out.println("Enter another character ");
		
		bCharacter = scanner.next().charAt(0);
		
		System.out.println("Character "+aCharacter+" is the same as "+bCharacter+" ? "+aCharacter.equals(bCharacter));
		
		System.out.println("The numerical difference between "+aCharacter+" and "+bCharacter+" is "+
				aCharacter.compareTo(bCharacter)
				);
		
		System.out.println("The numerical difference between "+bCharacter+" and "+aCharacter+" is "+
				bCharacter.compareTo(aCharacter)
				);
	}
} 