package example.app.com.education;

/**
 * Created by android on 25/6/18.
 */

public class Card_model {

    private String card_image;
    private String title;
    private String name;
    private Integer rating_star;
    private Integer fees;

    public Card_model() {

    }

    public Card_model(String card_image, String title, String name,Integer rating_star, Integer fees) {
        this.card_image = card_image;
        this.title = title;
        this.name = name;
        this.rating_star = rating_star;
        this.fees = fees;
    }

    public String getCard_image() {
        return card_image;
    }

    public String getCard_title() {
        return title;
    }

    public String getName() {
        return name;
    }

    public Integer getRating_star() {
        return rating_star;
    }

    public Integer getFees() {
        return fees;
    }

    public void setCard_image(String card_image) {
        this.card_image = card_image;
    }

    public void setCard_title(String card_title) {
        this.title = card_title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating_star(Integer rating_star) {
        this.rating_star = rating_star;
    }

    public void setFees(Integer fees) {
        this.fees = fees;
    }
}
