package com.xworkz.watchs.things;

public class Watch {
	
	private String brand;
    private String model;
    private double price;
    
	public Watch(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	//3 methods
	public void getbrandName() {
		System.out.println("from parents class");
	}
	
	public void getmodelNumber() {
		System.out.println("model number from parents class");
	}
	public void getPrices() {
		System.out.println("get price from the parent class");
	}
	
	//overloading
	public String getWatchDetails() {
		this.getWatchDetails("watch");
		return "from parent class";
	}
	public void getWatchDetails(String brandName) {
		System.out.println("from parent class:"+brandName);
	}
	
	  

}
