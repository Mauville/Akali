package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import com.sun.javafx.scene.control.skin.ChoiceBoxSkin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import vistanavigator.VistaNavigator;

import static Akali.Browse.*;

public class AddController {


    @FXML
    private Button cancel;
    @FXML
    private Button browseText;
    @FXML
    private Button browseAudio;
    @FXML
    private Button save;
    @FXML
    private TextField text;
    @FXML
    private TextField title;
    @FXML
    private TextField language;
    @FXML
    private TextField discoverer;
    @FXML
    private TextField pages;
    @FXML
    private TextField words;
    @FXML
    private TextField audio;
    @FXML
    private ChoiceBox region;
    @FXML
    private ChoiceBox status;
    @FXML
    private ChoiceBox<String> type;
    @FXML
    void handleCancel() {
        vistanavigator.VistaNavigator.loadVista(VistaNavigator.MANAGER_PENDING);
    }

    @FXML
    void handleSave(){
       //TODO choicebox troubleshoot
        vistanavigator.VistaNavigator.loadVista(VistaNavigator.MANAGER_PENDING);
    }

    @FXML
    void handleRes() {
        openFileChooser(text);
    }

    @FXML
    private void selectType(ActionEvent e){

        }

    }


