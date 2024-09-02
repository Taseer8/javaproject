package cam.xworkz.project1.things;

public class PG {
	public String name;
    public String location;
    public int numberOfRooms;
    public double pricePerRoom;

   
    public PG() {
        this("Unnamed PG");
        System.out.println("Default constructor called");
    }

    
    public PG(String name) {
        this(name, "Unknown Locatin"); 
        this.name = name;
        System.out.println("Constructor with 1 parameter called");
    }

  
    public PG(String name, String location) {
        this(name, location, 0, 0.0); 
        this.name = name;
        this.location = location;
        System.out.println("Constructor with 2 parameters called");
    }

    
    public PG(String name, String location, int numberOfRooms, double pricePerRoom) {
        this.name = name;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.pricePerRoom = pricePerRoom;
        System.out.println("Constructor with 4 parameters called");
    }

    
    public void displayPGDetails() {
        System.out.println("PG Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Price Per Room: Rs" + pricePerRoom);
    }
    


}
