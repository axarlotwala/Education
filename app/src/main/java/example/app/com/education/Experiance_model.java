package example.app.com.education;

/**
 * Created by android on 2/7/18.
 */

public class Experiance_model {

    private String lession;
    private String heading;
    private String description;
    private String timer;
    private String video;

    public Experiance_model() {
    }

    public Experiance_model(String lession, String heading, String description, String timer, String video) {
        this.lession = lession;
        this.heading = heading;
        this.description = description;
        this.timer = timer;
        this.video = video;
    }

    public String getLession() {
        return lession;
    }

    public String getHeading() {
        return heading;
    }

    public String getDescription() {
        return description;
    }

    public String getTimer() {
        return timer;
    }

    public String getVideo() {
        return video;
    }

    public void setLession(String lession) {
        this.lession = lession;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
