import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		
		userName = scanner.next();
		
		showName(userName);
		
	}
	
	public static void showName(String name) {
		System.out.println("Your Name is "+name);
	}
}