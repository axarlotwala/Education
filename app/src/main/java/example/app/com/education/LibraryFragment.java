package example.app.com.education;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class LibraryFragment extends Fragment {



    RecyclerView recyclerview;
   // private RecyclerView.Adapter adapter;
    private List<Library_model> library_models;


    public LibraryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_library, container, false);



        library_models = new ArrayList<>();
        StaticData();


        recyclerview = view.findViewById(R.id.recycler);

        //show data in graidview layout
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerview.setLayoutManager(layoutManager);

        Cource_adapter cource_adapter = new Cource_adapter(getActivity(),library_models);
        recyclerview.setAdapter(cource_adapter);
        return view;
    }

    private void StaticData() {

        Library_model models = new Library_model("Featured",R.drawable.ic_stars_black_24dp);
        library_models.add(models);

        Library_model model1 = new Library_model("Top Free",R.drawable.ic_card_giftcard_black_24dp);
        library_models.add(model1);

        Library_model model2 = new Library_model("Business",R.drawable.ic_work_black_24dp);
        library_models.add(model2);

        Library_model model3 = new Library_model("Design",R.drawable.ic_border_color_black_24dp);
        library_models.add(model3);

        Library_model model4 = new Library_model("Devloper",R.drawable.ic_settings_ethernet_black_24dp);
        library_models.add(model4);

        Library_model model5 = new Library_model("Education",R.drawable.ic_business_black_24dp);
        library_models.add(model5);

        Library_model model6 = new Library_model("Mail",R.drawable.ic_message_black_24dp);
        library_models.add(model6);

        Library_model model7 = new Library_model("Tutorial",R.drawable.ic_video_library_black_24dp);
        library_models.add(model7);



    }



}
