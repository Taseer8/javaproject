package com.xworkz.shop.tester;

public class Wardrobes extends Furniture{
	
    private short numberOfDoors;         
    private int numberOfDrawers;              
    private boolean hasMirror;
    
     
	
	public Wardrobes(Short numberOfDoors, int numberOfDrawers, boolean hasMirror) {
		super("type", "material", "color", 00.00, 35000.00, "");
		this.numberOfDoors = numberOfDoors;
		this.numberOfDrawers = numberOfDrawers;
		this.hasMirror = hasMirror;
		
	}
	public short getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(short numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public int getNumberOfDrawers() {
		return numberOfDrawers;
	}
	public void setNumberOfDrawers(int numberOfDrawers) {
		this.numberOfDrawers = numberOfDrawers;
	}
	public boolean getIsHasMirror() {
		return hasMirror;
	}
	public void setHasMirror(boolean hasMirror) {
		this.hasMirror = hasMirror;
	}
	
	
	
	@Override
	 public void getFurnitureDetails() {
		System.out.println("calling from Wardrobes class");
		 System.out.println("which type of furniture");
	 }
	@Override
	 public void getcolordeatils(String color ) {
		 System.out.println(color);
	 }
	@Override
	public String getmaterialDeatils() {
		return super.getmaterialDeatils();
	}
	@Override
	public double getPriceDeatils(double price, String color) {
		System.out.println("Prebooking discount");
		return super.getPriceDeatils(price, color);
	}
	
	
	@Override
	public String toString() {
		return "Wardrobes [numberOfDoors=" + numberOfDoors + ", numberOfDrawers=" + numberOfDrawers + ", hasMirror="
				+ hasMirror + "]";
	}
	


}
