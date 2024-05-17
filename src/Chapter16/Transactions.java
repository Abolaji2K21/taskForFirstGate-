package Chapter16;

public class Transactions {
    private String amount = "";
    private String accountNumber = "";


    public Transactions(){}
    public Transactions(String amount, String accountNumber){
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
