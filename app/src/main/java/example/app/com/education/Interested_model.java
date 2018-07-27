package example.app.com.education;

/**
 * Created by android on 4/7/18.
 */

public class Interested_model {
    private String ch_image;
    private String chapter;
    private String pending;
    private String hours;

    public Interested_model() {
    }

    public Interested_model(String ch_image, String chapter, String pending, String hours) {
        this.ch_image = ch_image;
        this.chapter = chapter;
        this.pending = pending;
        this.hours = hours;
    }

    public String getCh_image() {
        return ch_image;
    }

    public void setCh_image(String ch_image) {
        this.ch_image = ch_image;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
}
