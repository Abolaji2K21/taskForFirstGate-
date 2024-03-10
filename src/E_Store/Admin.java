package E_Store;

import java.util.ArrayList;

public class Admin extends User {
//    private final int adminId;
    private ArrayList<Seller> mySellers;

    public Admin(String username, String password) {
        super(0, "", "", username, password, "");
//        this.adminId = adminId;
        this.mySellers = new ArrayList<>();
    }

//    public int getAdminId() {
//        return adminId;
//    }

    public void addSellers(Seller seller, String username, String password) {
        if(validateAdmin(username,password)) {
            mySellers.add(seller);
        } else {
            throw new IllegalStateException("Admin only");
        }
    }

    public void removeSeller(Seller seller, String username, String password) {
        if(validateAdmin(username,password)) {
            mySellers.remove(seller);
        } else {
            throw new IllegalStateException("Admin only");
        }
    }

    public ArrayList<Seller> getMySellers(String username, String password) {
        if(validateAdmin(username,password)) {
            return mySellers;
        } else {
            throw new IllegalStateException("Admin only");
        }
    }


    private boolean validateAdmin(String username, String password) {
        return getUserName().equals(username) && getPassword().equals(password);
    }

    public Seller getUniqueSeller(String username, String password, int sellerId) {
        if (validateAdmin(username, password)) {
            for (Seller seller : mySellers) {
                if (seller.getSellerId() == sellerId) {
                    return seller;
                }
            }
            throw new IllegalStateException("Seller not found");
        } else {
            throw new IllegalStateException("Admin only");
        }
    }



}
