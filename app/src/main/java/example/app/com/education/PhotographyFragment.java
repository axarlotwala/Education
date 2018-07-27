package example.app.com.education;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 */
public class PhotographyFragment extends Fragment {

    private TabLayout choose_tab;
    private ViewPager choose_page;
    private ViewPageAdapter adapter;


    public PhotographyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photography, container, false);

        choose_tab = view.findViewById(R.id.choose_tab);
        choose_page = view.findViewById(R.id.choose_page);
        adapter = new ViewPageAdapter(getFragmentManager());

        adapter.AddFragment(new TopicFragment(),"TOPIC");

        adapter.AddFragment(new TopfreeFragment(),"TOP FREE");

        adapter.AddFragment(new SoftwareFragment(),"SOFTWARE");


        choose_page.setAdapter(adapter);
        choose_tab.setupWithViewPager(choose_page);

        return view;
    }

}
