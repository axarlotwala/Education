package example.app.com.education;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {

    RecyclerView check_Recycler;
    private List<Check_model> check_models;

    public SettingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        check_models = new ArrayList<>();
        check_Recycler = view.findViewById(R.id.check_recycler);
        checkbox_method();

        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        check_Recycler.setLayoutManager(linearLayoutManager);

        Checked_adapter checked_adapter = new Checked_adapter(getActivity(),check_models);
        check_Recycler.setAdapter(checked_adapter);

        return view;
    }

    private void checkbox_method() {

        Check_model model = new Check_model("https://i.pinimg.com/736x/71/18/00/711800fe0487eff9c23dfa72db21d89c--acrylic-colors-creative-art.jpg","Arts");
        check_models.add(model);

        Check_model model1 = new Check_model("http://www.telebyte.ca/wp-content/uploads/2016/10/Business-People-left.png","Business");
        check_models.add(model1);

        Check_model model2 = new Check_model("https://d2axcg2cspgbkk.cloudfront.net/wp-content/uploads/Google-Maturation-AI-Wikibon.png","Computer Science");
        check_models.add(model2);

        Check_model model3 = new Check_model("https://static1.squarespace.com/static/55cea27ce4b0e9aecb833866/t/59d3af16268b96414dfc6aba/1507045157818/plates.png?format=300w","life Science");
        check_models.add(model3);

        Check_model model4 = new Check_model("https://i.pinimg.com/736x/71/18/00/711800fe0487eff9c23dfa72db21d89c--acrylic-colors-creative-art.jpg","Arts");
        check_models.add(model4);

        Check_model model5 = new Check_model("https://i.pinimg.com/736x/71/18/00/711800fe0487eff9c23dfa72db21d89c--acrylic-colors-creative-art.jpg","P.T.E");
        check_models.add(model5);

        Check_model model6 = new Check_model("https://i.pinimg.com/736x/71/18/00/711800fe0487eff9c23dfa72db21d89c--acrylic-colors-creative-art.jpg","IELTS");
        check_models.add(model6);

        Check_model model7 = new Check_model("https://i.pinimg.com/736x/71/18/00/711800fe0487eff9c23dfa72db21d89c--acrylic-colors-creative-art.jpg","Tofel");
        check_models.add(model7);

        Check_model model8 = new Check_model("https://i.pinimg.com/736x/71/18/00/711800fe0487eff9c23dfa72db21d89c--acrylic-colors-creative-art.jpg","G.R.E");
        check_models.add(model8);
    }

}
