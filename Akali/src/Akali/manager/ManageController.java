package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.*;
import resource.AbstractResource;
import resource.Recording;
import resource.Text;
import vistanavigator.MainController;
import vistanavigator.VistaNavigator;


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


    public AbstractResource buffered;

    public AbstractResource getBuffered() { return buffered; }

    public void setBuffered(AbstractResource buffered) { this.buffered = buffered; }

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
    @FXML
    void initialize() {
//        setTex();
        //Load data from main controller
        MainController main = VistaNavigator.getMainController();
        ManageController buffered = main.getBufferedManageController();
        // Load instace of past Abstract Res
        AbstractResource buffUser = buffered.getBuffered();
    }
}
