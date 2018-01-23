public class ForLoop {
	public static void main(String[] args) {
		int limiter,limiter2;
		
		//for(initializer,limit/condition,Increment){
		//}
		System.out.println("Before the Loop");
		
		for(limiter = 1;limiter <= 12;limiter++) {
			for(limiter2 = 1; limiter2 <= 12; limiter2++) {
				System.out.println(limiter2+" * "+limiter +" = " +limiter*limiter2);
			}
		}
		
		System.out.println("After the Loop");
	}
}