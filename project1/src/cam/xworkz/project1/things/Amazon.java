package cam.xworkz.project1.things;

public class Amazon {
	
    public String productName;
    public String productCategory;
    public int productID;
    public double productPrice;
    public int productStock;
    
    public Amazon() {
		// TODO Auto-generated constructor stub
	}
    public Amazon(String productName) {
        this.productName = productName;
    }
    public Amazon(String productName, String productCategory) {
        this.productName = productName;
        this.productCategory = productCategory;
    }
    public Amazon(String productName, String productCategory, int productID) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productID = productID;
    }
    public Amazon(String productName, String productCategory, int productID, double productPrice) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productID = productID;
        this.productPrice = productPrice;
       
    }
	public Amazon(String productName, String productCategory, int productID, double productPrice, int productStock) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productID = productID;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }
	 public void displayDetails() {
	        System.out.println("Product Name: " + productName);
	        System.out.println("Product Category: " + productCategory);
	        System.out.println("Product ID: " + productID);
	        System.out.println("Product Price: Rs" + productPrice);
	        System.out.println("Product Stock: " + productStock);
	        System.out.println("--------------------------");
	    }

}
