package lab01.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBankAccountWithAtmTest {

    private AccountHolder accountHolder;
    private BankAccount bankAccount;
    @BeforeEach
    void setUp() {
        accountHolder = new AccountHolder("Thomas", "Capelli", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }
    @Test
    void testInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }
    @Test
    void testDeposit() {
        bankAccount.deposit(accountHolder.getId(), 150);
        assertEquals(149, bankAccount.getBalance());
    }
    @Test
    void testWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(accountHolder.getId(), 50);
        assertEquals(48, bankAccount.getBalance());
    }
}