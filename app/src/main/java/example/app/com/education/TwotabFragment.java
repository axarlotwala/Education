package example.app.com.education;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class TwotabFragment extends Fragment {

    private TabLayout tab_layouts;
    private ViewPager view_pagers;
    private ViewPageAdapter adapters;


    public TwotabFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_twotab, container, false);

        tab_layouts = view.findViewById(R.id.tab_layouts);
        view_pagers = view.findViewById(R.id.view_pagers);
        adapters = new ViewPageAdapter(getFragmentManager());


        adapters.AddFragment(new EnrollFragment(),"Enroll");

        adapters.AddFragment(new DesignFragment(),"Design");

        view_pagers.setAdapter(adapters);
        tab_layouts.setupWithViewPager(view_pagers);



        return view;
    }

}
