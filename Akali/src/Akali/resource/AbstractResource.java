package resource;

import javafx.collections.ObservableList;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class AbstractResource implements Serializable {
    private String title, language, status, origin, author;

    private Button button = new Button("Edit");





    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Button getBut() {
        return button;
    }

    public void setBut(Button but) {
        this.button = but;
    }
}
