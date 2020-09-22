package logical;

public class Logical_Operators {

	public static void main(String[] args) {
		
		Logical_Operators l = new Logical_Operators();
		boolean a = true;
		boolean b = false;
		
		boolean c = l.and(a, b);
		System.out.println("a and b = "+c);	//true and false would be false.
		
		c = l.or(a, b);
		System.out.println("a or b = "+c);	//t or f would be t.
		
		c = l.not(a);
		System.out.println("not a = "+c);

	}
	
	//can change value based on truth values. Functions as "and".
	public boolean and(boolean a, boolean b) {
		return a && b;
	}
	
	//functions as a logical or.
	public boolean or(boolean a, boolean b) {
		return a || b;
	}
	
	//logical not, reverses truth value.
	public boolean not(boolean a) {
		return !a;
	}
	
	//all these operators are obviously vital for if statements and loops.

}
