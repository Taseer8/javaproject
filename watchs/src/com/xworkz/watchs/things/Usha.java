package com.xworkz.watchs.things;

public class Usha extends Fan {
	 	private int bladeSize; 
	    private int speedLevels;
	    private boolean isRemoteControlled;
	    
		public Usha( int bladeSize, int speedLevels2,
			boolean isRemoteControlled) {
			super("brand", 45, true);
			this.bladeSize = bladeSize;
			this.speedLevels = speedLevels2;
			this.isRemoteControlled = isRemoteControlled;
		}

		public int getBladeSize() {
			return bladeSize;
		}

		public void setBladeSize(int bladeSize) {
			this.bladeSize = bladeSize;
		}

		public int getSpeedLevels() {
			return speedLevels;
		}

		public void setSpeedLevels(int speedLevels) {
			this.speedLevels = speedLevels;
		}

		public boolean isRemoteControlled() {
			return isRemoteControlled;
		}

		public void setRemoteControlled(boolean isRemoteControlled) {
			this.isRemoteControlled = isRemoteControlled;
		}
		@Override
		public void getBrandname() {
			System.out.println("from child class ");
		}
		@Override
		public boolean getisOcallitation() {
			return true ;
		}
		@Override
		public void getSpeed() {
			System.out.println("get the speed from the child class");
		}
		
		
		//overload 
		public void getdetails() {
			System.out.println("overloading");
			this.getdetails("amerites");
		}
		public void getdetails(String name) {
			System.out.println(name);
		}

		@Override
		public String toString() {
			return "Usha [bladeSize=" + bladeSize + ", speedLevels=" + speedLevels + ", isRemoteControlled="
					+ isRemoteControlled + "]";
		}

	
		
		
	    
	    

}
