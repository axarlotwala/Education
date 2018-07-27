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
 * Created by android on 6/7/18.
 */

public class Freeadapter extends RecyclerView.Adapter<Freeadapter.ViewHolder> {

    private Context mContext;
    private List<Freemodel> freemodels;

    public Freeadapter(Context mContext, List<Freemodel> freemodels) {
        this.mContext = mContext;
        this.freemodels = freemodels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.topfreelayout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(mContext).load(freemodels.get(position).getImage_url()).into(holder.photos);
        holder.numbers.setText(freemodels.get(position).getNum()+"");
        holder.titles.setText(freemodels.get(position).getFree_title());
        holder.name.setText(freemodels.get(position).getFree_name());
        holder.video_count.setText(freemodels.get(position).getVideo_count());
        holder.hours_count.setText(freemodels.get(position).getHours_count());
    }

    @Override
    public int getItemCount() {
        return freemodels.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView photos;
        TextView numbers;
        TextView titles;
        TextView name;
        TextView video_count;
        TextView hours_count;

        public ViewHolder(View itemView) {
            super(itemView);


            photos = itemView.findViewById(R.id.photo);
            numbers = itemView.findViewById(R.id.numbers);
            titles = itemView.findViewById(R.id.titles);
            name = itemView.findViewById(R.id.name);
            video_count = itemView.findViewById(R.id.video_count);
            hours_count =itemView.findViewById(R.id.hours_count);
        }
    }

}
