//package E_Store;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.*;
//
//class AdminTest {
//    private Admin admin;
//
//    @BeforeEach
//    public void init() {
//        admin = new Admin(1, "John Doe", "password");
//    }
//
//    @Test
//    public void addSeller_validAdmin_successful() {
//        Seller seller = new Seller(1, "Seller Name", "Seller Description", 100.00);
//        admin.addSeller(seller);
//        assertTrue(admin.getMySellers().contains(seller));
//    }
//
//    @Test
//    public void addSeller_invalidAdmin_throwsIllegalStateException() {
//        Seller seller = new Seller(1, "Seller Name", "Seller Description", 100.00);
//        admin.locked = false;
//        assertThrows(IllegalStateException.class, () -> admin.addSeller(seller));
//    }
//
//    @Test
//    public void removeSeller_validAdmin_successful() {
//        Seller seller = new Seller(1, "Seller Name", "Seller Description", 100.00);
//        admin.addSeller(seller);
//        admin.removeSeller(seller);
//        assertFalse(admin.getMySellers().contains(seller));
//    }
//
//    @Test
//    public void removeSeller_invalidAdmin_throwsIllegalStateException() {
//        Seller seller = new Seller(1, "Seller Name", "Seller Description", 100.00);
//        admin.locked = false;
//        assertThrows(IllegalStateException.class, () -> admin.removeSeller(seller));
//    }
//}{
//
//}