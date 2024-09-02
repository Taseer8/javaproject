package cam.xworkz.project1.things;

public class Product {
    // Properties of the class
    public String name;
    public double price;
    public int quantity;
    public String category;

    
    public Product() {
    	this("Unknown", 0.0, 0, "Uncategorized");
        System.out.println("Default constructor called");
    }

    
    public Product(String name) {
    	this("Unknown", 0.0);
        this.name = name;
        System.out.println("Constructor with 1 parameter called");
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Constructor with 2 parameters called");
    }

   
    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        System.out.println("Constructor with 4 parameters called");    
    }
    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: Rs" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
    }
    
    
}

