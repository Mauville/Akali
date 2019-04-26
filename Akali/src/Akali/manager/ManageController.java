package Akali.manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ManageController {
    @FXML
    private TextField text;
    @FXML
    private TextField title;
    @FXML
    private TextField lang;
    @FXML
    private TextField pages;
    @FXML
    private TextField words;
    @FXML
    private TextField discoverer;
    @FXML
    private TextField audio;
    @FXML
    private Button audioBrowse;
    @FXML
    private Button textBrowse;
    @FXML
    private Button save;
    @FXML
    private Button delete;
    @FXML
    private Button cancel;
    @FXML
    private ComboBox region;
    @FXML
    private ComboBox status;
    @FXML
    private ComboBox type;
    @FXML
    private Label wintitle;


    @FXML
    void handleCancel(){}
    @FXML
    void handleSave(){}
    @FXML
    void displayBrowse(){}
    @FXML
    void handleDelete(){}
    void changeBrowseTextField(){}
}
