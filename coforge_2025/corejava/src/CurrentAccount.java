
public class CurrentAccount extends AccountInfo {

	private float interestRate;
	private String city;

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void printAccountInfo() {
		System.out.println("Current account info");
		System.out.println("\tAccount No " + getAccountNo());
		System.out.println("\tName " + getAccountName());
		System.out.println("\tBalance " + getBalance());
		System.out.println("\tCity " + getCity());
		System.out.println("\tInterest Rate " + getInterestRate());
	}

}
