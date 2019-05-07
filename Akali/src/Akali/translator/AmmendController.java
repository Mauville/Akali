package translator;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import common.ChangeUserController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import resource.AbstractResource;
import user.AbstractUser;
import vistanavigator.MainController;
import vistanavigator.VistaNavigator;

import java.io.File;

import static logic.Browse.openFileChooser;

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

    public AbstractResource getBuffercontroller() {
        return buffercontroller;
    }

    public void setBuffercontroller(AbstractResource buffercontroller) {
        this.buffercontroller = buffercontroller;
    }

    private AbstractResource buffercontroller;

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

    @FXML
    private void initialize() {
        //Load data from main controller
        MainController main = VistaNavigator.getMainController();
        AmmendController buffered = main.getBufferedAmmendController();
        // Load instace of past Abstract Resource
        AbstractResource buffRes = buffered.getBuffercontroller();
    }

}

