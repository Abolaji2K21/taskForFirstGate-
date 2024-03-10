//package E_Store;
//
//import java.util.ArrayList;
//
//public class Admin extends User {
//    private final int adminId;
//    private final String username;
//    private final String password;
//    private boolean locked;
//    private ArrayList<Seller> mySellers;
//
//    public Admin(int adminId, String username, String password) {
//        this.adminId = adminId;
//        this.username = username;
//        this.password = password;
//        this.mySellers = new ArrayList<>();
//        this.locked = true;
//    }
//
//    public int getAdminId() {
//        return adminId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    private boolean isLocked() {
//        return locked;
//    }
//    public void addSellers(Seller seller) {
//        if(validateAdmin(username,password)) {
//            mySellers.add(seller);
//        }
//        else {
//            throw new IllegalStateException("Admin only");
//        }
//
//    }
//
//    public void removeSeller(Seller seller) {
//        if(validateAdmin(username,password)) {
//            mySellers.remove(seller);
//        } else {
//            throw new IllegalStateException("Admin only");
//        }
//    }
//
//    public ArrayList<Seller> getMySellers() {
//        if(validateAdmin(username,password)) {
//            return mySellers;
//        } else {
//            throw new IllegalStateException("Admin only");
//        }
//
//    }
//    public boolean validateAdmin(String enteredUsername, String enteredPassword) {
//        return username.equals(enteredUsername) && password.equals(enteredPassword);
//    }
//
//}
