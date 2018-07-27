package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by android on 26/6/18.
 */

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.ViewHolder> {

    private Context mContext;
    private List<Featured_model> featured_models;

    public FeaturedAdapter(Context mContext, List<Featured_model> featured_models) {
        this.mContext = mContext;
        this.featured_models = featured_models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_layout,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.title.setText(featured_models.get(position).getName());
        holder.name.setText(featured_models.get(position).getTitle());
        holder.count.setText(featured_models.get(position).getCount());
        holder.time.setText(featured_models.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return featured_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView title;
        TextView name;
        TextView count;
        TextView time;



        public ViewHolder(final View itemView) {
            super(itemView);



            title = itemView.findViewById(R.id.title);
            name = itemView.findViewById(R.id.name);
            count = itemView.findViewById(R.id.count);
            time = itemView.findViewById(R.id.time);

            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }
    }
}
