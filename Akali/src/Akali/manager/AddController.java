package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import com.sun.javafx.scene.control.skin.ChoiceBoxSkin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import resource.Recording;
import resource.Text;
import vistanavigator.VistaNavigator;

import static logic.Browse.openFileChooser;

public class AddController {
    @FXML
    private Button cancel;
    @FXML
    private Button save;
    @FXML
    private TextField text;
    @FXML
    private TextField title;
    @FXML
    private TextField language;
    @FXML
    private TextField discoverer;
    @FXML
    private TextField pages;
    @FXML
    private TextField words;
    @FXML
    private TextField reso;
    @FXML
    private ChoiceBox region;
    @FXML
    private ChoiceBox status;
    @FXML
    private ChoiceBox type;
    @FXML
    private TextField duration;
    @FXML
    void handleCancel() {
        vistanavigator.VistaNavigator.loadVista(VistaNavigator.MANAGER_PENDING);
        System.out.println("xxxxx");
    }

    @FXML
    void handleSave(){
        String x = String.valueOf(type.getSelectionModel().getSelectedItem());
        if(String.valueOf(type.getSelectionModel().getSelectedItem()).equals("Recording")){

            Recording rec =new Recording();



            rec.setStatus(String.valueOf(status.getSelectionModel().getSelectedItem()));
            rec.setOrigin(String.valueOf(region.getSelectionModel().getSelectedItem()));
            rec.setAuthor(discoverer.getText());
            rec.setLanguage(language.getText());
            rec.setDuration(duration.getText());
            rec.setFil(reso.getText());
            rec.setTitle(title.getText());
            vistanavigator.VistaNavigator.loadVista(VistaNavigator.MANAGER_PENDING);

            //TODO save recording on listview

        }else if(String.valueOf(type.getSelectionModel().getSelectedItem()).equals("Text")){

            Text sts =new Text();

            sts.setStatus(String.valueOf(status.getSelectionModel().getSelectedItem()));
            sts.setOrigin(String.valueOf(region.getSelectionModel().getSelectedItem()));

            sts.setAuthor(discoverer.getText());
            sts.setLanguage(language.getText());

            sts.setWords(words.getText());
            sts.setPages(pages.getText());
            sts.setFil(reso.getText());
            sts.setTitle(title.getText());
            vistanavigator.VistaNavigator.loadVista(VistaNavigator.MANAGER_PENDING);
            //TODO save text on listview

        }else{
            Alert tgp= new Alert(Alert.AlertType.ERROR);
            tgp.setTitle("ERROR");
            tgp.setHeaderText("You didnt select a type");
            tgp.setContentText("Please choose a type");
            tgp.showAndWait();
        }

    }

    @FXML
    void handleRes() {
        openFileChooser(reso);
    }

    @FXML
    private void selectType(ActionEvent e){

    }

}





