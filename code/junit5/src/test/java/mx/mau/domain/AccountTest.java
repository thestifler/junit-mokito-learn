package mx.mau.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class AccountTest {

    /**
     * 
     */
    @Test
    void testAccountName(){
        Account account = new Account("Mauricio",new BigDecimal(33333.33333));

        String name="Mauricio";
        String testName=account.getName();
        assertNotNull(testName);
        assertNotNull(account.getAmount());
        assertEquals(name, testName);
        
    }


    /**
     * 
     */
    @Test
    void testAccountAmount(){
        Account account = new Account("Mauricio",new BigDecimal(33333.333333));
        assertEquals(33333.333333, account.getAmount().doubleValue());
        assertNotNull(account.getName());
        assertNotNull(account.getAmount());
        assertFalse(account.getAmount().compareTo(BigDecimal.ZERO)<0);
        assertFalse(account.getAmount().compareTo(BigDecimal.ZERO)>0);

    }

    @Test
    void testAccountRefenceObject(){
        Account account = new Account("Mauricio",new BigDecimal(33333.333333));
        Account accountclone = new Account("Mauricio",new BigDecimal(33333.333333));
        assertEquals(account, accountclone);

    }

    @Test
    public void debitAccount(){
                Account account = new Account("Mauricio",new BigDecimal(500000.500000));
                account.debit(new BigDecimal(100000));
                assertNotNull(account.getAmount());
                assertEquals(400000, account.getAmount().intValue());
                assertEquals("400000.5", account.getAmount().toPlainString());


    }
    @Test
    public void creditAccount(){
                Account account = new Account("Mauricio",new BigDecimal(500000.500000));
                account.credit(new BigDecimal(100000));
                assertNotNull(account.getAmount());
                assertEquals(600000, account.getAmount().intValue());
                assertEquals("600000.5", account.getAmount().toPlainString());


    }
}
