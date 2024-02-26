package Banking_Sector;

import Exceptions.InvalidPinException;

public class BankApp {
    private Bank bank;

    public BankApp(String bankName) {
        this.bank = new Bank(bankName);
    }

    public static void main(String[] args) {
        BankApp bankApp = new BankApp("Bee_jayBank");

        Account customer1 = bankApp.bank.registerCustomer("Am", "Tired", "1234");
        Account customer2 = bankApp.bank.registerCustomer("Am", "Frustrated", "4321");

        bankApp.bank.deposit(2000, customer1.getAccountNumber());
        bankApp.bank.deposit(3500, customer2.getAccountNumber());

        try {
            bankApp.bank.withdraw(500, customer1.getAccountNumber(), "1234");
        } catch (InvalidPinException e) {
            System.out.println("Invalid PIN entered: " + e.getMessage());
        }

       System.out.println("Am Tired Balance: " + bankApp.bank.checkBalance(customer1.getAccountNumber(), "1234"));
        System.out.println("Am Frustrated Balance: " + bankApp.bank.checkBalance(customer2.getAccountNumber(), "4321"));
    }
}
