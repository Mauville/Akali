package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.*;
import resource.Recording;
import resource.Text;


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
    private ChoiceBox region;
    @FXML
    private ChoiceBox status;
    @FXML
    private ChoiceBox type;
    @FXML
    private Label wintitle;


    public void setTex(Text a) {
        pages.setText(a.getPages());
        words.setText(a.getWords());
        title.setText(a.getTitle());

    }
    public void setRec(Recording b){

    }

    @FXML
    void handleCancel(){}
    @FXML
    void handleSave(){
    }
    @FXML
    void displayBrowse(){}
    @FXML
    void handleDelete(){}
    void changeBrowseTextField(){}
    @FXML
    void initialize() {
        setTex();
    }

    }
}
