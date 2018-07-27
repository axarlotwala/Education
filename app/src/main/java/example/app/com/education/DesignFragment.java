package example.app.com.education;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DesignFragment extends Fragment {


    RecyclerView repeat_card;
    private List<Card_model> card_models;

    public DesignFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_design, container, false);

        card_models = new ArrayList<>();
        repeatcard();
        repeat_card = view.findViewById(R.id.repeat_card);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        repeat_card.setLayoutManager(manager);

        Card_apapter adapter = new Card_apapter(getActivity(),card_models);
        repeat_card.setAdapter(adapter);

        return view;
    }

    private void repeatcard() {

        Card_model card_model = new Card_model("https://images.pexels.com/photos/46710/pexels-photo-46710.jpeg?auto=compress&cs=tinysrgb&h=350","Wordpress Cource With Php","joy levis",4,500);
        card_models.add(card_model);

        Card_model card_model1 = new Card_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtq2vYJia4aDsVV5CsVKU0AWoUj4XqlTnS4nxxPOGXyicSzTOI","ASP.Net Devlopment Coururce","Microsoft",5,600);
        card_models.add(card_model1);

        Card_model card_model2 = new Card_model("https://as.ftcdn.net/r/v1/pics/ea2e0032c156b2d3b52fa9a05fe30dedcb0c47e3/landing/images_photos.jpg","vb.net","chand saha",2,150);
        card_models.add(card_model2);

        Card_model card_model3 = new Card_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiuSZNSTgykfjYwWHRasiZ-i77rzgqOUNm8rxu-_O4Q4MaLTbC","java","Divyesh saha",4,1000);
        card_models.add(card_model3);

        Card_model card_model4 = new Card_model("https://www.ienglishstatus.com/wp-content/uploads/2018/04/profile-images-for-lover.jpg","google certified","google",5,1500);
        card_models.add(card_model4);
    }

}
