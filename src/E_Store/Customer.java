package E_Store;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Billing_Info> billingInfo;
    private ShoppingCart shoppingCart;

    public Customer(int age, String email, String homeAddress, String name, String password, String phone) {
        super(age, email, homeAddress, name, password, phone);
    }
}
