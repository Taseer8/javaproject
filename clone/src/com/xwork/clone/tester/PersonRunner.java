package com.xwork.clone.tester;

import com.xwork.clone.things.Person;

public class PersonRunner {

	public static void main(String[] args) {
		Person person = new Person();
		person.name ="taseer";
		person.age =24;
		person.education = "B.E";
		person.phoneNumber = 7022618056l;
		person.jobTitle = "developer";
		person.skills = "full stack java developer";
		person.hobbies = "reading books , playing cricket, batmanten";
		
		try {
			Person person1 = person.Clone();
			
			System.out.println("personal details"+person);
			person1.Clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
