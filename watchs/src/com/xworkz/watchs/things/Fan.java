package com.xworkz.watchs.things;

public class Fan {
	
    private String brand;
    private int speedLevels;
    private boolean isOscillating;
    
	public Fan(String brand, int speedLevels, boolean isOscillating) {
		super();
		this.brand = brand;
		this.speedLevels = speedLevels;
		this.isOscillating = isOscillating;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpeedLevels() {
		return speedLevels;
	}

	public void setSpeedLevels(int speedLevels) {
		this.speedLevels = speedLevels;
	}

	public boolean isOscillating() {
		return isOscillating;
	}

	public void setOscillating(boolean isOscillating) {
		this.isOscillating = isOscillating;
	}

	@Override
	public String toString() {
		return "Fan [brand=" + brand + ", speedLevels=" + speedLevels + ", isOscillating=" + isOscillating + "]";
	}
	
	public void getBrandname() {
		System.out.println("from parent class ");
	}
	public boolean getisOcallitation() {
		return true;
	}
	public void getSpeed() {
		System.out.println("get the speed from the parent class");
	}
	//overloading
	public void getFanDetails() {
		System.out.println("all the deatils of watch from the parent class");
		this.getFanDetails("hevles");
	}
	public void getFanDetails(String name) {
		System.out.println("second method for overloading:"+name);
	}
    
    

}
