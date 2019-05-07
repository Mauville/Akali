package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import resource.AbstractResource;
import vistanavigator.MainController;
import vistanavigator.VistaNavigator;

public class ManageResourceController {
    @FXML
    private Button back;
    @FXML
    private Button download;
    @FXML
    private Button reject;
    @FXML
    private Button approve;
    @FXML
    private TextArea comment;
    @FXML
    private Label lang;
    @FXML
    private Label stat;
    @FXML
    private Label type;
    @FXML
    private Label title;


    public AbstractResource buffered;

    public AbstractResource getBuffered() { return buffered; }

    public void setBuffered(AbstractResource buffered) { this.buffered = buffered; }

    @FXML
    void handleBack() {
    }

    @FXML
    void handleDownload() {
    }

    @FXML
    void handleReject() {
    }

    @FXML
    void handleApprove() {
    }

    @FXML
    private void initialize() {
        //Load data from main controller
        MainController main = VistaNavigator.getMainController();
        ManageResourceController buffered = main.getBufferedManageResourceContrller();
        // Load instace of past Abstract Res
        AbstractResource buffUser = buffered.getBuffered();
    }


}
