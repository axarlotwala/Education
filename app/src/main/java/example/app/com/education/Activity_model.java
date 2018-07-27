package example.app.com.education;

/**
 * Created by android on 27/6/18.
 */

public class Activity_model {

    private String image;
    private String time;
    private String desc;


    public Activity_model() {
    }

    public Activity_model(String image, String time, String desc) {
        this.image = image;
        this.time = time;
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public String getTime() {
        return time;
    }

    public String getDesc() {return desc;}

    public void setImage(String image) {
        this.image = image;
    }

    public void setTime(String title) {
        this.time = title;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
}
