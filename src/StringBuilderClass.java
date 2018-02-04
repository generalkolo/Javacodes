public class StringBuilderClass {
	public static void main(String[] args) {
	
		StringBuilder stringBuilder = new StringBuilder("I am a girl");
		stringBuilder.append(" are you sure? ");
		
		System.out.println(stringBuilder.deleteCharAt(10));
		
		System.out.println(stringBuilder.delete(0, 9));
		
		System.out.println("The 13th character is "+stringBuilder.charAt(12));
		
		System.out.println("The capacity of the stringbuilder is "+stringBuilder.capacity());
		
		System.out.println(stringBuilder);
		
	}
}