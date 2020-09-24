package wrapper_classes;

public class WrappersDouble {
	
	public void DoubleEx() {
		Double i1=10.1;//common pool
		Double i2=10.1;//common pool
		Double i3=new Double(10.1); //heap
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));

		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		System.out.println("i1.equals(i3) : "+i1.equals(i3));
		
		Double i4= 99.19;
		System.out.println("i4.compareTo(99) : "+i4.compareTo(99.1));
		System.out.println("i4.compareTo(9) : "+i4.compareTo(9.2));
		System.out.println("i4.compareTo(999) : "+i4.compareTo(999.8));
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		Double x=i4; 
		System.out.println("x : "+x);
		
		x=10000.01;
		i4=x; 
		System.out.println("i4 : "+i4);
		
		String s="12443";
		
		Double a=Double.parseDouble(s);  
		System.out.println("a = "+a);
		
		a=1919191.91;
		s=a+"";
		System.out.println("s : "+s);
		
		Double i5=77.7;
		Double f=(double) i5.floatValue(); 
		System.out.println("f = "+f);
		Double r=(double) f.intValue();
		System.out.println("r : "+r);

	}

}

