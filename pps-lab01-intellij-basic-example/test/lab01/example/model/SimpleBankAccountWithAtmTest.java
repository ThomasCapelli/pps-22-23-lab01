package lab01.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBankAccountWithAtmTest {

    public static final int START_BALANCE = 0;
    public static final int DEPOSIT_AMOUNT = 150;
    public static final int WITHDRAW_AMOUNT = 50;
    private AccountHolder accountHolder;
    private BankAccount bankAccount;
    @BeforeEach
    void setUp() {
        accountHolder = new AccountHolder("Thomas", "Capelli", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, START_BALANCE);
    }
    @Test
    void testInitialBalance() {
        assertEquals(START_BALANCE, bankAccount.getBalance());
    }
    @Test
    void testDeposit() {
        bankAccount.deposit(accountHolder.getId(), DEPOSIT_AMOUNT);
        assertEquals(DEPOSIT_AMOUNT - SimpleBankAccountWithAtm.ATM_FEE, bankAccount.getBalance());
    }
    @Test
    void testWithdraw() {
        bankAccount.deposit(accountHolder.getId(), DEPOSIT_AMOUNT);
        bankAccount.withdraw(accountHolder.getId(), WITHDRAW_AMOUNT);
        assertEquals(DEPOSIT_AMOUNT - WITHDRAW_AMOUNT - (SimpleBankAccountWithAtm.ATM_FEE * 2), bankAccount.getBalance());
    }
}