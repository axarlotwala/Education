package example.app.com.education;

import android.widget.TextView;

/**
 * Created by android on 6/7/18.
 */

public class Enrollmodel {

    private String detail;
    private String price;
    private String content;
    private String h_count;
    private String video_lesson;
    private String verify;


    public Enrollmodel() {
    }

    public Enrollmodel(String detail, String price, String content, String h_count, String video_lesson, String verify) {
        this.detail = detail;
        this.price = price;
        this.content = content;
        this.h_count = h_count;
        this.video_lesson = video_lesson;
        this.verify = verify;
    }

    public String getDetail() {
        return detail;
    }

    public String getPrice() {
        return price;
    }

    public String getContent() {
        return content;
    }

    public String getH_count() {
        return h_count;
    }

    public String getVideo_lesson() {
        return video_lesson;
    }

    public String getVerify() {
        return verify;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setH_count(String h_count) {
        this.h_count = h_count;
    }

    public void setVideo_lesson(String video_lesson) {
        this.video_lesson = video_lesson;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }
}
