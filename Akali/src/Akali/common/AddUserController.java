package Akali;


import Akali.user.Admin;
import Akali.user.Consultant;
import Akali.user.Manager;
import Akali.user.Translator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
    void HandleSignIn(String username, String password) {

    }
    @FXML
    void HandleSignUp() {

        Consultant user = new Consultant();
        user.setUsername(RegUsername.getText());
        user.setPassword(RegPassword.getText());
        user.setEmail(RegEmail.getText());
        user.setMatricle(RegMatricle.getText());

        Translator user = new Translator();
        user.setUsername(RegUsername.getText());
        user.setPassword(RegPassword.getText());
        user.setEmail(RegEmail.getText());
        user.setMatricle(RegMatricle.getText());

        Manager user = new Translator();
        user.setUsername(RegUsername.getText());
        user.setPassword(RegPassword.getText());
        user.setEmail(RegEmail.getText());
        user.setMatricle(RegMatricle.getText());

        Manager user = new Translator();
        user.setUsername(RegUsername.getText());
        user.setPassword(RegPassword.getText());
        user.setEmail(RegEmail.getText());
        user.setMatricle(RegMatricle.getText());

        Admin user = new Translator();
        user.setUsername(RegUsername.getText());
        user.setPassword(RegPassword.getText());
        user.setEmail(RegEmail.getText());
        user.setMatricle(RegMatricle.getText());
    }
}
