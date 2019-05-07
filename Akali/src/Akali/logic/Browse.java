package logic;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import resource.AbstractResource;
import user.AbstractUser;


import java.io.File;
import java.util.ArrayList;


public class Browse {
    public static final ObservableList<AbstractResource> data =  FXCollections.observableArrayList();
    public static final ObservableList<AbstractUser> base =  FXCollections.observableArrayList();
    public static ObservableList<AbstractResource> getIRes(){

        ObservableList<AbstractResource> ter=data;
        return ter;

    }
    public static  void addTo(AbstractUser e){
        base.add(e);
    }
    public static  void removeTo(AbstractUser e){
        base.remove(e);
    }
    public static ObservableList<AbstractUser> getIUser(){

    ObservableList<AbstractUser> ter=base;
    return ter;



    }
    public static  void addTo(AbstractResource e){
        data.add(e);
    }
    public static  void removeTo(AbstractResource e){
        data.remove(e);
    }


    public static File openFileChooser(TextField a) {
        Stage filer = new Stage();
        FileChooser FC = new FileChooser();
        FC.setTitle("Choose resource File");
        FC.getExtensionFilters().addAll((
                        new FileChooser.ExtensionFilter("Text Files .txt", "*.txt")),
                new FileChooser.ExtensionFilter("Audio Files .mp3", "*.mp3")
        );
        File selectedFile = FC.showOpenDialog(filer);
        System.out.println(selectedFile.getName());
        a.setText(selectedFile.getName());
        return selectedFile;
    }

}
