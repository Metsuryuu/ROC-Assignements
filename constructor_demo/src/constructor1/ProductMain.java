package constructor1;

public class ProductMain {

	public static void main(String[] args) {

		Product p = new Product(201,"Kalimba", 49.99);
		System.out.println(p);
		
		Product p1 = new Product(20943,"La Verdadera Destreza", 24.49);
		System.out.println(p1);
		
		Product p2 = new Product(399124,"Xenoblade Chronicles Definitive Edition",59.99, 4.5);
		System.out.println(p2);

	}

}
