package translator;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import resource.AbstractResource;
import vistanavigator.MainController;
import vistanavigator.VistaNavigator;

import static logic.Browse.openFileChooser;

public class TranslateController {
    @FXML
    private Button browse;
    @FXML
    private Button download;
    @FXML
    private Button back;
    @FXML
    private Button submit;
    @FXML
    private TextField browsestate;
    @FXML
    private TextArea message;

    public AbstractResource buffered;

    public AbstractResource getBuffered() { return buffered; }

    public void setBuffered(AbstractResource buffered) { this.buffered = buffered; }

    @FXML
    void handleBrowse() {
        openFileChooser(browsestate);
    }

    @FXML
    void handleSubmit() {
    }

    @FXML
    void handleBack() {
    }

    @FXML
    void handleDownload() {
    }
    @FXML
    void initialize() {
        //Load data from main controller
        MainController main = VistaNavigator.getMainController();
        TranslateController buffered = main.getBufferedTranslateController();
        // Load instace of past Abstract Res
        AbstractResource buffUser = buffered.getBuffered();
    }
}
