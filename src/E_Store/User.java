package E_Store;

import java.util.InputMismatchException;

public class User {

    private int age;
    private String email;
    private String homeAddress;
    private String userName;
    private String password;
    private String phone;
    private boolean isLoggedIn;


    public User(int age, String email, String homeAddress, String userName, String password, String phone) {
        this.age = age;
        this.email = email;
        this.homeAddress = homeAddress;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void login(String username, String password) {
        validateUsername(username);
        validatePassword(password);
        isLoggedIn = true;

    }

    private void validateUsername(String username) {
        if (!this.userName.equals(username)) {
            throw new InputMismatchException("Wrong username");
        }
    }

    private void validatePassword(String password) {
        if (!this.password.equals(password)) {
            throw new InputMismatchException("Wrong password");
        }
    }

    public void logout(){
        isLoggedIn = false;

    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

}
