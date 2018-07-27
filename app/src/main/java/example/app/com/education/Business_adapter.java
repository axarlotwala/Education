package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by android on 2/7/18.
 */

public class Business_adapter extends RecyclerView.Adapter<Business_adapter.ViewHolder> {

    private Context mContext;
    private List<Business_model> business_models;

    public Business_adapter(Context mContext, List<Business_model> business_models) {
        this.mContext = mContext;
        this.business_models = business_models;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.business,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(mContext).load(business_models.get(position).getImage()).into(holder.business_image);

    }

    @Override
    public int getItemCount() {
        return business_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView business_image;


        public ViewHolder(View itemView) {
            super(itemView);

        business_image = itemView.findViewById(R.id.business_image);

        }
    }
}
