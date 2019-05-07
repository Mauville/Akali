package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;



import resource.AbstractResource;
import resource.Text;
import vistanavigator.VistaNavigator;
import javafx.scene.control.cell.PropertyValueFactory;
import resource.AbstractResource;
import vistanavigator.VistaNavigator;


import static logic.Browse.getIRes;
import static vistanavigator.VistaNavigator.*;

public class ManagerPendingController {

    @FXML
    private Button back;
    @FXML
    private Button add;
    @FXML
    private TableView<AbstractResource> table;
    @FXML
    private TableColumn<AbstractResource, String> title;
    @FXML
    private TableColumn<AbstractResource, String> status;
    @FXML
    private TableColumn<AbstractResource, Button> button;


    @FXML
    void handleTableButt() {

        // Pass data to next scene controller:
        // This is the instance of abstract user to pass to the next
        AbstractResource theOneYouChoose = new Text();
        theOneYouChoose.setTitle("demo@demo.com");
        ManageResourceController writeBuffer = new ManageResourceController();
        VistaNavigator.persistResource(theOneYouChoose, writeBuffer);

    }

    @FXML
    void handleAdd() {
        VistaNavigator.loadVista(MANAGER_ADD);
    }

    @FXML
    void handleBack() {
        VistaNavigator.loadVista(COMMON_ADDUSER);
    }

    @FXML void initialize(){
        title.setCellValueFactory(new PropertyValueFactory<AbstractResource, String>("title"));
        status.setCellValueFactory(new PropertyValueFactory<AbstractResource, String>("status"));
        button.setCellValueFactory(new PropertyValueFactory<AbstractResource, Button>("button"));
        table.setItems(getData());

        }

}
