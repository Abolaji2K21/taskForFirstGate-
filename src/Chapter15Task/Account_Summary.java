package Chapter15Task;
public class Account_Summary{
    @Override
    public String toString() {
        return "Account_Summary{" +
                " id='" + id + '\'' +
                ", balance=" + amount +
                ", no_Of_Transaction=" + no_Of_Transaction +
                '}';
//
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getNo_Of_Transaction() {
        return no_Of_Transaction;
    }
    public void setNo_Of_Transaction(int no_Of_Transaction) {
        this.no_Of_Transaction = no_Of_Transaction;
    }
    public Account_Summary(int id , double amount, int no_Of_Transaction) {
        this.id = id;
        this.amount = amount;
        this.no_Of_Transaction = no_Of_Transaction;
    }
    public Account_Summary(){};
    private int id ;
    private double amount;
    private int no_Of_Transaction;


}
