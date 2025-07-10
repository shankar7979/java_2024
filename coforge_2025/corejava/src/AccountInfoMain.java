
public class AccountInfoMain {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount();

		CurrentAccount currentAccount = new CurrentAccount();

		savingAccount.setAccountNo(6565655);
		savingAccount.setAccountName("anand kumar");
		savingAccount.setBalance(25000);
		savingAccount.setLocation("new delhi");

		currentAccount.setAccountNo(766567);
		currentAccount.setAccountName("suresh kumar");
		currentAccount.setBalance(40000);
		currentAccount.setCity("chennai");
		currentAccount.setInterestRate(0.05f);

		savingAccount.printAccountInfo();
		currentAccount.printAccountInfo();

	}
}
