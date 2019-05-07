package translator;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import resource.AbstractResource;
import resource.Text;
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
        VistaNavigator.loadVista(VistaNavigator.COMMON_ADDUSER);
    }

    @FXML
    void initialize() {
        // Pass data to next scene controller:
        // This is the instance of abstract user to pass to the next
        AbstractResource theOneYouChoose = new Text();
        theOneYouChoose.setTitle("demo");
        AmmendController writeBuffer = new AmmendController();
        VistaNavigator.persistResource(theOneYouChoose, writeBuffer);
    }

}
