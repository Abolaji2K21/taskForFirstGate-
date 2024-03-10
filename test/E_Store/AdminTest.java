package E_Store;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class AdminTest {
    private Admin admin;

    @BeforeEach
    public void init() {
        admin = new Admin("Okay", "password");
    }

    @Test
    public void addSeller_validAdmin_successful() {
        Seller seller = new Seller(45, "Seller002@gmail.com", "23,semicolon ave", "ok", "password", "08134867544");
        admin.addSellers(seller, "Okay", "password");
        assertTrue(admin.getMySellers("Okay", "password").contains(seller));
    }

    @Test
    public void addSeller_invalidAdmin_throwsIllegalStateException() {
        Seller seller = new Seller(45, "Seller002@gmail.com", "23,semicolon ave", "ok", "password", "08134867544");
        assertThrows(IllegalStateException.class, () -> admin.addSellers(seller, "Okay1", "password"));
    }

    @Test
    public void removeSeller_validAdmin_successful() {
        Seller seller = new Seller(45, "Seller002@gmail.com", "23,semicolon ave", "ok", "password", "08134867544");
        admin.addSellers(seller, "Okay", "password");
        admin.removeSeller(seller, "Okay", "password");
        assertFalse(admin.getMySellers("Okay", "password").contains(seller));
    }

    @Test
    public void removeSeller_invalidAdmin_throwsIllegalStateException() {
        Seller seller = new Seller(45, "Seller002@gmail.com", "23,semicolon ave", "ok", "password", "08134867544");
        assertThrows(IllegalStateException.class, () -> admin.removeSeller(seller, "Okay1", "password"));
    }
}
