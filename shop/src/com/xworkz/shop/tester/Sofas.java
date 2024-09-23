package com.xworkz.shop.tester;

public class Sofas extends Furniture {
	
	private int numberOfSeats;      
    private String typeMaterial; 
    private String style;

    public Sofas(String type, String material, String color, double weight, double price, String dimensions) {
		super(type, material, color, weight, price, dimensions);
		
	}

	//setter and getter   
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public String getTypeMaterial() {
		return typeMaterial;
	}
	
	public void setTypeMaterial(String typeMaterial) {
		this.typeMaterial = typeMaterial;
	}
	
	public String getStyle() {
		return style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}
	


	@Override
	 public void getFurnitureDetails() {
		System.out.println("Running in Sofa class ");
		 System.out.println("which type of furniture is Sofa");
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
		System.out.println("dasaira discount");
		return super.getPriceDeatils(price, color);
		}

	@Override
	public String toString() {
		return "Sofas [numberOfSeats=" + numberOfSeats + ", typeMaterial=" + typeMaterial + ", style=" + style + "]";
	}
	
	 
	 
	 

	
	
	
	
}
