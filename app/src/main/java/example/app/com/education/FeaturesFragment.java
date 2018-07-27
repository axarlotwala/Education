package example.app.com.education;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FeaturesFragment extends Fragment {

    RecyclerView recycler_featured;
    private List<Featured_model> featured_models;

    // TODO: Rename and change types of parameters

    public FeaturesFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_features, container, false);

        featured_models = new ArrayList<>();
        recycler_featured = view.findViewById(R.id.recycler_featured);
        featuredData();

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);

        recycler_featured.setLayoutManager(manager);

        FeaturedAdapter featuredAdapter = new FeaturedAdapter(getActivity(),featured_models);
        recycler_featured.setAdapter(featuredAdapter);
        return view;
    }

    private void featuredData() {

        Featured_model model = new Featured_model("Computer Science","Fundamental of System","7.0 Videos","1:00 content");
        featured_models.add(model);

        Featured_model model1 = new Featured_model("digital markting","Fundamental of market ","7.0 Videos","1:00 content");
        featured_models.add(model1);

        Featured_model model2 = new Featured_model("Finince Sytem in capital","Fundamental of System","7.0 Videos","1:00 content");
        featured_models.add(model2);

        Featured_model model3 = new Featured_model("captial invoice and source","Fundamental of System","7.0 Videos","1:00 content");
        featured_models.add(model3);

        Featured_model model4 = new Featured_model("technology server data ","Fundamental of System","7.0 Videos","1:00 content");
        featured_models.add(model4);

        Featured_model model5 = new Featured_model("Accounting Data and entry","Fundamental of System","7.0 Videos","1:00 content");
        featured_models.add(model5);

    }


}
