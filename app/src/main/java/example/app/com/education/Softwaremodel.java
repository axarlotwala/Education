package example.app.com.education;

/**
 * Created by android on 7/7/18.
 */

public class Softwaremodel {

    private Integer number;
    private String name;
    private String photo;

    public Softwaremodel() {
    }

    public Softwaremodel(Integer number, String name, String photo) {
        this.number = number;
        this.name = name;
        this.photo = photo;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
