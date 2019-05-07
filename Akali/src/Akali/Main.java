import common.ChangeUserController;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import resource.AbstractResource;
import user.AbstractUser;
import vistanavigator.MainController;
import vistanavigator.VistaNavigator;

import java.io.IOException;

// With the help of https://gist.github.com/jewelsea/6460130 framework

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Akali");
        stage.setScene(createScene(loadMainPane()));
        stage.show();
    }

    /**
     * Loads the main fxml layout.ZZ
     * Sets up the vista switching VistaNavigator.
     * Loads the first vista into the fxml layout.
     *
     * @return the loaded pane.
     * @throws IOException if the pane could not be loaded.
     */
    private Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Pane mainPane = loader.load(getClass().getResourceAsStream(VistaNavigator.MAIN));
        MainController mainController = loader.getController();
        VistaNavigator.setMainController(mainController);
        // NOTE: If you wanna try a scene, change the constant here.
        // You can find the full list at VistaNavigator
        VistaNavigator.loadVista(VistaNavigator.COMMON_ADDUSER);
        return mainPane;
    }

    /**
     * Creates the main application scene.
     *
     * @param mainPane the main application layout.
     * @return the created scene.
     */
    private Scene createScene(Pane mainPane) {
        return new Scene(mainPane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
