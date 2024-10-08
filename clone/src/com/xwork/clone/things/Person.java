package com.xwork.clone.things;

public class Person {

		public String  name;            
	    public int age ;              
	    public String address;       
	    public long phoneNumber ;
	    public String jobTitle;     
	    public String skills;         
	    public String education;  
	    public String hobbies; 
	    
	    public Person Clone() throws CloneNotSupportedException{
	    	System.out.println();
	    	return (Person) new Person();
	    }

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber
					+ ", jobTitle=" + jobTitle + ", skills=" + skills + ", education=" + education + ", hobbies="
					+ hobbies + "]";
		}
	    
}
