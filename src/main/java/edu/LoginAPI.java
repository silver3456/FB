package edu;

public class LoginAPI {

    public static void main(String[] args) {

    }

    public String username;
    public String password;

    public void login(String username, String password) {
        authoriseUser();
        this.username = username;
        this.password = password;
        clickSignInButton();
    }

    public void authoriseUser() {
    }

    public void clickSignInButton() {
        System.out.println("click");
    }


}
