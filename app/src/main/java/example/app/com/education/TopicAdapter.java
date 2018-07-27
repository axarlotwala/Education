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
 * Created by android on 4/7/18.
 */

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.Viewholder> {

    private Context context;
    private List<Topicmodel> topicmodels;

    public TopicAdapter(Context context, List<Topicmodel> topicmodels) {
        this.context = context;
        this.topicmodels = topicmodels;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topiclayout,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Glide.with(context).load(topicmodels.get(position).getImageurl()).into(holder.topic_image);
        holder.tv_title.setText(topicmodels.get(position).getTitle());
        holder.name.setText(topicmodels.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return topicmodels.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        ImageView topic_image;
        TextView tv_title;
        TextView name;

        public Viewholder(View itemView) {
            super(itemView);


            topic_image = itemView.findViewById(R.id.topic_image);
            tv_title = itemView.findViewById(R.id.tv_title);
            name = itemView.findViewById(R.id.name);
        }


    }



}
