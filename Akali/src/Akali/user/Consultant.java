package user;

import java.io.Serializable;

public class Consultant extends AbstractUser implements Serializable {
    public void analyze() {
    }
    public String getPrivilege(){
        return "CONSULTANT";
    }
}
