package cam.xworkz.project1.things;

public class Software {
    public String name;
    public String version;
    public String platform;
    public double price;
    public Software() {
        this("Unknown Software"); 
        System.out.println("Default constructor called");
    }


    public Software(String name) {
        this(name, "0.0");
        this.name= name;
        System.out.println("Constructor with 1 parameter called");
    }

    
    public Software(String name, String version) {
        this(name, version, "Unknown Platform", 0.0); 
        this.name = name;
        this.version = version;
        System.out.println("Constructor with 2 parameters called");
    }

  
    public Software(String name, String version, String platform, double price) {
        this.name = name;
        this.version = version;
        this.platform = platform;
        this.price = price;
        System.out.println("Constructor with 4 parameters called");
    }

    
    public void displaySoftwareDetails() {
        System.out.println("Software Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Platform: " + platform);
        System.out.println("Price: Rs" + price);
    }

}
