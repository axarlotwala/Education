package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by android on 27/6/18.
 */

public class Activity_adapter extends RecyclerView.Adapter<Activity_adapter.ViewHolder> {

    Context mContext;
    private List<Activity_model> activity_models;

    public Activity_adapter(Context mContext, List<Activity_model> activity_models) {
        this.mContext = mContext;
        this.activity_models = activity_models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(mContext).load(activity_models.get(position).getImage()).into(holder.image);
        holder.time.setText(activity_models.get(position).getTime());
        holder.desc.setText(activity_models.get(position).getDesc());


    }

    @Override
    public int getItemCount() {
        return activity_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView time;
        TextView desc;

        public ViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            time = itemView.findViewById(R.id.time);
            desc = itemView.findViewById(R.id.desc);

        }
    }
}
