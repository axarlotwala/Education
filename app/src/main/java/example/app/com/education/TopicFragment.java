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
public class TopicFragment extends Fragment {

    RecyclerView new_cource;
    RecyclerView begginers_recycler;
    private List<Topicmodel> topicmodels;

    public TopicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_topic, container, false);


        topicmodels = new ArrayList<>();
        cource();
        new_cource = view.findViewById(R.id.new_cource);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        new_cource.setLayoutManager(manager);

        TopicAdapter topicAdapter = new TopicAdapter(getActivity(),topicmodels);
        new_cource.setAdapter(topicAdapter);


        topicmodels = new ArrayList<>();
        begginers();
        begginers_recycler = view.findViewById(R.id.begginers_recycler);
        LinearLayoutManager manager1 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        begginers_recycler.setLayoutManager(manager1);

        TopicAdapter topicAdapter1 = new TopicAdapter(getActivity(),topicmodels);
        begginers_recycler.setAdapter(topicAdapter1);


        return view;
    }

    private void begginers() {
        Topicmodel model1 = new Topicmodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEgwSzyKVwjZ-2tBzKPnWOJYoyNWBXKYpRy6bxTMeCXvWYlIQe","Begginers Guide Chapter","Rube Lai");
        topicmodels.add(model1);

        Topicmodel model2 = new Topicmodel("http://varsitybreakout.com/wp-content/uploads/2013/04/Photographer.jpg","Scanning and Spot Film","Lessie Pair");
        topicmodels.add(model2);

        Topicmodel model3 = new Topicmodel("https://lh3.googleusercontent.com/Aefo-FPoAeLgA3HIDs04EFCs0AHurI3gr_P0rXFh6Ewm0b_wRcL4xONC0riAe2DK9ANkhyoMgrhPsaSV3Dv3-ajm=w228-h228-l90-c","Photography With Shedo","punepongals");
        topicmodels.add(model3);

        Topicmodel model4 = new Topicmodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQt6GdjLtN6lk0Cz5_aiwI_eTEbFYGwEf6oMFa1gIir-71h6dyABQ","Photography In Paris Propose","Paris Dairy");
        topicmodels.add(model4);

        Topicmodel model5 = new Topicmodel("http://www.kirstenlewisphoto.com/wp-content/uploads/2015/08/Best-Denver-Family-Photographer-5.jpg","seasor in Daive","Dumas Dairy");
        topicmodels.add(model5);




    }

    private void cource() {
        Topicmodel model1 = new Topicmodel("http://webneel.com/daily/sites/default/files/images/daily/06-2013/photographer-waiting.jpg","Studio and Location Light","Ronien Lewson");
        topicmodels.add(model1);

        Topicmodel model2 = new Topicmodel("http://lightartacademy.com/blog/wp-content/uploads/2015/12/silhouette-photographer.jpg","Digital Markting Photo","David Camroon");
        topicmodels.add(model2);

        Topicmodel model3 = new Topicmodel("https://images.pexels.com/photos/289796/pexels-photo-289796.jpeg?auto=compress&cs=tinysrgb&h=350","Wedding Cource","Modern Life");
        topicmodels.add(model3);

        Topicmodel model4 = new Topicmodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoRWWnygtQLk6AjU5XQRBGdT8NACHPZP6k9G7vTb0NzPXwiIO6","SEO Devlopers Photo","General Partners");
        topicmodels.add(model4);

        Topicmodel model5 = new Topicmodel("https://cdn.lynda.com/static/landing/images/hero/Photographer_1200x630-1503616614880.jpg","Zoomig and mirrioring glass view","Zoomingpedia");
        topicmodels.add(model5);

    }

}
