package translator;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import vistanavigator.VistaNavigator;

public class OngoingController {
    @FXML
    private Button back;
    @FXML
    private TableView table;
    @FXML
    private TableColumn title;
    @FXML
    private TableColumn status;
    @FXML
    private TableColumn buttact;

    @FXML
    void handleBack() {
    }

}
