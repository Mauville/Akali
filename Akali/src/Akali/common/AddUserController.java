package common;

import user.*;

import Akali.UserLogic;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import static Akali.UserLogic.createUserFile;

public class AddUserController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField RegUsername;
    @FXML
    private TextField RegEmail;
    @FXML
    private TextField RegPassword;
    @FXML
    private TextField RegMatricle;
    @FXML
    private ComboBox RegPrivilege;
    @FXML
    private Button SignIn;
    @FXML
    private Button SignUp;

    @FXML
    void HandleSignIn() {
    }

    @FXML
    void HandleSignUp() {

        AbstractUser user = new Admin();

        switch (RegPrivilege.getSelectionModel().getSelectedItem().toString()) {
            case "Consultant":
                Consultant banana = new Consultant();
                banana.setUsername(RegUsername.getText());
                banana.setPassword(RegPassword.getText());
                banana.setEmail(RegEmail.getText());
                banana.setMatricle(RegMatricle.getText());
                user = banana;
                break;

            case "Translator":
                Translator mango = new Translator();
                mango.setUsername(RegUsername.getText());
                mango.setPassword(RegPassword.getText());
                mango.setEmail(RegEmail.getText());
                mango.setMatricle(RegMatricle.getText());
                user = mango;
                break;

            case "Manager":
                Manager cherry = new Manager();
                cherry.setUsername(RegUsername.getText());
                cherry.setPassword(RegPassword.getText());
                cherry.setEmail(RegEmail.getText());
                cherry.setMatricle(RegMatricle.getText());
                user = cherry;
                break;

            case "Admin":
                Admin mangosteen = new Admin();
                mangosteen.setUsername(RegUsername.getText());
                mangosteen.setPassword(RegPassword.getText());
                mangosteen.setEmail(RegEmail.getText());
                mangosteen.setMatricle(RegMatricle.getText());
                user = mangosteen;
                break;

        }
        createUserFile(user);

        // TODO Implement user method using IO
    }
}
