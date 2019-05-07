package vistanavigator;

import common.ChangeUserController;
import javafx.fxml.FXMLLoader;
import manager.ManageController;
import manager.ManageResourceController;
import resource.AbstractResource;
import translator.AmmendController;
import translator.TranslateController;
import user.AbstractUser;

import java.io.IOException;

/**
 * Utility class for controlling navigation between vistas.
 * <p>
 * All methods on the navigator are static to facilitate
 * simple access from anywhere in the application.
 */
public class VistaNavigator {

    /**
     * Convenience constants for fxml layouts managed by the navigator.
     */

    public static final String MAIN = "vistanavigator/main.fxml";
    public static final String ADMIN_USERLIST = "../admin/UserList.fxml";
    public static final String COMMON_ADDUSER = "../common/AddUser.fxml";
    public static final String COMMON_CHANGEUSER = "../common/ChangeUser.fxml";
    public static final String CONSULTOR_SEARCH = "../consultor/Search.fxml";
    public static final String CONSULTOR_SEARCHRESULTS = "../consultor/SearchResults.fxml";
    public static final String MANAGER_ADD = "../manager/Add.fxml";
    public static final String MANAGER_MANAGE = "../manager/Manage.fxml";
    public static final String MANAGER_MANAGE_RESOURCE = "../manager/ManageResource.fxml";
    public static final String MANAGER_PENDING = "../manager/Pending.fxml";
    public static final String TRANSLATOR_AMMEND = "../translator/Ammend.fxml";
    public static final String TRANSLATOR_ONGOING = "../translator/Ongoing.fxml";
    public static final String TRANSLATOR_TRANSLATE = "../translator/Translate.fxml";
    public static final String TRANSLATOR_PENDING_TRANSLATOR = "../translator/PendingTranslator.fxml";


    /**
     * The main application layout controller.
     */
    private static MainController mainController;

    /**
     * Stores the main controller for later use in navigation tasks.
     *
     * @param mainController the main application layout controller.
     */
    public static void setMainController(MainController mainController) {
        VistaNavigator.mainController = mainController;
    }

    public static MainController getMainController() {
        return mainController;
    }

    /**
     * Loads the vista specified by the fxml file into the
     * vistaHolder pane of the main application layout.
     * <p>
     * Previously loaded vista for the same fxml file are not cached.
     * The fxml is loaded anew and a new vista node hierarchy generated
     * every time this method is invoked.
     * <p>
     * A more sophisticated load function could potentially add some
     * enhancements or optimizations, for example:
     * cache FXMLLoaders
     * cache loaded vista nodes, so they can be recalled or reused
     * allow a user to specify vista node reuse or new creation
     * allow back and forward history like a browser
     *
     * @param fxml the fxml file to be loaded.
     */
    public static void loadVista(String fxml) {
        try {
            mainController.setVista(FXMLLoader.load(VistaNavigator.class.getResource(fxml)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Persist data between scenes
    public static void persistUser(AbstractUser user, ChangeUserController persistence) {
        persistence.setBuffered(user);
        MainController main = VistaNavigator.getMainController();
        main.setBufferedUserListController(persistence);
        System.out.println("Succesfully persisted object" + user.getPrivilege());
    }

    public static void persistResource(AbstractResource data, AmmendController persistence) {
        persistence.setBuffercontroller(data);
        MainController main = VistaNavigator.getMainController();
        main.setBufferedAmmendController(persistence);
        System.out.println("Succesfully persisted object" + data.getTitle());
    }
    public static void persistResource(AbstractResource data, TranslateController persistence) {
        persistence.setBuffered(data);
        MainController main = VistaNavigator.getMainController();
        main.setBufferedTranslateController(persistence);
        System.out.println("Succesfully persisted object" + data.getTitle());
    }
    public static void persistResource(AbstractResource data, ManageController persistence) {
        persistence.setBuffered(data);
        MainController main = VistaNavigator.getMainController();
        main.setBufferedManageController(persistence);
        System.out.println("Succesfully persisted object" + data.getTitle());
    }
    public static void persistResource(AbstractResource data, ManageResourceController persistence) {
        persistence.setBuffered(data);
        MainController main = VistaNavigator.getMainController();
        main.setBufferedManageResourceContrller(persistence);
        System.out.println("Succesfully persisted object" + data.getTitle());
    }
}
