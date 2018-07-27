package example.app.com.education;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.load.engine.bitmap_recycle.IntegerArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverFragment extends Fragment {

    private static ViewPager view_page;
    private static CircleIndicator indicator;
    private static int page = 0;
    private static final Integer[] slider = {R.drawable.inovation,R.drawable.laptop,R.drawable.slide,R.drawable.bulbedu};
    private ArrayList<Integer> sliderArray = new ArrayList<>();

    RecyclerView recycler_activity;
    private Context mContext;
    private List<Activity_model> activity_models;

    RecyclerView recycler_business;
    private Context context;
    private List<Business_model> business_models;

    public DiscoverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover, container, false);



        BottomNavigationView bottomNavigationView = view.findViewById(R.id.bottom_nevigation);




        /* recyclerview Recent Activity */

        activity_models = new ArrayList<>();
        Recent_activity();
        recycler_activity = view.findViewById(R.id.recycler_activity);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recycler_activity.setLayoutManager(manager);

        Activity_adapter adapter = new Activity_adapter(getActivity(),activity_models);
        recycler_activity.setAdapter(adapter);

        /* Business Image View*/

        business_models = new ArrayList<>();
        business_image();
        recycler_business = view.findViewById(R.id.recycler_business);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recycler_business.setLayoutManager(linearLayoutManager);

        Business_adapter business_adapter = new Business_adapter(getActivity(),business_models);
        recycler_business.setAdapter(business_adapter);




        /*  slider data */

        indicator = view.findViewById(R.id.indicator);
        slider_method();
        view_page = view.findViewById(R.id.view_page);
        view_page.setAdapter(new Slide_adapter(getActivity(),sliderArray));

        indicator.setViewPager(view_page);

        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (page == slider.length){
                    page = 0;
                }
                view_page.setCurrentItem(page++,true);
            }
        };

        Timer swipeTime = new Timer();
        swipeTime.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        },2500,2500);
        return view;
    }

    private void business_image() {

        Business_model business_model = new Business_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYryGg0rDPzpBmAi-JudxxCZauW98fSIJ-Q6WH2OKCeKGT3LNBGA");
        business_models.add(business_model);

        Business_model business_model1 = new Business_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLE3C_yoXN7_vlQaIQQjtXLnrlef4yvAUrER8SkLvoFmlRKjRRng");
        business_models.add(business_model1);

        Business_model business_model2 = new Business_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKfesF8vKN9To8Qj0Xs9lwumO196zjl__8tVZZiGJAaXtM9SWZqg");
        business_models.add(business_model2);


    }

    private void Recent_activity() {
        Activity_model model = new Activity_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR61VdFsNTdYuS8UX1h-mmJeJ45VMc3vCFcw_ZhfBxhmvQnQbIl","15 minit","Money banking and Central banking");
        activity_models.add(model);

        Activity_model model1 = new Activity_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuehExVuvCxaSGoa2eY8V6-MSshhip5iYn4plRTLlTQS1tln7m5w","8 minit","Accounting and Finincial System in Advance");
        activity_models.add(model1);

        Activity_model model2 = new Activity_model("https://djawest.files.wordpress.com/2013/01/hardhat.jpg","10 minit","business new prototype with data");
        activity_models.add(model2);


    }

    private void slider_method() {
        for (int i=0 ; i < slider.length ; i++)
            sliderArray.add(slider[i]);







    }


}
