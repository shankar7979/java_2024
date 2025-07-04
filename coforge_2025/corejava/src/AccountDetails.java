import java.util.Scanner;

public class AccountDetails {

	Scanner scanner = new Scanner(System.in);

	public Account getAccountDetails() {

		Account account = new Account();

		System.out.println("Enter Account Id");
		account.setAccountId(scanner.nextInt());

		System.out.println("Enter Account Type");
		account.setAccountType(scanner.next());
		int bal = 0;

		while (bal > 0) {
			System.out.println("Enter balance");
			bal = scanner.nextInt();
			if (bal <= 0) {
				System.out.println("Balance should be positive");
				account.setBalance(bal);
			}
		}
		return account;
	}

	public int getWithdrawAmount() {
		int amt = 0;
		while (amt > 0) {
			System.out.println("Enter amount to be withdrawn");
			amt = scanner.nextInt();
			if (amt <= 0) {
				System.out.println("Amount should be positive");
			} else {
				Account a1 = getAccountDetails();
				a1.withdraw(amt);
//				return a1.getBalance();
				return amt;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		AccountDetails accountDetails=new AccountDetails();
		Account account = accountDetails.getAccountDetails();
		int withdrawAmount = accountDetails.getWithdrawAmount();
		//account.withdraw(withdrawAmount	);
	}
}
