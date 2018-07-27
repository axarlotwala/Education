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
public class AboutusFragment extends Fragment {

    RecyclerView expand_recycler;
    private List<Expand_model> expand_models;

    public AboutusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_aboutus, container, false);



        expand_models = new ArrayList<>();
        expand_recycler = view.findViewById(R.id.expand_recycler);
        fetchview();
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        expand_recycler.setLayoutManager(manager);

        expand_recycler.setAdapter(new Expand_adapter(getActivity(), expand_models));
        return view;

    }

    private void fetchview() {

        Expand_model model = new Expand_model("about", "Letters have several different types: Formal letters and Informal letters. Letters contribute to the protection and conservation of literacy. Letters have been sent since antiquity and are mentioned in the Iliad.You may have your topic assigned, or you may be given free reign to write on the subject of your choice. If you are given the topic, you should think about the type of paper that you want to produce. Should it be a general overview of the subject or a specific analysis? Narrow your focus if necessary.");
        expand_models.add(model);

        Expand_model model2 = new Expand_model("about", "You may have your topic assigned, or you may be given free reign to write on the subject of your choice. If you are given the topic, you should think about the type of paper that you want to produce. Should it be a general overview of the subject or a specific analysis? Narrow your focus if necessary.");
        expand_models.add(model2);

        Expand_model model3 = new Expand_model("about", "fetch Data From The Server Via Adapter");
        expand_models.add(model3);

        Expand_model model4 = new Expand_model("about", "fetch Data From The Server Via Adapter");
        expand_models.add(model4);


    }

}
