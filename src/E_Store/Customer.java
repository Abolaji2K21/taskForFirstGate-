package E_Store;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Billing_Info> billingInfo;
    private ShoppingCart shoppingCart;

    public Customer(int age, String email, String homeAddress, String name, String password, String phone) {
        super(age, email, homeAddress, name, password, phone);
        this.billingInfo = new ArrayList<>();
        this.shoppingCart = new ShoppingCart();
    }

    public void addBillingInfo(Billing_Info info) {
        billingInfo.add(info);
    }

    public void removeBillingInfo(Billing_Info info) {
        billingInfo.remove(info);
    }

    public ArrayList<Billing_Info> getBillingInfo() {
        return billingInfo;
    }

    public void addToCart(Product product, int quantity) {
        shoppingCart.addToCart(product, quantity);
    }

    public void removeFromCart(Product product, int quantity) {
        shoppingCart.removeFromCart(product, quantity);
    }

    public void clearCart() {
        shoppingCart.clearCart();
    }

    public ArrayList<Item> viewCart() {
        return shoppingCart.getCartItems();
    }
}
