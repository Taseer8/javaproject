package cam.xworkz.project1.tester;

import cam.xworkz.project1.things.YouTube;

public class YoutubeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     YouTube video1 = new YouTube();
	        video1.displayDetails();

	       
	        YouTube video2 = new YouTube("deenlink");
	        video2.displayDetails();

	       
	        YouTube video3 = new YouTube("deenlink", "Denn Channel");
	        video3.displayDetails();

	        
	        YouTube video4 = new YouTube("deenlink", "Denn Channel", 12345);
	        video4.displayDetails();

	       
	        YouTube video5 = new YouTube("deenlink", "Denn Channel", 12345, 100000);
	        video5.displayDetails();

	        YouTube video6 = new YouTube("deenlink", "Denn Channel", 12345, 100000, 4.8);
	        video6.displayDetails();

	}

}
