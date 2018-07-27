package example.app.com.education;

import android.content.Context;
import android.media.Image;
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
 * Created by android on 4/7/18.
 */

public class InterestedAdapter extends RecyclerView.Adapter<InterestedAdapter.Viewholder> {

    private Context mContext;
    private List<Interested_model> interested_models;

    public InterestedAdapter(Context mContext, List<Interested_model> interested_models) {
        this.mContext = mContext;
        this.interested_models = interested_models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.interested_cource_layout,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Glide.with(mContext).load(interested_models.get(position).getCh_image()).into(holder.ch_image);
        holder.chapter.setText(interested_models.get(position).getChapter());
        holder.pending.setText(interested_models.get(position).getPending());
        holder.hours.setText(interested_models.get(position).getHours());
    }

    @Override
    public int getItemCount() {
        return interested_models.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView ch_image;
        TextView chapter;
        TextView pending;
        TextView hours;


        public Viewholder(View itemView) {
            super(itemView);

            ch_image = itemView.findViewById(R.id.ch_image);
            chapter = itemView.findViewById(R.id.chapter);
            pending = itemView.findViewById(R.id.pending);
            hours = itemView.findViewById(R.id.hours);

        }
    }
}
