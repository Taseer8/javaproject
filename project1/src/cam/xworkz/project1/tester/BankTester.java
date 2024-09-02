package cam.xworkz.project1.tester;

import cam.xworkz.project1.things.Bank;

public class BankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = new Bank();
        bank1.displayDetails();

        // Using constructor with 1 parameter
        Bank bank2 = new Bank("National Bank");
        bank2.displayDetails();

        // Using constructor with 2 parameters
        Bank bank3 = new Bank("State Bank", "Main Branch");
        bank3.displayDetails();

        // Using constructor with 3 parameters
        Bank bank4 = new Bank("City Bank", "Kalma stree branch", 768);
        bank4.displayDetails();
        
        Bank bank5 = new Bank("union bank of india", "Main Branch", 456, "taseer");
        bank5.displayDetails();
        
        Bank bank6 = new Bank("HDFC", "Main Branch", 6778, "zuber", 1000000.00);
        bank6.displayDetails();

	}

}
