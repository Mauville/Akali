package manager;
//  https://stackoverflow.com/questions/29338352/create-filechooser-in-fxml

import com.sun.javafx.scene.control.skin.ChoiceBoxSkin;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import resource.*;
import resource.Recording;
import resource.Text;
import vistanavigator.VistaNavigator;
import java.util.ArrayList;

import static logic.Browse.*;

public class AddController {
    //public  static ArrayList<AbstractResource> data;
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
        if(String.valueOf(type.getSelectionModel().getSelectedItem()).equals("Recording")){

            AbstractResource rec =new Recording();



            rec.setStatus(String.valueOf(status.getSelectionModel().getSelectedItem()));
            rec.setOrigin(String.valueOf(region.getSelectionModel().getSelectedItem()));
            rec.setAuthor(discoverer.getText());
            rec.setLanguage(language.getText());
            ((Recording) rec).setDuration(duration.getText());
            ((Recording) rec).setFil(reso.getText());
            rec.setTitle(title.getText());
            addTo(rec);
            vistanavigator.VistaNavigator.loadVista(VistaNavigator.MANAGER_PENDING);


        }else if(String.valueOf(type.getSelectionModel().getSelectedItem()).equals("Text")){
            AbstractResource sts =new Text();

            sts.setStatus(String.valueOf(status.getSelectionModel().getSelectedItem()));
            sts.setOrigin(String.valueOf(region.getSelectionModel().getSelectedItem()));

            sts.setAuthor(discoverer.getText());
            sts.setLanguage(language.getText());
            sts.setTitle(title.getText());

            ((Text) sts).setWords(words.getText());
            ((Text) sts).setPages(pages.getText());
            ((Text) sts).setFil(reso.getText());

            addTo(sts);

            vistanavigator.VistaNavigator.loadVista(VistaNavigator.MANAGER_PENDING);

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





