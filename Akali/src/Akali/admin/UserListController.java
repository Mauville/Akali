package Akali.admin;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

import java.io.*;

public class UserListController {

    @FXML
    private TableColumn username;
    @FXML
    private TableColumn matricle;
    @FXML
    private TableColumn privileges;
    @FXML
    private TableColumn buttoncol;
    @FXML
    private Button backbutt;

    @FXML
    void handleBackButton(){}

    public boolean createFile(Object u) {
        boolean confirmed = false;
        try {
            FileOutputStream fos = new FileOutputStream("admin.alv", true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Crear file
            //Consultar existencia
            //Borrar mijos
            oos.writeObject(u);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return confirmed;
    }


    public boolean consultFile() {
        boolean confirmed = true;

        try {
            FileInputStream fis = new FileInputStream("");
            ObjectInputStream ois = new ObjectInputStream(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return confirmed;
    }

    public boolean

}
