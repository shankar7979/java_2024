public class SavingAccount  extends AccountInfo{
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void printAccountInfo() {
		System.out.println("Saving account info");
		System.out.println("\tAccount No "+getAccountNo());
		System.out.println("\tName "+getAccountName());
		System.out.println("\tBalance "+getBalance());
		System.out.println("\tLocation "+getLocation());
	}

}
