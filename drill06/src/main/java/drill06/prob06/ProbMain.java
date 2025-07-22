package drill06.prob06;

public class ProbMain {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.printInfo();
		System.out.println();
		
		Product product2 = new Product();

		product2.setName("맥북");
		product2.setStock(10);
		product2.printInfo();
	}
}
