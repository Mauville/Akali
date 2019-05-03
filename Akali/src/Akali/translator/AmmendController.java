package Akali.translator;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

import static Akali.Browse.openFileChooser;

public class AmmendController {
    @FXML
    private Button dowloadOriginal;
    @FXML
    private Button dowloadTranslated;
    @FXML
    private Button browse;
    @FXML
    private Button back;
    @FXML
    private Button submit;
    @FXML
    private TextArea message;
    @FXML
    private TextField browsestate;

    @FXML
    void handleBrowse() {
        openFileChooser(browsestate);
    }

    @FXML
    void handleDownloadOriginal() {
    }

    @FXML
    void handleDownloadTranslated() {
    }

    @FXML
    void handleSubmit() {
    }

    @FXML
    void handleBack() {
    }

    void updateBrowseField() {
    }

    void initialize() {
    }
}

