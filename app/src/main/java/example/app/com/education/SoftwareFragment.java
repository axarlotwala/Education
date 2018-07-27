package example.app.com.education;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SoftwareFragment extends Fragment{


BottomNavigationView bottomNavigationView;

private List<Softwaremodel> softwaremodels;
    RecyclerView number_card;


    public SoftwareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_software, container, false);
        bottomNavigationView = view.findViewById(R.id.free_bottom);

        softwaremodels = new ArrayList<>();
        number_card = view.findViewById(R.id.number_card);
        fetch_method();

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        number_card.setLayoutManager(manager);

        Softwareadapter softwareadapter = new Softwareadapter(getActivity(),softwaremodels);
        number_card.setAdapter(softwareadapter);


        return view;
    }

    private void fetch_method() {

        Softwaremodel model1 = new Softwaremodel(1,"provident Fund","https://www.dhresource.com/0x0s/f2-albu-g4-M00-7D-33-rBVaEFm7jEGAJrJNAAG9B6rRD3k873.jpg/2017-new-small-sport-students-children-watch.jpg");
        softwaremodels.add(model1);

        Softwaremodel model2 = new Softwaremodel(2,"provident Fund",null);
        softwaremodels.add(model2);

        Softwaremodel model3 = new Softwaremodel(3,"provident Fund","https://www.dhresource.com/0x0s/f2-albu-g4-M00-7D-33-rBVaEFm7jEGAJrJNAAG9B6rRD3k873.jpg/2017-new-small-sport-students-children-watch.jpg");
        softwaremodels.add(model3);

        Softwaremodel model4 = new Softwaremodel(4,"provident Fund","https://www.dhresource.com/0x0s/f2-albu-g4-M00-7D-33-rBVaEFm7jEGAJrJNAAG9B6rRD3k873.jpg/2017-new-small-sport-students-children-watch.jpg");
        softwaremodels.add(model4);

        Softwaremodel model5 = new Softwaremodel(5,"provident Fund",null);
        softwaremodels.add(model5);
    }
};


