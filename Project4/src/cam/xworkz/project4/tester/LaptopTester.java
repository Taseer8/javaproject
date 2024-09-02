package cam.xworkz.project4.tester;

import cam.xworkz.project4.main.Laptop;

public class LaptopTester {

	public static void main(String[] args) {
		Laptop.hasWebcam = true;
		Laptop.warrantyPeriod = 1;
		System.out.println("brand name:"+Laptop.brand);
		System.out.println("has bluetooth:"+Laptop.hasBluetooth);
		System.out.println("has web camera:"+Laptop.hasWebcam);
		System.out.println("warranty period:"+Laptop.warrantyPeriod);
		Laptop laptop = new Laptop("Model A", "Intel i5", (byte)8, 512 );

	}

}
