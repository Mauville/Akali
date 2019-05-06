package logic;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.File;


public class Browse {

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

    public static File openAudioChooser(TextField a) {
        Stage filer = new Stage();
        FileChooser FC = new FileChooser();
        FC.setTitle("Choose resource File");
        FC.getExtensionFilters().addAll((
                new FileChooser.ExtensionFilter("Audio Files .mp3", "*.mp3")
        ));
        File selectedFile = FC.showOpenDialog(filer);
        System.out.println(selectedFile.getName());
        a.setText(selectedFile.getName());
        return selectedFile;
    }

    public static File openTextChooser(TextField a) {
        Stage filer = new Stage();
        FileChooser FC = new FileChooser();
        FC.setTitle("Choose resource File");
        FC.getExtensionFilters().addAll((
                new FileChooser.ExtensionFilter("Audio Files .mp3", "*.mp3")
        ));
        File selectedFile = FC.showOpenDialog(filer);
        System.out.println(selectedFile.getName());
        a.setText(selectedFile.getName());
        return selectedFile;
    }
}
