package example.app.com.education;


import android.content.Context;
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
public class WishlistFragment extends Fragment {

    RecyclerView recycler_design;
    Context mContext;
    private List<Experiance_model> experiance_models;


    public WishlistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wishlist, container, false);


        experiance_models = new ArrayList<>();
        user_experiance();
        recycler_design = view.findViewById(R.id.recycler_design);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recycler_design.setLayoutManager(manager);

        Experiance_adapter adapter = new Experiance_adapter(getActivity(), experiance_models);
        recycler_design.setAdapter(adapter);


        return view;
    }

    private void user_experiance() {

        Experiance_model model = new Experiance_model("Lession 1", "Welcome To Design", "Designing often necessitates considering the aesthetic.", "20 minits", "10 Vides");
        experiance_models.add(model);

        Experiance_model model1 = new Experiance_model("Lession 2", "Who is Founder", "Another definition for design is a roadmap or a strategic approach ", "15 minits", "8 Vides");
        experiance_models.add(model1);

        Experiance_model model2 = new Experiance_model("Lession 3", "Detail Of Cource", "Here, a specification can be manifested as either a plan or a finished product", "40 minits", "15 Vides");
        experiance_models.add(model2);

    }

}
