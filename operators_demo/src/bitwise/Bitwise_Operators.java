package bitwise;

public class Bitwise_Operators {

	public static void main(String[] args) {
		
		Bitwise_Operators bit = new Bitwise_Operators();
		
		int a = 5;
		int b = 3;
		
		int c = bit.band(a, b);
		System.out.println("Bitwise a and b = "+c);
		
		c = bit.bor(a, b);
		System.out.println("Bitwise a or b = "+c);
		
		c = bit.bnot(a);
		System.out.println("Bitwise not a = "+c);
		
		c = bit.xor(a, b);
		System.out.println("Bitwise a XOR b = "+c);
		
		c = bit.fillL(a, b);
		System.out.println("Bitwise fill left a, b = "+c);
		
		c = bit.shiftr(a, b);
		System.out.println("Bitwise shift right a, b = "+c);
		
		c = bit.fillr(a, b);
		System.out.println("Bitwise fill right a, b = "+c);
		
		

	}
	
	//conducts and bitwise, if both bits are 1, that bit will remain 1. By changing the binary, the effect could be significant.
	public int band(int a, int b) {
		return a & b;
	}
	
	//conducts or bitwise, set each bit to 1 if either is 1.
	public int bor(int a, int b) {
		return a | b;
	}
	
	//conducts not bitwise, inversion of all bits.
	public int bnot(int a) {
		return ~a;
	}
	
	//conducts XOR bitwise, addition modulo 2 (i.e 1+1=0).
	public int xor(int a, int b) {
		return a ^ b;
	}
	
	//pushes bits left by the right-hand value, leftmost bits fall off.
	public int fillL(int a, int b) {
		return a << b;
	}
	
	//copy bits right with the rightmost falling off.
	public int shiftr(int a, int b) {
		return a >> b;
	}
	
	//pushed bits left to right by right-hand value, rightmost bits fall off.
	public int fillr(int a, int b) {
		return a >>> b;
	}

}
