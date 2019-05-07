package common;

import javafx.scene.control.ChoiceBox;
import user.*;

import logic.UserLogic;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import vistanavigator.VistaNavigator;

import java.io.IOException;

import static logic.UserLogic.*;

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
    private ChoiceBox RegPrivilege;
    @FXML
    private Button SignIn;
    private Button SignUp;

    @FXML
    void HandleSignIn() throws IOException {
        //check credentials
        assert username.getText() != null;
        assert password.getText() != null;

        //get data from storage
        String usrname = username.getText();
        String pass = password.getText();

        String direct = "CONSULTANT";

        if (getMijo(usrname).equals(pass)) {
            direct = mijosPrivilege(usrname);
        }
        redirect(direct.toUpperCase());
    }


    private void redirect(String requester) {
        switch (requester) {
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
            default:
                System.out.println("MIKE");
        }
    }


    @FXML
    void HandleSignUp() {

        AbstractUser user = null;

        switch (String.valueOf(RegPrivilege.getSelectionModel().getSelectedItem())){
            case "Consultant":
                AbstractUser banana = new Consultant();
                banana.setUsername(RegUsername.getText());
                banana.setPassword(RegPassword.getText());
                banana.setEmail(RegEmail.getText());
                banana.setMatricle(RegMatricle.getText());
                user = banana;
                break;

            case "Translator":
                AbstractUser mango = new Translator();
                mango.setUsername(RegUsername.getText());
                mango.setPassword(RegPassword.getText());
                mango.setEmail(RegEmail.getText());
                mango.setMatricle(RegMatricle.getText());
                user = mango;
                break;

            case "InfoManager":
                AbstractUser cherry = new InfoManager();
                cherry.setUsername(RegUsername.getText());
                cherry.setPassword(RegPassword.getText());
                cherry.setEmail(RegEmail.getText());
                cherry.setMatricle(RegMatricle.getText());
                user = cherry;
                break;

            case "Manager":
                AbstractUser mangosteen = new Manager();
                mangosteen.setUsername(RegUsername.getText());
                mangosteen.setPassword(RegPassword.getText());
                mangosteen.setEmail(RegEmail.getText());
                mangosteen.setMatricle(RegMatricle.getText());
                user = mangosteen;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + RegPrivilege.getSelectionModel().getSelectedItem().toString());
        }
        try {
            createUser(user);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        createUserFile(user);
//        redirect(user);

        // TODO Implement user method using IO
    }
}
