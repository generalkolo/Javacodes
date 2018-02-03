import java.util.Scanner;

public class MeanRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int startNumber,endNumber,count;
		
		do {
			System.out.println("Please enter the start number _");
			
			startNumber = scanner.nextInt();
			
			System.out.println("Please enter the end number _");
			
			endNumber = scanner.nextInt();
			
		}while(endNumber < startNumber);
		
		disPlayRangeOfNumbers(startNumber,endNumber);
		
		System.out.println();
		
		count  = calculateNumbers(startNumber,endNumber);
		
		System.out.println(count+" numbers are being displayed");
		
		calculateMeanAndRange(startNumber,endNumber);
			
	}
	
	public static void disPlayRangeOfNumbers(int startNumber, int endNumber) {
		for(int counter = startNumber;counter <= endNumber;counter++) {
			System.out.print(counter +" ");
		}
	}
	
	public static int calculateNumbers(int startNumber, int endNumber) {
		int count = 0;
		for(int counter = startNumber;counter <= endNumber;counter++) {
			count++;	
		}
		return count;
	}
	
	public static void calculateMeanAndRange(int startNumber,int endNumber) {
		int count = 0,sum = 0;
		
		for(int counter = startNumber;counter <= endNumber;counter++) {
			sum+=counter;
			count++;	
		}
		
		double mean = sum / count;
		int range = endNumber - startNumber;
		
		System.out.println("The Mean is "+mean);
		
		System.out.println("The range is "+range);
		
	}
}