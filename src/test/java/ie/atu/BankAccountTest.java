package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    public void setUp()
    {
        account = new BankAccount();
    }
    void constructorInit ()
    {
        account = new BankAccount("ACC12345", "Paul", 100);
        assertEquals("ACC12345", account.getAccNo());
        assertEquals("Paul", account.getName());
        assertEquals(100, account.getBalance());
    }
    @Test
    void constructorNegativeInit ()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new BankAccount("ACC12345", "Paul", -1));
        assertEquals("Balance must be positive", ex.getMessage());
    }

}
