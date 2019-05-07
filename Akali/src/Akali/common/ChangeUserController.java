package common;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

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
    }
}
