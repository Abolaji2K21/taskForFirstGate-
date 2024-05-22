package Chapter15Task;

public class Account_Summary{
    @Override
    public String toString() {
        return "Account_Summary{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", no_Of_Transaction=" + no_Of_Transaction +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNo_Of_Transaction() {
        return no_Of_Transaction;
    }

    public void setNo_Of_Transaction(int no_Of_Transaction) {
        this.no_Of_Transaction = no_Of_Transaction;
    }

    public int getAccountNumber(){
        return accountNumber;
    };

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    };

    public Account_Summary(String name, double balance, int no_Of_Transaction) {
        this.name = name;
        this.balance = balance;
        this.no_Of_Transaction = no_Of_Transaction;
    }

    public Account_Summary(){};

    private String name ;
    private double balance;
    private int no_Of_Transaction;


}
