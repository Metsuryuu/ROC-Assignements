package wrapper_classes;

public class WrappersEx {

	public static void main(String[] args) {
		
		WrappersFloat f = new WrappersFloat();
		WrappersDouble d = new WrappersDouble();
		WrappersLong l = new WrappersLong();
		
		System.out.println("Float demo");
		separator();
		f.floatEx();
		
		separator();
		System.out.println("\nDouble demo");
		separator();
		d.DoubleEx();
		
		separator();
		System.out.println("\nLong demo");
		separator();
		l.LongEx();

	}
	
	public static void separator(){
		System.out.println("--------------------------------------");
	}
}

