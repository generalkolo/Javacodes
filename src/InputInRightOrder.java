import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InputInRightOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("Arrange this words in the right order");
		
		System.out.println("Words start from index 0");
		
		String pharseString = "who stole the meat in d cooking pot";
		
		String[] pharse = pharseString.split(" ");
		
		String[] randomArray = new String[pharse.length];
		
		randomArray = initializeRandomArray(pharse);
		
		String key = getKeyValue(randomArray,pharse);
		
		int answer = aScanner.nextInt();
		
		displayCorrectOrIncorrectKey(answer,key);
		
	}

	private static void displayCorrectOrIncorrectKey(int answer, String key) {
		// TODO Auto-generated method stub
		if (key.equals(String.valueOf(answer))) {
			System.out.println("Correct Order");
		}
		else {
			System.out.println("Incorrect Order");
			System.out.println("The right order is "+key);
		}
	}

	private static String getKeyValue(String[] randomArray, String[] pharse) {
		// TODO Auto-generated method stub
		StringBuilder key = new StringBuilder();
		
		for(int count = 0;count < pharse.length;count++) {
			for(int i = 0; i < pharse.length ; i++) {
				if (randomArray[i].equals(pharse[count])) {
					key.append(i);
				}
			}
		}
		
		return key.toString();
	}

	private static String[] initializeRandomArray(String[] pharse) {
		// TODO Auto-generated method stub
		
		boolean[] pharseIndex = new boolean[pharse.length];
		Arrays.fill(pharseIndex, Boolean.FALSE);
		
		String[] returnArray = new String[pharse.length];
		
		for(int i = 0; i < pharse.length; i++) {
			
			int randomValue = new Random().nextInt(pharse.length);
			
			if (pharseIndex[randomValue] ==  false) {
				String value = pharse[randomValue];
				
				returnArray[i] = value;
				
				System.out.print(value +" ");
				
				pharseIndex[randomValue] = true;
			}
			else {
				i--;
			}	
		}
		
		return returnArray;
	}
}