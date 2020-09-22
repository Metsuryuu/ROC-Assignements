package relational;

public class Relational_Operators {

	public static void main(String[] args) {
		
		Relational_Operators r = new Relational_Operators();
		int a = 10;
		int b = 20;
		
		System.out.println("A = "+a +"   B = "+b);
		
		boolean c = r.equalto(a, b);
		System.out.println("\n\nA is equal to B: "+c);
		
		c = r.notequal(a, b);
		System.out.println("A is not equal to B: "+c);
		
		c = r.greatthan(a, b);
		System.out.println("A is greater than B: "+c);
		
		c = r.lessthan(a, b);
		System.out.println("A is less than B: "+c);
		
		c = r.greateq(a, b);
		System.out.println("A is greater than or equal to B: "+c);
		
		c = r.lesseq(a, b);
		System.out.println("A is less than or equal to B: "+c);
		

	}
	
	//tests if two values are equal to each other.
	public boolean equalto(int a, int b) {
		return a == b;
	}
	
	//tests if two values are not equal to each other.
	public boolean notequal(int a, int b) {
		return a != b;
	}
	
	//tests to see if left value is greater than the right value.
	public boolean greatthan(int a, int b) {
		return a>b;
	}
	
	//tests to see if left value is less than the right value.
	public boolean lessthan(int a, int b) {
		return a<b;
	}
	
	//tests to see if left value is greater than or equal to the right value.
	public boolean greateq(int a, int b) {
		return a>=b;
	}
	
	//tests to see if left value is less than or equal to the right value.
	public boolean lesseq(int a, int b) {
		return a<=b;
	}

}
