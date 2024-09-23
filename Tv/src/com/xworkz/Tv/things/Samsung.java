package com.xworkz.Tv.things;

public class Samsung extends Tv {
	
		private String resolution;
		private boolean isSmartTv;
	    private int hdmiPorts;
	    
	    public Samsung(String resolution, boolean isSmartTv, int hdmiPorts) {
			super("Tv",22.43,657);
			this.resolution = resolution;
			this.isSmartTv = isSmartTv;
			this.hdmiPorts = hdmiPorts;
		}
		public String getResolution() {
			return resolution;
		}
		public void setResolution(String resolution) {
			this.resolution = resolution;
		}
		public boolean isSmartTv() {
			return isSmartTv;
		}
		public void setSmartTv(boolean isSmartTv) {
			this.isSmartTv = isSmartTv;
		}
		public int getHdmiPorts() {
			return hdmiPorts;
		}
		public void setHdmiPorts(int hdmiPorts) {
			this.hdmiPorts = hdmiPorts;
		}
		@Override
		public void getSize() {
			super.getSize();
			System.out.println("accessing in Samsung child class");
		}
		@Override
		public void getdetails() {
			
			super.getdetails();
			System.out.println("accessing in Samsung child class");
		}
		@Override
		public void getSeries() {
			super.getSeries();
			System.out.println("accessing in Samsung child class");
		}
		//overloading
		public void getDetail() {
			System.out.println("overloading in Samsung child class");
			String str = this.getDetail("tv");
			System.out.println(str);
		}
		public String getDetail(String resulation) {
			this.resolution = resulation;
			return resulation;
		}
		
		
		@Override
		public String toString() {
			return "Samsung [resolution=" + resolution + ", isSmartTv=" + isSmartTv + ", hdmiPorts=" + hdmiPorts + "]";
		}
		
	
		
		

}
