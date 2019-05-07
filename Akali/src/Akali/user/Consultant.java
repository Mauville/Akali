package user;

import java.io.Serializable;

public class Consultant extends AbstractUser implements Serializable {
    public void analyze() {
    }
    public static String getPrivilege(){
        return "CONSULTANT";
    }
}
