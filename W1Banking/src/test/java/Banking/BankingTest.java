package Banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Bank class")
class BankingTest {

	
	@Test
	@DisplayName("Deposit Test for depositamount of 4000")
	public void Deposittest() {
		//Banking.BALANCE = 1000;
		assertEquals(5000, Banking.deposit(Banking.BALANCE, 4000));
	}

	@Test
	@DisplayName("Withdraw Test for withdrawamount of 500")
	public void WithdrawTest() {
		//Banking.BALANCE = 1000;
		int expectedamount = Banking.withDraw(Banking.BALANCE, 500);
		assertEquals(4500, expectedamount);
	}
}


