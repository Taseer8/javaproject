package com.xworkz.shop.things;

public class SocialMedia {
	
	public String application;
	public String userName;
	public String userPassword;
	public String email;
	public int age;
	
	public SocialMedia() {
		// TODO Auto-generated constructor stub
		this("instagram", "taseer", "taseer08", "taseer08@gmail.com", 24);
		System.out.println("no argument constractor");
	}
	public SocialMedia(String application, String userName, String userPassword, String email, int age ) {
		this.application = application;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.age = age;
		System.out.println("all argument constractor");
	}
	
	
	public  String getApplication() {
		this.getSocialMediaDetails();
		return application;
	}
	public void getSocialMediaDetails() {
		System.out.println("application name:"+this.application);
		System.out.println("user name:"+this.userName);
		System.out.println("user password:"+this.userPassword);
		System.out.println("user email:"+this.email);
		System.out.println("user age:"+this.age);
		
	}
}
