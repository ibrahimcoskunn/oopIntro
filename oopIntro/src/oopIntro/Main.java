package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"lenovo 14",15000,"16 gb ram", 10);
		
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("lenovo v15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
		
		
		
		
		
		
		

	}

}
