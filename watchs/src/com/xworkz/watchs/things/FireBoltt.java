package com.xworkz.watchs.things;

public class FireBoltt extends Watch {
	
    private int batteryLife; 
    private boolean isWaterResistant;
    private double screenSize;
    
	public FireBoltt(int batteryLife, boolean isWaterResistant, double screenSize) {
		super("smartWatch", "nsjkfn", 1200.00);
		this.batteryLife = batteryLife;
		this.isWaterResistant = isWaterResistant;
		this.screenSize = screenSize;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public boolean isWaterResistant() {
		return isWaterResistant;
	}

	public void setWaterResistant(boolean isWaterResistant) {
		this.isWaterResistant = isWaterResistant;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	@Override
	public String getWatchDetails() {
		this.getWatchDetails("watch");
		return "from parent class";
	}
	@Override
	public void getWatchDetails(String brandname) {
		System.out.println("from parent class");
	}

	@Override
	public String toString() {
		return "FireBoltt [batteryLife=" + batteryLife + ", isWaterResistant=" + isWaterResistant + ", screenSize="
				+ screenSize + "]";
	}

	@Override
	public void getbrandName() {
		System.out.println("from child class");
	}
	@Override
	public void getmodelNumber() {
		System.out.println("model number from child class");
	}
	@Override
	public void getPrices() {
		System.out.println("get price from the child class");
	}
	
	
	// overloading
	public void getFiredBolt() {
		this.getFiredBolt(4);
		System.out.println("batterylife ");
	}
	
	public void getFiredBolt(int battery) {
		this.batteryLife = battery;
		System.out.println("battery");
	}
	

	
	
	
	
	
	

}
