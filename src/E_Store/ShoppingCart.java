package E_Store;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) {
        for (Item item : cartItems) {
            if (item.getProduct().getProductId() == product.getProductId()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        cartItems.add(new Item(product, quantity));
    }

    public void removeFromCart(Product product, int quantity) {
        for (Item item : cartItems) {
            if (item.getProduct().getProductId() == product.getProductId()) {
                if (item.getQuantity() > quantity) {
                    item.setQuantity(item.getQuantity() - quantity);
                } else {
                    cartItems.remove(item);
                }
                return;
            }
        }
    }

    public void clearCart() {
        cartItems.clear();
    }

    public ArrayList<Item> getCartItems() {
        return cartItems;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Item item : cartItems) {
            total += item.getProduct().getProductPrice() * item.getQuantity();
        }
        return total;
    }
}
