package example.app.com.education;

import android.animation.TimeInterpolator;

/**
 * Created by android on 27/6/18.
 */

public class Expand_model {
    private String title;
    private String expand_detail;

    public Expand_model() {

    }

    public Expand_model(String title, String expand_detail) {
        this.title = title;
        this.expand_detail = expand_detail;
    }

    public String getTitle() {
        return title;
    }

    public String getExpand_detail() {
        return expand_detail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setExpand_detail(String expand_detail) {
        this.expand_detail = expand_detail;
    }
}
