package cam.xworkz.project1.tester;

import cam.xworkz.project1.things.PG;

public class PGTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  PG pg1 = new PG();
	        pg1.displayPGDetails();
	        PG pg2 = new PG("ssr");
	        pg2.displayPGDetails();
	        PG pg3 = new PG("ssr", "btm Stage1");
	        pg3.displayPGDetails();
	        PG pg4 = new PG("ssr", "btm Stage1", 20, 6.05);
	        pg4.displayPGDetails();
	       

	}

}
