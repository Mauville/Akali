package resource;

import java.io.File;

public class Recording extends AbstractResource {
    private String duration, file;


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFil() {
        return file;
    }

    public void setFil(String file) {
        this.file = file;
    }
}
