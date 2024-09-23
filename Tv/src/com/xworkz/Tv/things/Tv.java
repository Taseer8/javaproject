package com.xworkz.Tv.things;

public class Tv {
	
	private String brandName;
	private double ScreenSize;
	private int seriesNo;
	
	public Tv(String brandName, double screenSize, int seriesNo) {
		super();
		this.brandName = brandName;
		ScreenSize = screenSize;
		this.seriesNo = seriesNo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getScreenSize() {
		return ScreenSize;
	}

	public void setScreenSize(double screenSize) {
		ScreenSize = screenSize;
	}

	public int getSeriesNo() {
		return seriesNo;
	}

	public void setSeriesNo(int seriesNo) {
		this.seriesNo = seriesNo;
	}

	@Override
	public String toString() {
		return "Tv [brandName=" + brandName + ", ScreenSize=" + ScreenSize + ", seriesNo=" + seriesNo + "]";
	}
	
	public void getdetails() {
		System.out.println("from parent class"+this.brandName);
	}
	public void getSize() {
		System.out.println("from parent class :"+this.ScreenSize);
	}
	public void getSeries() {
		System.out.println("getting series from the parent class ");
	}
	//overloading
	public void getDetail() {
		System.out.println("overloading in parent class");
		String str = this.getDetail("tv");
		System.out.println(str);
	}
	public String getDetail(String brandName) {
		this.brandName = brandName;
		return brandName;
	}
	

}
