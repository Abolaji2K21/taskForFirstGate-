package E_Store;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

class UserTest {

    @Test
    void login_correctCredentials_setsIsLoggedInTrue() {
        User user = new User(15, "email", "address", "username", "password", "phone");

        user.login("username", "password");

        assertTrue(user.isLoggedIn());
    }

    @Test
    void login_incorrectCredentials_throwsException() {
        User user = new User(1, "email", "address", "username", "password", "phone");

        assertThrows(InputMismatchException.class, () -> user.login("wrongUsername", "wrongPassword"));
    }


    @Test
    void login_correctCredentials_And_Then_Logout_Method_Works(){
        User user = new User(1, "email", "address", "username", "password", "phone");

        user.login("username", "password");
        user.logout();
        assertFalse(user.isLoggedIn());

    }
    @Test
    void login_IncorrectCredentials_And_Then_Logout_Method_Works(){
        User user = new User(1, "email", "address", "username", "password", "phone");

        assertThrows(InputMismatchException.class, () -> user.login("wrongUsername", "wrongPassword"));
        assertFalse(user.isLoggedIn());

    }

    @Test
    void login_Incorrect_username_throws_exception(){
        User user = new User(1, "email", "address", "username", "password", "phone");

        assertThrows(InputMismatchException.class, () -> user.login("wrongUsername", "password"));
    }

    @Test
    void login_Incorrect_password_throws_exception(){
        User user = new User(1, "email", "address", "username", "password", "phone");

        assertThrows(InputMismatchException.class, () -> user.login("username", "wrongPassword"));

    }


}

