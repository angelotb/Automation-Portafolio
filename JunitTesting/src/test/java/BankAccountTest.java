import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
     @Test
	public void testWithdraw() {
		BankAccount bankAccount = new BankAccount( 500, -1000);
		bankAccount.withdraw(300);
		assertEquals(200, bankAccount.getBalance());
	}
	
}
