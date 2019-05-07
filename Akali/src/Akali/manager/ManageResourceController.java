package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import vistanavigator.VistaNavigator;

import static vistanavigator.VistaNavigator.MANAGER_PENDING;

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

    @FXML
    void handleBack() {
        VistaNavigator.loadVista(MANAGER_PENDING);
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
    }


}
