package example.app.com.education;

import android.content.Context;
import android.opengl.Visibility;
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
 * Created by android on 7/7/18.
 */

public class Softwareadapter extends RecyclerView.Adapter<Softwareadapter.Viewholder> {

    private Context mContext;
    private List<Softwaremodel> softwaremodels;

    public Softwareadapter(Context mContext, List<Softwaremodel> softwaremodels) {
        this.mContext = mContext;
        this.softwaremodels = softwaremodels;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.software, parent, false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.number.setText(softwaremodels.get(position).getNumber() + "");
        holder.texttitle.setText(softwaremodels.get(position).getName());

        if (softwaremodels.get(position).getPhoto()==null){
            holder.capt.setVisibility(View.GONE);
        }else {
            Glide.with(mContext).load(softwaremodels.get(position).getPhoto()).into(holder.capt);
        }

    }

    @Override
    public int getItemCount() {
        return softwaremodels.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {

        TextView number;
        TextView texttitle;
        ImageView capt;

        public Viewholder(View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.number);
            texttitle = itemView.findViewById(R.id.texttitle);
            capt = itemView.findViewById(R.id.capt);


        }
    }
}
