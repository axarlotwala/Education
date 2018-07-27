package example.app.com.education;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    private TextView tv_welcome;
    private TabLayout tab;
    private ViewPager view_pager;
    ViewPageAdapter adapter;



    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        tv_welcome = view.findViewById(R.id.tv_welcome);
        tab = view.findViewById(R.id.tab);
        view_pager = view.findViewById(R.id.view_pager);
        adapter = new ViewPageAdapter(getFragmentManager());

        adapter.AddFragment(new LoginFragment(),"Login");

        adapter.AddFragment(new SignupFragment(),"Signup");





        view_pager.setAdapter(adapter);
        tab.setupWithViewPager(view_pager);



        return  view;
    }


}
