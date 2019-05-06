package common;

import user.*;

import logic.UserLogic;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import vistanavigator.VistaNavigator;

import static logic.UserLogic.createUserFile;

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

    /**
     * SIGN IN
     */
    @FXML
    void HandleSignIn() {
        //check credentials
        //get data from storage

//        redirect(user);
    }

    private void redirect(AbstractUser requester) {
        switch (AbstractUser.privilege) {
            case "ADMIN":
                VistaNavigator.loadVista(VistaNavigator.ADMIN_USERLIST);
                break;
            case "MANAGER":
                VistaNavigator.loadVista(VistaNavigator.MANAGER_PENDING);
                break;
            case "CONSULTANT":
                VistaNavigator.loadVista(VistaNavigator.CONSULTOR_SEARCH);
                break;
            case "TRANSLATOR":
                VistaNavigator.loadVista(VistaNavigator.TRANSLATOR_ONGOING);
                break;
        }
    }

    /**
     * SIGN IN
     */

    @FXML
    void HandleSignUp() {

        AbstractUser user;

        switch (RegPrivilege.getSelectionModel().getSelectedItem().toString()) {
            case "Consultant":
                Consultant banana = new Consultant();
                banana.setUsername(RegUsername.getText());
                banana.setPassword(RegPassword.getText());
                banana.setEmail(RegEmail.getText());
                banana.setMatricle(RegMatricle.getText());
                user = banana;
                // Do storage stuff
                break;

            case "Translator":
                Translator mango = new Translator();
                mango.setUsername(RegUsername.getText());
                mango.setPassword(RegPassword.getText());
                mango.setEmail(RegEmail.getText());
                mango.setMatricle(RegMatricle.getText());
                user = mango;
                // Do storage stuff
                break;

            case "InfoManager":
                InfoManager cherry = new InfoManager();
                cherry.setUsername(RegUsername.getText());
                cherry.setPassword(RegPassword.getText());
                cherry.setEmail(RegEmail.getText());
                cherry.setMatricle(RegMatricle.getText());
                user = cherry;
                // Do storage stuff
                break;

            case "Manager":
                Manager mangosteen = new Manager();
                mangosteen.setUsername(RegUsername.getText());
                mangosteen.setPassword(RegPassword.getText());
                mangosteen.setEmail(RegEmail.getText());
                mangosteen.setMatricle(RegMatricle.getText());
                user = mangosteen;
                // Do storage stuff
                break;

        }
//        createUserFile(user);
//        redirect(user);

        // TODO Implement user method using IO
    }
}
