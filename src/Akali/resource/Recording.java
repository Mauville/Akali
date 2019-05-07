package resource;


public class Recording extends AbstractResource {
    private String fil, duration;


    public String getFil() {
        return fil;
    }

    public void setFil(String fl) {
        this.fil = fil;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
