package user;

import java.io.Serializable;

public abstract class AbstractUser implements Serializable {
    private String username;
    private String password;
    private String email;
    private String matricle;
    public String privilege = "CONSULTANT";

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        privilege = privilege;
    }

    private void editAcc(String username, String password) {
        this.username = username;
        this.password = password;

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricle() {
        return matricle;
    }

    public void setMatricle(String matricle) {
        this.matricle = matricle;
    }
}

