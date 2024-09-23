package com.xworkz.shop.tester;

public class Furniture {
		
		private String type;          
		private String material; 
	    private String color;          
	    private double weight;         
	    private double price;          
	    private String dimensions;
	    
	    
	    public Furniture(String type, String material, String color, double weight, double price, String dimensions) {
			this.type = type;
			this.material = material;
			this.color = color;
			this.weight = weight;
			this.price = price;
			this.dimensions = dimensions;
		}
	    
	    
		// setter and getter
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getDimensions() {
			return dimensions;
		}
		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}
		
		// 4 types of method 
		
		 public void getFurnitureDetails() {
			 System.out.println("which type of furniture");
		 } 
		 public String getmaterialDeatils() {
			 return this.material;
		 }
		 public void getcolordeatils(String color ) {
			 System.out.println(color);
		 }
		 public double getPriceDeatils(double price, String color) {
			 return this.price = price;
		 }
		 
	
		@Override
		public String toString() {
			return "Furniture [type=" + type + ", material=" + material + ", color=" + color + ", weight=" + weight
					+ ", price=" + price + ", dimensions=" + dimensions + "]";
		}
		
	    
	    
	    

}
