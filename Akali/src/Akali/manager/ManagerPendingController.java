package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import resource.AbstractResource;
import resource.Text;
import vistanavigator.VistaNavigator;

public class ManagerPendingController {
    @FXML
    private Button back;
    @FXML
    private Button add;
    @FXML
    private TableView table;
    @FXML
    private TableColumn title;
    @FXML
    private TableColumn status;
    @FXML
    private TableColumn buttonact;

    @FXML
    void handleTableButt() {

        // Pass data to next scene controller:
        // This is the instance of abstract user to pass to the next
        AbstractResource theOneYouChoose = new Text();
        theOneYouChoose.setTitle("demo@demo.com");
        ManageResourceController writeBuffer = new ManageResourceController();
        VistaNavigator.persistResource(theOneYouChoose, writeBuffer);

    }
    @FXML void handleAdd(){}

    @FXML void handleBack(){}

}
