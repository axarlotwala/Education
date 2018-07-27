package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.github.aakira.expandablelayout.ExpandableLinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android on 29/6/18.
 */

public class Checked_adapter extends RecyclerView.Adapter<Checked_adapter.ViewHolder> {

    private Context mContext;
    private List<Check_model> check_models;


    public Checked_adapter(Context mContext, List<Check_model> check_models) {
        this.mContext = mContext;
        this.check_models = check_models;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.checkview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        Glide.with(mContext).load(check_models.get(position).getImage()).into(holder.image);
        holder.title.setText(check_models.get(position).getTitle());
     /*   holder.name1.setText(check_models.get(position).getName1());
        holder.name2.setText(check_models.get(position).getName2());
        holder.name3.setText(check_models.get(position).getName3());*/
        holder.demo_check.setChecked(true);
        holder.demo_check.setChecked(true);
        holder.demo_check.setChecked(true);


        /*holder.checkmark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    if(check_models.get(position).getCheckmark().isSelected())
                {
                    holder.checkmark.setChecked(true);
                } else {
                        holder.checkmark.setChecked(false);
                    }
            }
        });*/

        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.expand_check.toggle();

                Snackbar snackbar;
                snackbar = Snackbar.make(v,"Next",Snackbar.LENGTH_SHORT);
                View SnackBarView = snackbar.getView();
                SnackBarView.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorPrimary));
                snackbar.show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return check_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;
        ExpandableLinearLayout expand_check;
        RecyclerView check_Recycler;
       /* TextView name1;
        TextView name2;
        TextView name3;*/
        CheckBox demo_check;
        CheckBox demo_check1;
        CheckBox demo_check2;


        public ViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            expand_check = itemView.findViewById(R.id.expand_check);
            check_Recycler = itemView.findViewById(R.id.check_recycler);
        /*    name1 = itemView.findViewById(R.id.name1);
            name2 = itemView.findViewById(R.id.name2);
            name3 = itemView.findViewById(R.id.name3);*/
            demo_check = itemView.findViewById(R.id.demo_check);
            demo_check1= itemView.findViewById(R.id.demo_check);
            demo_check2 = itemView.findViewById(R.id.demo_check);


        }
    }

}
