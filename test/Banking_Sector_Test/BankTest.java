package Banking_Sector_Test;
import Banking_Sector.Account;
import Banking_Sector.Bank;
import Exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BankTest {


    @Test
    public void testRegistrationOfMoreThanTwoCustomer(){
        Bank bank = new Bank("Bee_jayBank");
        Account myAccount = bank.registerCustomer("Am", "Tired", "1234");
        Account myAccount1 = bank.registerCustomer("Am", "Frustrated", "4321");
        Account myAccount2 = bank.registerCustomer("Am", "Angry", "2356");

        assertEquals(3, bank.getAccounts().size());
    }
    @Test
    public void testRegisterCustomer() {
        Bank bank = new Bank("Bee_jayBank");
        Account myAccount = bank.registerCustomer("Am", "Tired", "1234");

        assertEquals("Am Tired", myAccount.getFullName());

    }

    @Test
    public void testThatAfterRegistrationYouCanDeleteAnAccount(){
        Bank bank = new Bank("Bee_jayBank");
        Account myAccount = bank.registerCustomer("Am", "Tired", "1234");
        Account myAccount1 = bank.registerCustomer("Am", "Frustrated", "4321");
        Account myAccount2 = bank.registerCustomer("Am", "Angry", "2356");

        bank.removeAccount(myAccount1.getAccountNumber(), "4321");

        assertEquals(2, bank.getAccounts().size());


    }
    @Test
    public void testThatAfterRegistrationYouCanDeleteAnAccountTwice(){
        Bank bank = new Bank("Bee_jayBank");
        Account myAccount = bank.registerCustomer("Am", "Tired", "1234");
        Account myAccount1 = bank.registerCustomer("Am", "Frustrated", "4321");
        Account myAccount2 = bank.registerCustomer("Am", "Angry", "2356");

        bank.removeAccount(myAccount1.getAccountNumber(), "4321");
        bank.removeAccount(myAccount.getAccountNumber(), "1234");


        assertEquals(1, bank.getAccounts().size());

    }

    @Test
    public void testThatAfterRegistrationYouCanNotDeleteAnAccountAfterAWrongPin(){
        Bank bank = new Bank("Bee_jayBank");
        Account myAccount = bank.registerCustomer("Am", "Tired", "1234");

        bank.removeAccount(myAccount.getAccountNumber(), "1345");
        assertEquals(1, bank.getAccounts().size());

    }

    @Test
    public void testThatYouCanDeposit() {
        Bank bank = new Bank("Bee_jayBank");
        Account myAccount = bank.registerCustomer("Am", "Tired", "1234");
        int accountNumber = myAccount.getAccountNumber();

        bank.deposit(1000, accountNumber);
        assertEquals(1000, myAccount.getBalance("1234"));
    }

    @Test
    public void testThatYouCanDepositTwice() {
        Bank bank = new Bank("Bee_jayBank");
        Account myAccount = bank.registerCustomer("Am", "Tired", "1234");
        int accountNumber = myAccount.getAccountNumber();

        bank.deposit(1000, accountNumber);
        bank.deposit(1000, accountNumber);
        assertEquals(2000, myAccount.getBalance("1234"));
    }

    @Test
    public void testThatYouCanNotDepositIfYourPinIsWrong() {
        Bank bank = new Bank("Bee_jayBank");
        Account myAccount = bank.registerCustomer("Am", "Tired", "1234");
        int accountNumber = myAccount.getAccountNumber();

        bank.deposit(1000, accountNumber);
        bank.deposit(1000, accountNumber);
        assertThrows(InvalidPinException.class,() -> myAccount.getBalance("3429"));
    }


}
