package vistanavigator;

import common.ChangeUserController;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import manager.ManageController;
import manager.ManageResourceController;
import translator.AmmendController;
import translator.TranslateController;

/**
 * Main controller class for the entire layout.
 */
public class MainController {

    /**
     * Holder of a switchable vista.
     */
    @FXML
    private StackPane vistaHolder;


    // Buffered controllers to pass data between scenes

    // ADMIN
    private ChangeUserController bufferedUserListController;
    //Translator
    private AmmendController bufferedAmmendController;
    private TranslateController bufferedTranslateController;
    //Manager
    private ManageController bufferedManageController;
    private ManageResourceController bufferedManageResourceContrller;

    /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void setVista(Node node) {
        vistaHolder.getChildren().setAll(node);
    }

    public ChangeUserController getBufferedUserListController() {
        return bufferedUserListController;
    }

    public void setBufferedUserListController(ChangeUserController bufferedUserListController) {
        this.bufferedUserListController = bufferedUserListController;
    }

    public AmmendController getBufferedAmmendController() {
        return bufferedAmmendController;
    }

    public void setBufferedAmmendController(AmmendController bufferedAmmendController) {
        this.bufferedAmmendController = bufferedAmmendController;
    }

    public TranslateController getBufferedTranslateController() {
        return bufferedTranslateController;
    }

    public void setBufferedTranslateController(TranslateController bufferedTranslateController) {
        this.bufferedTranslateController = bufferedTranslateController;
    }

    public ManageController getBufferedManageController() {
        return bufferedManageController;
    }

    public void setBufferedManageController(ManageController bufferedManageController) {
        this.bufferedManageController = bufferedManageController;
    }

    public ManageResourceController getBufferedManageResourceContrller() {
        return bufferedManageResourceContrller;
    }

    public void setBufferedManageResourceContrller(ManageResourceController bufferedManageResourceContrller) {
        this.bufferedManageResourceContrller = bufferedManageResourceContrller;
    }
}
