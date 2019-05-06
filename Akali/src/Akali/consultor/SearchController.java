package consultor;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import vistanavigator.VistaNavigator;

public class SearchController {
    @FXML
    private TextField query;
    @FXML
    private Button send;

    @FXML
    void HandleSend() {
        VistaNavigator.loadVista(VistaNavigator.CONSULTOR_SEARCHRESULTS);
    }

}
