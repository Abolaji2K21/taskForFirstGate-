package LeetCodeWorkForce;

public class PasswordValidation {

    public static Boolean validation(String password){
        return password.matches("^(?=.*[A-Z])(?=.*\\d)[A-Za-z]\\w{6,14}$");

    }
}
