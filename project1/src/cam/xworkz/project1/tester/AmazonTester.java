package cam.xworkz.project1.tester;

import cam.xworkz.project1.things.Amazon;

public class AmazonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon product1 = new Amazon();
        product1.displayDetails();

        // Using constructor with 1 parameter
        Amazon product2 = new Amazon("Laptop");
        product2.displayDetails();

        // Using constructor with 2 parameters
        Amazon product3 = new Amazon("Laptop", "Electronics");
        product3.displayDetails();

        // Using constructor with 3 parameters
        Amazon product4 = new Amazon("Laptop", "Electronics", 101);
        product4.displayDetails();

        // Using constructor with 4 parameters
        Amazon product5 = new Amazon("Laptop", "Electronics", 101, 999.99);
        product5.displayDetails();

        // Using constructor with 5 parameters
        Amazon product6 = new Amazon("Laptop", "Electronics", 101, 999.99, 50);
        product6.displayDetails();

	}

}
