package translator;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import resource.AbstractResource;
import resource.Text;
import vistanavigator.VistaNavigator;

public class TranslatorPendingController {

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
    private Button button;

    @FXML
    private void handleButton(){
        AbstractResource buff = new Text();
        AmmendController buffcontroller = new AmmendController();
        buffcontroller.setBuffercontroller(buff);
        VistaNavigator.persistResource(buff, buffcontroller);
    }

    @FXML
    void handleBack() {
    }





}
