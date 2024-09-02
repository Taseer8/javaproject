package cam.xworkz.project1.things;

public class Yulu {
	    public String modelName;
	    public String color;
	    public int batteryCapacity;
	    public double price;

	    
	    public Yulu() {
	        this("Unknown Model"); 
	        System.out.println("Default constructor called");
	    }

	   
	    public Yulu(String modelName) {
	        this(modelName, "Unknown Color");
	        this.modelName = modelName;
	        System.out.println("Constructor with 1 parameter called");
	    }

	    
	    public Yulu(String modelName, String color) {
	        this(modelName, color, 0, 0.0); 
	        this.modelName = modelName;
	        this.color = color;
	        System.out.println("Constructor with 2 parameters called");
	    }

	   
	    public Yulu(String modelName, String color, int batteryCapacity, double price) {
	        this.modelName = modelName;
	        this.color = color;
	        this.batteryCapacity = batteryCapacity;
	        this.price = price;
	        System.out.println("Constructor with 4 parameters called");
	    }

	   
	    public void displayYuluDetails() {
	        System.out.println("Model Name: " + modelName);
	        System.out.println("Color: " + color);
	        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
	        System.out.println("Price: Rs" + price);
	    }

}
