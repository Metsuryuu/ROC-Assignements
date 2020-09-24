package wrapper_classes;

public class WrappersLong {
	
	public void LongEx() {
		
		Long i1=10l;//common pool
		Long i2=10l;//common pool
		Long i3=new Long(10l); //heap
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));

		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		System.out.println("i1.equals(i3) : "+i1.equals(i3));
		
		Long i4= 99l;
		System.out.println("i4.compareTo(99) : "+i4.compareTo(99l));
		System.out.println("i4.compareTo(9) : "+i4.compareTo(9l));
		System.out.println("i4.compareTo(999) : "+i4.compareTo(999l));
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		Long x=i4; 
		System.out.println("x : "+x);
		
		x=10000l;
		i4=x; 
		System.out.println("i4 : "+i4);
		
		String s="12443";
		
		long a=Long.parseLong(s);  
		System.out.println("a = "+a);
		
		a=1919191;
		s=a+"";
		System.out.println("s : "+s);
		
		Long i5=7771l;
		Long f=(long) i5.floatValue(); 
		System.out.println("f = "+f);
		Long r=(long) f.intValue();
		System.out.println("r : "+r);

	}

}

