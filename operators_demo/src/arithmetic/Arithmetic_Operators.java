package arithmetic;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		
		Arithmetic_Operators ex = new Arithmetic_Operators();
		int a = 5;
		int b = 10;
		int c = 15;
		
		
		int d = ex.addition(a,b);
		System.out.println("A + B = "+d);
		
		
		d = ex.subtraction(c, b);
		System.out.println("C - B = "+d);
		
		
		d = ex.multi(a, b);
		System.out.println("A * B = "+d);
		
		
		float e = ex.div(c, a);	
		System.out.println("C/A = "+e);
		
		
		d = ex.modulo(c, b);
		System.out.println("C % B = "+d);
		
		
		d = ex.pp(a);
		System.out.println("A + 1 = "+d);
		
		
		d = ex.mm(a);
		System.out.println("A - 1 = "+d);
		

	}
	
	//(+) adds two values together.
	public int addition(int a, int b) {
		return a + b;
	}
	
	//(-) subtracts two values.
	public int subtraction(int a, int b) {
		return a - b;
	}
	
	//(*) multiplies two values together.
	public int multi(int a, int b) {
		return a * b;
	}
	
	//(/) divides one value by another. 
	public float div(float a, float b) {	//float type for decimal values.
		return a/b;
	}
	
	//(%) returns remainder.
	public int modulo(int a, int b) {
		return a % b;
	}
	
	//(++) increment by one.
	public int pp(int a) {
		return ++a;
	}
	
	//(--) decrement by one.
	public int mm(int a) {
		return --a;
	}
	

}
