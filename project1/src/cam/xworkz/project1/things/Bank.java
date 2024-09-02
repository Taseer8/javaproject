package cam.xworkz.project1.things;

public class Bank {
	 public String bankName;
	 public String branchName;
	 public int branchCode;
	 public String managerName;
	 public double totalBalance;
	public Bank() {
		// TODO Auto-generated constructor stub
		System.out.println("no arguments");
		
	}
	public Bank(String bankName) {
        this.bankName = bankName;
	}
	 public Bank(String bankName, String branchName) {
	        this.bankName = bankName;
	        this.branchName = branchName;
	 }
	 public Bank(String bankName, String branchName, int branchCode) {
	        this.bankName = bankName;
	        this.branchName = branchName;
	        this.branchCode = branchCode;
	       
	    }
	 public Bank(String bankName, String branchName, int branchCode, String managerName) {
	        this.bankName = bankName;
	        this.branchName = branchName;
	        this.branchCode = branchCode;
	        this.managerName = managerName;
	 }
	
	 public Bank(String bankName, String branchName, int branchCode, String managerName, double totalBalance) {
	        this.bankName = bankName;
	        this.branchName = branchName;
	        this.branchCode = branchCode;
	        this.managerName = managerName;
	        this.totalBalance = totalBalance;
	    }
	  public void displayDetails() {
	        System.out.println("Bank Name: " + bankName);
	        System.out.println("Branch Name: " + branchName);
	        System.out.println("Branch Code: " + branchCode);
	        System.out.println("Manager Name: " + managerName);
	        System.out.println("Total Balance: Rs" + totalBalance);
	        System.out.println("--------------------------");
	    }
	

}
