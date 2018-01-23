public class DoWhile {
	public static void main(String[] args) {
		int limiter = 0;
		System.out.println("Before the do while Loop");
		
		/*for(limiter = 0; limiter <= 20 ; limiter++) {
			System.out.println(limiter);
		}*/
		
		//do{
		
		//}while(condition);

		do {
			System.out.println(limiter);
			
			limiter++;
		}while(limiter < 1);
		
		System.out.println("After the do while Loop");
		
		System.out.println("Before the while Loop");
		
		while(limiter < 1) {
			System.out.println(limiter);
			limiter++;
		}		
		System.out.println("After the while Loop");
	}
}
