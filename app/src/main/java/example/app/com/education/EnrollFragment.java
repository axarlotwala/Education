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
public class EnrollFragment extends Fragment {

private List<Enrollmodel> enrollmodels;
RecyclerView enroll_card;

    public EnrollFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_enroll, container, false);


        enrollmodels = new ArrayList<>();
        enrollmethod();
        enroll_card = view.findViewById(R.id.enroll_card);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        enroll_card.setLayoutManager(manager);

        Enrolladapter enrolladapter = new Enrolladapter(getActivity(),enrollmodels);
        enroll_card.setAdapter(enrolladapter);


        return view;
    }

    private void enrollmethod() {

        Enrollmodel model1 = new Enrollmodel("full Specification","250","For anyone reading this nowThe accepted answer will lead to some layout problems on newer apis causing too much padding","10h 4m","8 video lession","Not Verify");
        enrollmodels.add(model1);

        Enrollmodel model2 = new Enrollmodel("full Specification","250","For anyone reading this nowThe accepted answer will lead to some layout problems on newer apis causing too much padding","10h 4m","8 video lession","Not Verify");
        enrollmodels.add(model2);

        Enrollmodel model3 = new Enrollmodel("full Specification","250","For anyone reading this nowThe accepted answer will lead to some layout problems on newer apis causing too much padding","10h 4m","8 video lession","Not Verify");
        enrollmodels.add(model3);

        Enrollmodel model4 = new Enrollmodel("full Specification","250","For anyone reading this nowThe accepted answer will lead to some layout problems on newer apis causing too much padding","10h 4m","8 video lession","Not Verify");
        enrollmodels.add(model4);

        Enrollmodel model5 = new Enrollmodel("full Specification","250","For anyone reading this nowThe accepted answer will lead to some layout problems on newer apis causing too much padding","10h 4m","8 video lession","Not Verify");
        enrollmodels.add(model5);

    }

}
