package example.app.com.education;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by ${Ican} on 22/6/18.
 */
public class Cource_adapter extends RecyclerView.Adapter<Cource_adapter.ViewHolder> {
    private Context mContext;
    private List<Library_model> library_models;


    public Cource_adapter(Context mContext, List<Library_model> library_models) {
        this.mContext = mContext;
        this.library_models = library_models;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_library,parent,false);
            return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.txt_image.setImageResource(library_models.get(position).gettxtImage());
        holder.cource_name.setText(library_models.get(position).getName());




    }

    @Override
    public int getItemCount() {
        return library_models.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        TextView cource_name;
        ImageView txt_image;

        public ViewHolder(View itemView) {
            super(itemView);

            txt_image = itemView.findViewById(R.id.txt_image);
            cource_name = itemView.findViewById(R.id.cource_name);
        }
    }
}
