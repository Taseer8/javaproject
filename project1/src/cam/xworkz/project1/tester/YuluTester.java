package cam.xworkz.project1.tester;

import cam.xworkz.project1.things.Yulu;

public class YuluTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yulu yulu1 = new Yulu();
        yulu1.displayYuluDetails();
        System.err.println("..............");

        Yulu yulu2 = new Yulu("Yulu ");
        yulu2.displayYuluDetails();
        System.err.println("..............");

        Yulu yulu3 = new Yulu("Yulu W", "Blue");
        yulu3.displayYuluDetails();

        System.err.println("..............");

        Yulu yulu4 = new Yulu("Yulu M", "Red", 2000, 15000.0);
        yulu4.displayYuluDetails();

	}

}
