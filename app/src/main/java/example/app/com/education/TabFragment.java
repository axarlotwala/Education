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
public class TabFragment extends Fragment {

    TabLayout mix_tab;
    ViewPager mix_pager;
    ViewPageAdapter adapter;


    public TabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab, container, false);

        mix_tab = view.findViewById(R.id.mix_tab);
        mix_pager = view.findViewById(R.id.mix_pager);
        adapter = new ViewPageAdapter(getFragmentManager());

        adapter.AddFragment(new MycourceFragment(),"Cource");

        adapter.AddFragment(new FeaturesFragment(),"Featured");

        adapter.AddFragment(new DiscoverFragment(),"Discover");


        mix_pager.setAdapter(adapter);
        mix_tab.setupWithViewPager(mix_pager);

        return view;
    }

}
