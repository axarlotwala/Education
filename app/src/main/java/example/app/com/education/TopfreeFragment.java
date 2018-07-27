package example.app.com.education;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopfreeFragment extends Fragment {


    private Context mContext;
    private List<Freemodel> freemodels;

    public TopfreeFragment() {
        // Required empty public constructor
    }

    RecyclerView free_recycler;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_topfree, container, false);

        freemodels = new ArrayList<>();
        recycler_data();
        free_recycler = view.findViewById(R.id.free_recycler);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        free_recycler.setLayoutManager(manager);

        Freeadapter freeadapter = new Freeadapter(getActivity(),freemodels);
        free_recycler.setAdapter(freeadapter);

        return view;
    }

    private void recycler_data() {

        Freemodel freemodel = new Freemodel("https://gloimg.gbtcdn.com/gb/pdm-product-pic/Electronic/2017/02/23/goods-img/1487812202356641435.jpg",1,"Digital Darkroom Technology With DeepLarning","rubin Shekh","8 video Lession","6h 5m");
        freemodels.add(freemodel);

        Freemodel freemodel1 = new Freemodel("https://www.dhresource.com/0x0s/f2-albu-g4-M00-7D-33-rBVaEFm7jEGAJrJNAAG9B6rRD3k873.jpg/2017-new-small-sport-students-children-watch.jpg",2,"Histroy Of Photography","Hearbet Mephury","8 video","4h 32m");
        freemodels.add(freemodel1);

        Freemodel freemodel2 = new Freemodel("https://store.storeimages.cdn-apple.com/4667/as-images.apple.com/is/image/AppleInc/aos/published/images/4/2/42/ceramic/42-ceramic-gray-sport-black-s3-grid?wid=270&hei=275&fmt=jpeg&qlt=95&op_usm=0.5,0.5&.v=1504647831801",3,"Scanning And Spotting Data","Domic Plages","5 Video lession","2h 33m");
        freemodels.add(freemodel2);

        Freemodel freemodel3 = new Freemodel("https://n4.sdlcdn.com/imgs/b/x/k/Curren-Tan-Leather-Analog-Watch-SDL014396828-2-5cdfb.jpg",4,"Outdoor Photography","even levis","10 video lession","5h 33m");
        freemodels.add(freemodel3);

        Freemodel freemodel4 = new Freemodel("https://browze.com/media/catalog/product/F/a/Fashion-Star-Wars-Watch-Men-Watch-Leather-Strap-Mens-Watches-Popular-Boy-Watches-Male-Hour-Clock__2.jpg",5,"Life Style Family Photo","Edna Mack","6 Video Lession","2h 3m");
        freemodels.add(freemodel4);

        Freemodel freemodel5 = new Freemodel("https://www.casioindiashop.com/images/watches/g-shock-m2.jpg",6,"Android With Content","andru tye","5 Video Lession","48m 3s" );
        freemodels.add(freemodel5);

        Freemodel freemodel6 = new Freemodel("https://images-na.ssl-images-amazon.com/images/I/71B9KjLvTRL._UX342_.jpg",7,"Ios devloper With Script","Steve Jobs","120 Days lession","5h/");
        freemodels.add(freemodel6);

        Freemodel freemodel7 = new Freemodel("https://www.insasta.com/image/cache/catalog//U8-Bluetooth-Smart-Notification-Wrist-Watch-Smart-Phone-with-Touch-Scre/u8-bluetooth-smart-notification-wrist-watch-smart-phone-with-touch-screen-508-800x800.jpg",8,"Microsoft Devlopment","satya Nadela","150 Day Lession","4h/");
        freemodels.add(freemodel7);
    }

}
