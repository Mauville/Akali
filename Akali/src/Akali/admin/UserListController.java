// Each user's button should make a new popup window with ChangeUser and the object loaded in memory
//FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("NewWindow.fxml"));
//        /*
//         * if "fx:controller" is not set in fxml
//         * fxmlLoader.setController(NewWindowController);
//         */
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        Stage stage = new Stage();
//        stage.setTitle("New Window");
//        stage.setScene(scene);
//        stage.show();

package admin;

import common.ChangeUserController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import resource.AbstractResource;
import user.AbstractUser;
import user.AbstractUser;
import user.InfoManager;
import vistanavigator.MainController;
import vistanavigator.VistaNavigator;

import java.io.*;

import static logic.Browse.getIRes;
import static logic.Browse.getIUser;

import static vistanavigator.VistaNavigator.getMainController;

public class UserListController {

    @FXML
    private TableView<AbstractUser> table;
    @FXML
    private TableColumn <AbstractUser,String> username;
    @FXML
    private TableColumn <AbstractUser,String>matricle;
    @FXML
    private TableColumn <AbstractUser,String>privileges;
    @FXML
    private TableColumn <AbstractUser,String>buttoncol;
    @FXML
    private Button backbutt;
    @FXML
    private Button colButt;

    @FXML
    void handleBackButton() {
        VistaNavigator.loadVista(VistaNavigator.COMMON_ADDUSER);
    }

    //Method to handle the button at the last row
    @FXML
    void handleColButt() {
        // Pass data to next scene controller:
        // This is the instance of abstract user to pass to the next
        AbstractUser theOneYouChoose = new InfoManager();
        theOneYouChoose.setEmail("demo@demo.com");
        ChangeUserController writeBuffer = new ChangeUserController();
        VistaNavigator.persistUser(theOneYouChoose, writeBuffer);

    }

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

    @FXML
    void initialize(){
        username.setCellValueFactory(new PropertyValueFactory<AbstractUser, String>("username"));
        matricle.setCellValueFactory(new PropertyValueFactory<AbstractUser, String>("matricle"));
        privileges.setCellValueFactory(new PropertyValueFactory<AbstractUser, String>("privileges"));
        buttoncol.setCellValueFactory(new PropertyValueFactory<AbstractUser, String>("button"));
        table.setItems(getIUser());
    }
}
