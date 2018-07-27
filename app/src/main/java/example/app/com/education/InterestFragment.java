package example.app.com.education;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class InterestFragment extends Fragment {

    private List<Interested_model> interested_models;
    RecyclerView playlist_recycler;


    public InterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_interest, container, false);

        interested_models = new ArrayList<>();
        playlist();
        playlist_recycler = view.findViewById(R.id.playlist_recycler);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        playlist_recycler.setLayoutManager(manager);

        InterestedAdapter interestedAdapter = new InterestedAdapter(getActivity(),interested_models);
        playlist_recycler.setAdapter(interestedAdapter);




        return view;
    }

    private void playlist() {

        Interested_model model = new Interested_model("https://i2.wp.com/fotility.com/wp-content/uploads/2018/03/jerry-roxas-photography.jpg?w=888","Accounting And Finincial Statement","6 Video Lession","5h 4m");
        interested_models.add(model);

        Interested_model model2 = new Interested_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTC0MC6Vdh-ofvgYXbTqkyCkG5VhwBt-dIzNkthn3oTizLWoBW7","Stocks And Bonds","1 Video lession","10m 5s");
        interested_models.add(model2);

        Interested_model model3 = new Interested_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSn6Wx4QJp_NiUWm-fTGOh_lRLHdadye7Yfw4LH4tyn2AvC-TxLWQ","Insvement Vehical and Insurance","6 Video Lession","15m 20s");
        interested_models.add(model3);

        Interested_model model4 = new Interested_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbMciLnrlIN_qn-_KOb_Ug5EFRzXByF66XC9BDU352YJ9PQ1ROcQ","Money Banking And Central Banking","10 Video Lession","8h 45m");
        interested_models.add(model4);

        Interested_model model5 = new Interested_model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0wNwYP4NS87Z_k1kDgsYp-yWY_WuULuENpGJ-zthrg0kDnn3cAg","Current Economics","6 Video Lession","6h 43m");
        interested_models.add(model5);

        Interested_model model6 = new Interested_model("https://qph.fs.quoracdn.net/main-qimg-5818851f1a063a86c013ba5248d85517","Business And Fundamentals","5 Video Lession","5h 40m");
        interested_models.add(model6);

    }

}
