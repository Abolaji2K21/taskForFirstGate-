package Chapter15Task;
public class Account_Summary{
    @Override
    public String toString() {
        return "Account_Summary{" +
                " id='" + id + '\'' +
                ", balance=" + balance +
                ", no_Of_Transaction=" + no_Of_Transaction +
                '}';
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public Account_Summary(int id , double balance, int no_Of_Transaction) {
        this.id = id;
        this.balance = balance;
        this.no_Of_Transaction = no_Of_Transaction;
    }
    public Account_Summary(){};
    private int id ;
    private double balance;
    private int no_Of_Transaction;


}
