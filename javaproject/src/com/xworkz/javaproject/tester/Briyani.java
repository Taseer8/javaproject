package com.xworkz.javaproject.tester;

public class Briyani {
	   	public String type;
	    public String ingredients;
	    public String spiceLevel;
	    public String portionSize;
	    public double price;
	    
	    public void getType(String type) {
	    	this.getPortion("briyani", "chicken", "hydspl", "full", 450);
	    	this.type = type;
	    	this.displayDetails();
	    }
	    public void getingredients(String type, String ingredients) {
	    	this.type = type;
	    	this.ingredients = ingredients;
	    	this.displayDetails();
			
		}
	    public void getSpicel (String type, String ingredients, String spicelevel) {
	    	this.getingredients("kushka", "basumathi");
	    	this.type = type;
	    	this.ingredients = ingredients;
	    	this.spiceLevel = spicelevel;
	    	this.displayDetails();
		}
	    public void getPortion (String type, String ingredients, String spicelevel, String portionSize, double price) {
	    	this.getSpicel("briyani", "mutton", "full");
	    	this.type = type;
	    	this.ingredients = ingredients;
	    	this.spiceLevel = spicelevel;
	    	this.portionSize = portionSize;
	    	this.price = price;
	    	this.displayDetails();
		}
	    public void displayDetails() {
	        System.out.println("\nBiryani Details:");
	        System.out.println("Type: " + this.type);
	        System.out.println("Ingredients: " + this.ingredients);
	        System.out.println("Spice Level: " + this.spiceLevel);
	        System.out.println("Portion Size: " + this.portionSize);
	        System.out.println("Price: " + this.price);
	    }

}
