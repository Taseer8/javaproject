package cam.xworkz.project1.tester;

import cam.xworkz.project1.things.Software;

public class SoftwareTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Software software1 = new Software();
	        software1.displaySoftwareDetails();

	        Software software2 = new Software("Microsoft Office");
	        software2.displaySoftwareDetails();

	        Software software3 = new Software("Adobe Photoshop", "2024");
	        software3.displaySoftwareDetails();
	       
	        Software software4 = new Software("eclipse", "2022-23", "Windows", 199.99);
	        software4.displaySoftwareDetails();

	}

}
