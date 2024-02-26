package Banking_Sector;

import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAccountNumberException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Bank {
    private String name;
    private final ArrayList<Account> accounts;


    public Bank(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }


    public Account findAccount(int accountNumber){
        for(Account myAccount : accounts){
            if(myAccount.getAccountNumber()== accountNumber){
                return myAccount;
            }
        }
        return null;
    }

    public void deposit(int amount,int accountNumber){
        Account myAccount = findAccount(accountNumber);
        if (myAccount != null){
            myAccount.deposit(amount);
        } else {
            throw new InvalidAccountNumberException("Account Number Not Found");
        }

    }

    public void withdraw(int amount, int accountNumber, String pin){
        Account myAccount = findAccount(accountNumber);
        if (myAccount != null) {
            try {
                myAccount.withdraw(amount, pin);
            } catch (InvalidPinException | InsufficientFundsException | InvalidAmountException ignored) {

            }
        } else throw new InvalidAccountNumberException("Account Number Not Found");

    }

    public void transfer(int amount, int fromAccountNumber, int toAccountNumber, String pin) {
        Account sourceAccount = findAccount(fromAccountNumber);
        Account destinationAccount = findAccount(toAccountNumber);

        if (sourceAccount == null)
            throw new InvalidAccountNumberException("Account Number Not Found");

        if (destinationAccount == null)
            throw new InvalidAccountNumberException("Account Number Not Found");

        try {
            sourceAccount.withdraw(amount, pin);
        } catch (InvalidPinException | InsufficientFundsException | InvalidAmountException ignored) {

        }
        destinationAccount.deposit(amount);
    }

    public int checkBalance(int accountNumber, String pin) {
        Account myAccount = findAccount(accountNumber);

        if (myAccount != null) if (myAccount.validatePin(pin)) {
            return myAccount.getBalance(pin);
        } else throw new InvalidPinException("Invalid PIN");
        else throw new InvalidAccountNumberException("Account not found");
    }

    public Account registerCustomer(String firstName, String lastName, String pin ){
        int accountNumber = generateAccountNumber();
        Account myAccount = new Account(accountNumber, pin);
        myAccount.setFirstName(firstName);
        myAccount.setLastName(lastName);

        accounts.add(myAccount);
        return myAccount;
    }
    public void removeAccount(int accountNumber, String pin){
        Account myAccount = findAccount(accountNumber);
        if (myAccount != null) {
          if (myAccount.validatePin(pin))
            accounts.remove(myAccount);
        }
    }


    public int generateAccountNumber(){
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(1000000);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}


