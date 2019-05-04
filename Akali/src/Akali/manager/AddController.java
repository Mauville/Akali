package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

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
    private ChoiceBox type;


    @FXML
    void handleCancel() {
    }

    @FXML
    void handleSave() {
    }

    @FXML
    void displaybrowse() {
    }

    void changeBrowseTextField() {
    }

}
