package example.app.com.education;

/**
 * Created by android on 6/7/18.
 */

public class Freemodel {

    private String image_url;
    private Integer num;
    private String free_title;
    private String free_name;
    private String video_count;
    private String hours_count;

    public Freemodel() {
    }

    public Freemodel(String image_url,Integer num, String free_title, String free_name, String video_count, String hours_count) {
        this.image_url = image_url;
        this.num = num;
        this.free_title = free_title;
        this.free_name = free_name;
        this.video_count = video_count;
        this.hours_count = hours_count;
    }

    public String getImage_url() {
        return image_url;
    }

    public Integer getNum() {
        return num;
    }

    public String getFree_title() {
        return free_title;
    }

    public String getFree_name() {
        return free_name;
    }

    public String getVideo_count() {
        return video_count;
    }

    public String getHours_count() {
        return hours_count;
    }

    public void SetImageurl (String Imageurl){
        this.image_url = image_url;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setFree_title(String free_title) {
        this.free_title = free_title;
    }

    public void setFree_name(String free_name) {
        this.free_name = free_name;
    }

    public void setVideo_count(String video_count) {
        this.video_count = video_count;
    }

    public void setHours_count(String hours_count) {
        this.hours_count = hours_count;
    }
}
