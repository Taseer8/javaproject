package com.xworkz.javaproject.tester;

public class NammaYatri {
	  	public String pickupLocation;
	    public String destination;
	    public String vehicleType;
	    public boolean isBookingConfirmed; 
	    
	    public String nammaYat(String pickupLocation) {
	    	this.getDetials("btm","majstic","auto", true);
	        this.pickupLocation = pickupLocation;
	       System.out.println("1 parameter");
	       this.getDisplay();
	        
	    	return  pickupLocation;
	    }
	    public void getRaid(String pickupLocation, String destination) { 
	    	this.pickupLocation = pickupLocation;
	    	this.destination = destination ;
	    	System.out.println("2 parameter");
	    	getDisplay();
	    	
	    } 
	    
	    public void getVehical(String pickupLocation, String destination,String vehicleType) {
	    	this.getRaid("jay nagar", "ubcity");
	    	System.out.println("3 parametr ");
	    	this.pickupLocation = pickupLocation;
	    	this.destination = destination ;
	    	this.vehicleType =vehicleType;
	    	this.getDisplay();
	    }
	    public void getDetials(String pickupLocation, String destination,String vehicleType, boolean isBookingConfirmed) {
	    	this.getVehical("jpnagar", "silk board","bike");
			System.out.println("pickupLocation");
	    	this.pickupLocation = pickupLocation;
	    	this.destination = destination ;
	    	this.vehicleType =vehicleType;
	    	this.isBookingConfirmed = isBookingConfirmed;
	    	System.out.println("4 parameter");
	    	this.getDisplay();
	    	
	    }
	    public  void getDisplay() {
	    	System.out.println("pickup loaction:"+this.pickupLocation);
	    	System.out.println("destination:"+this.destination);
	    	System.out.println("vehicleType:"+this.vehicleType);
	    	System.out.println("is booking confirmed:"+this.isBookingConfirmed);
	    }
	    

}
