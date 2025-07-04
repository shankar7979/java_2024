
public class Bank {

	private int bankId;
	private String bankName;
	private String bankLocation; // instance variable

	private static String country; // static or class variable , only one copy is shared by all objects

	private static int count=0;
      // constructor initializes the instance variable 	
	public Bank(int bankId, String bankName, String bankLocation) {
		super();
		count++;
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankLocation = bankLocation;
	}
	// static block initializes the static members 
	static {
		country="india";
		System.out.println("static block");
	}

	public static void main(String[] args) {
		
		Bank bank=new Bank(878787, "sbi", "delhi");
		Bank bank1=new Bank(878781, "hdfc", "aagra");
		Bank bank2=new Bank(878782, "pnb", "mathura");

		System.out.println("bank id "+bank.bankId);
		System.out.println("bank name "+bank.bankName);
		System.out.println("bank location "+bank.bankLocation);
		System.out.println("bank country  "+Bank.country);
		
		System.out.println("the no of bank object is  "+bank.count);
		System.out.println("the no of bank object is  "+Bank.count);
	}
}
