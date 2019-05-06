package consultor;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SearchResultsController {
    @FXML
    private TextField query;
    @FXML
    private Button send;
    @FXML
    private TableColumn title;
    @FXML
    private TableColumn lang;
    @FXML
    private TableColumn state;
    @FXML
    private TableColumn region;
    @FXML
    private TableColumn discoverer;
    @FXML
    private TableColumn type;
    @FXML
    private TableView table;

    @FXML
    void HandleSend() {
    }

    @FXML
    void initialize() {
    }

}
