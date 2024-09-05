package com.xworkz.shop.things;

public class Pg {
	  private   String pgName;
	  private    String location;
	  private    int totalRooms;
	  private    byte availableRooms;
	  private    boolean hasWifi;
	  private    float monthlyRent;
	  private    double securityDeposit;
	  private    long contactNumber;
	  private    char genderType;  

	  public Pg() {
		// TODO Auto-generated constructor stub
		   System.out.println("no agrument Conatractor");
	}
    
    public Pg(String pgName, String location, int totalRooms, byte availableRooms, boolean hasWifi, 
              float monthlyRent, double securityDeposit, long contactNumber, char genderType) {
        this.pgName = pgName;
        this.location = location;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.hasWifi = hasWifi;
        this.monthlyRent = monthlyRent;
        this.securityDeposit = securityDeposit;
        this.contactNumber = contactNumber;
        this.genderType = genderType;
    }
    
    public void getPgName(String pgName) {
    	this.pgName = pgName;
    	
    }
    public String setPgName() {
    	return this.pgName;
    }
    public void getLocation(String location) {
    	this.location = location;
    }
    public String setLocation() {
    	return this.location;
    }
    public void getTotalRoom(int totalRooms) {
    	this.totalRooms = totalRooms;
    }
    public int setTotalRoom() {
    	return this.totalRooms;
    }
    public void getAvailable(byte availableRooms) {
    	this.availableRooms = availableRooms;
    }
    public byte setAvailable() {
    	return this.availableRooms;
    }
    public void getHasWifi(boolean hasWifi) {
    	this.hasWifi = hasWifi;
    	
    }
    public  boolean sethasWife() {
    	return this.hasWifi;
    }
    public void getmonthlyRent(float monthlyRent) {
    	this.monthlyRent = monthlyRent;
    }
    public float setMonthlyRent() {
    	return this.monthlyRent;
    }
    public void getSecurity(double securityDeposite) {
    	 this.securityDeposit = securityDeposite;
    }
    public double setSecurity() {
    	return this.securityDeposit;
    }
    public void getContact(long contactNo) {
    	this.contactNumber = contactNo;
    }
    public long setContact() {
    	return this.contactNumber;
    }
    public void getGender(char genderType) {
    	this.genderType = genderType;
    }
    public char setGender() {
    	return this.genderType;
    }
}

