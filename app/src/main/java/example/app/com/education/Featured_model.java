package example.app.com.education;

import android.widget.ImageView;

/**
 * Created by android on 26/6/18.
 */

public class Featured_model {


    private String title;
    private String name;
    private String count;
    private String time;



    public Featured_model() {
    }

    public Featured_model(String title, String name, String count, String time) {
        this.title = title;
        this.name = name;
        this.count = count;
        this.time = time;

    }



    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getCount() {
        return count;
    }

    public String getTime() {
        return time;
    }




    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
