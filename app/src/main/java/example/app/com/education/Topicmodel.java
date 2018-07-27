package example.app.com.education;

/**
 * Created by android on 4/7/18.
 */

public class Topicmodel {

    private String imageurl;
    private String title;
    private String name;

    public Topicmodel() {
    }

    public Topicmodel(String imageurl, String title, String name) {
        this.imageurl = imageurl;
        this.title = title;
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }
}
