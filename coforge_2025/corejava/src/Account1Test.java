import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Account1Test {

	Account1 account1;

	@BeforeEach
	void setUp() throws Exception {
		account1 = new Account1();
		account1.setBalance(2000);
	}

	@Test
	void getBalancetest() {
		assertEquals(account1.getBalance(), 2000);
		System.out.println("initial balance is " + account1.getBalance());
	}

	@Test
	void deposittest() {
		account1.deposit(600);
		assertEquals(account1.getBalance(), 2600);
		System.out.println("after deposit of 600   balance is " + account1.getBalance());
	}

	@Test
	void withdrawtest() {
		account1.withdraw(1000);
		assertEquals(account1.getBalance(), 1000);
		System.out.println("after withdraw 1000  balance is " + account1.getBalance());
	}

}
