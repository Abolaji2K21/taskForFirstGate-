package Banking_Sector_Test;
import Banking_Sector.Account;
import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void defaultStateOfMyAccount() {
        Account my_Account = new Account(123456768, "2458");
        assertEquals(0, my_Account.getBalance("2458"));
    }

    @Test
    public void depositNegativeBalance_balanceRemainUnchangedTest(){
        Account my_Account = new Account(123456768, "2458");

        assertEquals(0,my_Account.getBalance("2458"));
        my_Account.deposit(-50_000);
        assertEquals(0,my_Account.getBalance("2458"));
    }

    @Test
    public void depositPositiveAmount_balanceIncreaseTest(){
        Account my_Account = new Account(123456768, "2458");
        assertEquals(0,my_Account.getBalance("2458"));

        my_Account.deposit(2_000);
        assertEquals(2_000,my_Account.getBalance("2458"));

    }

    @Test
    public void depsoitPositiveAmountTwice_balanceIncreasesTest(){
        Account my_Account = new Account(123456768, "2458");
        assertEquals(0,my_Account.getBalance("2458"));

        my_Account.deposit(2_000);
        my_Account.deposit(4_000);
        assertEquals(6_000,my_Account.getBalance("2458"));


    }
    @Test
    public void withdrawNegativeAmount_balanceRemainUnchangedTest(){
        Account my_Account = new Account(123456768, "2458");
        assertEquals(0,my_Account.getBalance("2458"));
        assertThrows(InvalidAmountException.class, () -> my_Account.withdraw(-20_000, "2458"));

    }

    @Test

    public void withdrawPositiveAmount_balanceChangesTest(){
        Account my_Account = new Account(123456768, "2458");
        assertEquals(0,my_Account.getBalance("2458"));

        my_Account.deposit(1_200);
        my_Account.withdraw(1000, "2458");
        assertEquals(200,my_Account.getBalance("2458"));

    }

    @Test
    public void withdrawPositiveAmountTwice_balanceChangesTest(){
        Account my_Account = new Account(123456768, "2458");

        my_Account.deposit(1_200);
        my_Account.withdraw(1_000, "2458");
        my_Account.withdraw(200, "2458");

        assertEquals(0,my_Account.getBalance("2458"));

    }

    @Test
    public void withdrawPositiveAmountIsGreaterThanBalance_balanceRemainsUnChangesTest() {
        Account my_Account = new Account(123456768, "2458");

        my_Account.deposit(200);
        assertThrows(InsufficientFundsException.class, () ->my_Account.withdraw(1_200,"2458"));

    }

}
