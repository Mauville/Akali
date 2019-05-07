package common;

import admin.UserListController;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import user.AbstractUser;
import vistanavigator.MainController;
import vistanavigator.VistaNavigator;

public class ChangeUserController {
    @FXML
    private Label title;
    @FXML
    private TextField name;
    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private TextField matricle;
    @FXML
    private ChoiceBox privilege;
    @FXML
    private Button save;
    @FXML
    private Button cancel;

    private AbstractUser buffered;

    @FXML
    void HandleSave() {

    }

    @FXML
    void HandleBack() {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();

    }

    @FXML
    private void initialize() {
        //Load data from main controller
        MainController main = VistaNavigator.getMainController();
        ChangeUserController buffered = main.getBufferedUserListController();
        // Load instace of past Abstract User
        AbstractUser buffUser = buffered.getBuffered();
    }

    public AbstractUser getBuffered() { return buffered; }

    public void setBuffered(AbstractUser buffered) { this.buffered = buffered; }

}
