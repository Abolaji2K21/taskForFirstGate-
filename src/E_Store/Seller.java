package E_Store;

public class Seller extends User {
    private int sellerId;
    private String name;
    private String description;

    public Seller(int age, String email, String homeAddress, String name, String password, String phone) {
        super(age, email, homeAddress, name, password, phone);
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }
}
