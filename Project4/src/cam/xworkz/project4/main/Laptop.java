package cam.xworkz.project4.main;

public class Laptop {
	public static String brand = "dell";
	public static boolean hasBluetooth = true;
	public static boolean hasWebcam ;
	public static int warrantyPeriod ;
	public String model;
	public String processor;
	public byte ram;
	public int storage;
	
	public Laptop(String model, String processor, byte ram, int storage) {
		 this.model = model;
	     this.processor = processor;
	     this.ram = ram;
	     this.storage = storage;
	     System.out.println("model no:"+this.model);
	     System.out.println("process name:"+this.processor);
	     System.out.println("ram:"+this.ram+"Gb");
	     System.out.println("storage:"+this.storage +"GB");
	}

}
