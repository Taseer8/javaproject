package cam.xworkz.project1.tester;

import java.time.LocalDate;

import cam.xworkz.project1.things.Think;

public class ThinkTester {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Think think = new Think();
		think.getThinkDetails();
		think.getThinkType("something");
		System.out.println(think.getDate(LocalDate.now()));
		System.out.println(think.getTime());
		
	}

}
