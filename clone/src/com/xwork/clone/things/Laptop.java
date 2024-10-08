package com.xwork.clone.things;

public class Laptop implements Cloneable{
	
	public String brand ;
    public String model ;
    public int ramSize ;         
    public int storageSize ;    
    public String processor ;
    public String graphicsCard ;
    public double screenSize  ;  
    public double price  ;
    
    public Laptop clone() throws CloneNotSupportedException {
    	System.out.println("from clone method");
    	return (Laptop) new Laptop();
    }

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", ramSize=" + ramSize + ", storageSize=" + storageSize
				+ ", processor=" + processor + ", graphicsCard=" + graphicsCard + ", screenSize=" + screenSize
				+ ", price=" + price + "]";
	}
    

}
