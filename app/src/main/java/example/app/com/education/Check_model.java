package example.app.com.education;

import android.view.View;
import android.widget.CheckBox;

/**
 * Created by android on 29/6/18.
 */

public class Check_model {
    private String image;
    private String title;



    public Check_model() {
    }

    public Check_model(String image, String title) {
        this.image = image;
        this.title = title;



    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }





    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
