package com.xwork.clone.tester;

import com.xwork.clone.things.Laptop;

public class LaptopTester {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.brand = "hp";
		laptop.graphicsCard=" 4GB";
		laptop.model = "gaming vision";
		laptop.price = 54000;
		laptop.processor = "i7";
		laptop.ramSize = 16;
		laptop.screenSize = 15.4;
		laptop.storageSize = 500;
		try {
			Laptop laptop1 = laptop.clone();
			System.out.println("Laptop details:"+laptop);
			laptop1.brand = "lenovo";
			laptop1.graphicsCard=" 8GB";
			laptop1.model = "gaming i3";
			laptop1.price = 60000;
			laptop1.processor = "i7";
			laptop1.ramSize = 8;
			laptop1.screenSize = 16;
			laptop1.storageSize = 500;
			System.out.println("laptop1 details :"+laptop1);
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
		
		
	}

}
