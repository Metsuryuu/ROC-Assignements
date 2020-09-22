package conditional;

public class Conditional_Operators {

	public static void main(String[] args) {
		
		int test=50;
		String message;
		
		message = test>=70 ? "Above Average":"Below Average";
		System.out.println(message);
		
		//? operator seems to work as an inline if statement for a single conditional statement.

	}

}
