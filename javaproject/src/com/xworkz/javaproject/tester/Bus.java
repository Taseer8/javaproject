package com.xworkz.javaproject.tester;

public class Bus {
	   	public String busNumber;
	    public String route;
	    public String driverName;
	    public int capacity;
	    public boolean isAvailable;
	    
	    public void getBusNo(String busNumber) {
	    	System.out.println("getBusNo");
	    	this.getCapacity("KA-01-1234", "MG Road to Whitefield", "John Doe", 58, true);
	    	this.busNumber = busNumber;
	    	this.displayDetails();
			
		}
	    public void getRoute(String busNumber, String route) {
	    	this.busNumber = busNumber;
	    	this.route = route;
	    	this.displayDetails();
			
		}
	    public void getDriverName(String busNumber, String route, String driverName) {
	    	this.getRoute("kA-01-f-453", "attibilla to banshankaru");
	    	this.busNumber = busNumber;
	    	this.route = route;
	    	this.driverName = driverName;
	    	this.displayDetails();
		}
	    public void getCapacity(String busNumber, String route, String driverName,int capacity, boolean isAvailable) {
	    	this.getDriverName("KA-01-f-2345", "majstic to Btm", "prashant");
	    	this.busNumber = busNumber;
	    	this.route = route;
	    	this.driverName = driverName;
	    	this.capacity = capacity;
	    	this.isAvailable = isAvailable;
	    	this.displayDetails();
		}
	    
	    public void displayDetails() {
	        System.out.println("\nBus Details:");
	        System.out.println("Bus Number: " + this.busNumber);
	        System.out.println("Route: " + this.route);
	        System.out.println("Driver Name: " + this.driverName);
	        System.out.println("Capacity: " + this.capacity + " passengers");
	        System.out.println("Availability: " +this.isAvailable );
	    }

}
