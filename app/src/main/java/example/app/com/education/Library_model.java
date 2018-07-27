package example.app.com.education;

/**
 * Created by ${Ican} on 22/6/18.
 */
public class Library_model {

    private String name;
    private Integer txtimage;

    public Library_model() {

    }


    public Library_model(String name, Integer txtimage) {
        this.name = name;
        this.txtimage = txtimage;

    }

    public String getName() {
        return name;
    }

    public Integer gettxtImage() {return txtimage;}


    public void setName(String name) {
        this.name = name;
    }

    public void setTxtimage(int image){this.txtimage = txtimage;}
}
