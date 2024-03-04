package Banking_Sector;

import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;

public class Account {
    private int balance;
    private String pin;
    private int accountNumber ;
    private String firstName;
    private String lastName;

    public Account(int accountNumber,String pin){
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public boolean validatePin(String key) {
        return pin.equals(key);
    }

    public int getBalance(String pin){
        if (!validatePin(pin)){
            throw new InvalidPinException("Invalid PIN");
        }
        return balance;
    }


    public void deposit(int amount){
        if (amount <= 0){
            throw new InvalidAmountException("Invalid deposit amount");
        }
        balance += amount;

    }

    public void withdraw(int amount, String pin) {
        if(!validatePin(pin)){
            throw new InvalidPinException("Invalid PIN");
        }
        if (amount < 0 ) {
            throw new InvalidAmountException("Invalid withdrawal amount");
        }
        if (amount > balance){
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;

    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        String firstName = getFirstName();
        String lastName = getLastName();

        return firstName + " " + lastName;
    }


}
