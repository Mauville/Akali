package translator;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import resource.AbstractResource;
import vistanavigator.VistaNavigator;

import static logic.Browse.getIRes;

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
        vistanavigator.VistaNavigator.loadVista(VistaNavigator.COMMON_ADDUSER);
    }
    @FXML
    void initialize() {
        title.setCellValueFactory(new PropertyValueFactory<AbstractResource, String>("title"));
        status.setCellValueFactory(new PropertyValueFactory<AbstractResource, String>("status"));
        buttact.setCellValueFactory(new PropertyValueFactory<AbstractResource, Button>("button"));
        table.setItems(getIRes());
    }

}
