package E_Store;

import java.util.ArrayList;

public class Admin extends User {
    private final int adminId;
    private ArrayList<Seller> mySellers;

    public Admin(int adminId, String username, String password) {
        super(0, "", "", username, password, "");
        this.adminId = adminId;
        this.mySellers = new ArrayList<>();
    }

    public int getAdminId() {
        return adminId;
    }

    public void addSeller(Seller seller) {
        if(validateAdmin()) {
            mySellers.add(seller);
        } else {
            throw new IllegalStateException("Admin only");
        }
    }

    public void removeSeller(Seller seller) {
        if(validateAdmin()) {
            mySellers.remove(seller);
        } else {
            throw new IllegalStateException("Admin only");
        }
    }

    public ArrayList<Seller> getMySellers() {
        if(validateAdmin()) {
            return mySellers;
        } else {
            throw new IllegalStateException("Admin only");
        }
    }

    private boolean validateAdmin() {
        return isLoggedIn();
    }
}
