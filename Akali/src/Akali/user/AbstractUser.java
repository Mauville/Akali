package Akali.user;

public abstract class AbstractUser {
    private String username, password;

    private void editAcc(String username, String password) {
        this.username = username;
        this.password = password;

    }
}

