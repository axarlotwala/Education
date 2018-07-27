package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.security.cert.Extension;
import java.util.List;

/**
 * Created by android on 2/7/18.
 */

public class Experiance_adapter extends RecyclerView.Adapter<Experiance_adapter.Viewholder> {

    Context mContext;
    private List<Experiance_model> experiance_models;

    public Experiance_adapter(Context mContext, List<Experiance_model> experiance_models) {
        this.mContext = mContext;
        this.experiance_models = experiance_models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_experiance,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.lession.setText(experiance_models.get(position).getLession());
        holder.heading.setText(experiance_models.get(position).getHeading());
        holder.description.setText(experiance_models.get(position).getDescription());
        holder.timer.setText(experiance_models.get(position).getTimer());
        holder.video.setText(experiance_models.get(position).getVideo());
    }

    @Override
    public int getItemCount() {
        return experiance_models.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
        TextView lession;
        TextView heading;
        TextView description;
        TextView timer;
        TextView video;

        public Viewholder(View itemView) {
            super(itemView);

        lession = itemView.findViewById(R.id.lession);
        heading = itemView.findViewById(R.id.heading);
        description = itemView.findViewById(R.id.description);
        timer = itemView.findViewById(R.id.timer);
        video = itemView.findViewById(R.id.video);


        }
    }
}
