package E_Store;

import java.util.ArrayList;

public class Seller extends User {
    private final int sellerId;
    private ArrayList<Customer> customers;

    public Seller(int sellerId, String email, String homeAddress, String name, String password, String phone) {
        super(0, email, homeAddress, name, password, phone);
        this.sellerId = sellerId;
        this.customers = new ArrayList<>();
    }

    public int getSellerId() {
        return sellerId;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
