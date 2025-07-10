
public class Account1 {

	 private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	 
	void deposit(int amt) {
		this.balance=this.balance+amt;
	}
	void withdraw(int amt) {
		if(amt>getBalance()) {
			System.out.println("insufficeint balance");
		}
		else {
			this.balance=this.balance-amt;
		}
	}
}
