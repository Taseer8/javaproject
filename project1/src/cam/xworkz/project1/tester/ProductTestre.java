package cam.xworkz.project1.tester;

import cam.xworkz.project1.things.Product;

public class ProductTestre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
    	product.displayProduct();
    	Product product1 = new Product("mobile");
    	product1.displayProduct();
    	Product product2 = new Product("Mobile",10000.0);
    	product2.displayProduct();
	}
}