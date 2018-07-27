package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;



public class Card_apapter extends RecyclerView.Adapter<Card_apapter.ViewHolder>  {

    private Context mContext;
    private List<Card_model> card_models;

    public Card_apapter(Context mContext, List<Card_model> card_models) {
        this.mContext = mContext;
        this.card_models = card_models;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cource_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(card_models.get(position).getCard_title());
        holder.name.setText(card_models.get(position).getName());
        holder.rating_star.setRating(card_models.get(position).getRating_star());
        holder.fees.setText(card_models.get(position).getFees()+"");
        Glide.with(mContext).load(card_models.get(position).getCard_image()).into(holder.card_image);



    }

    @Override
    public int getItemCount() {
        return card_models.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView card_image;
        TextView title;
        TextView name;
        RatingBar rating_star;
        TextView fees;


        public ViewHolder(View itemView) {
            super(itemView);


            card_image = itemView.findViewById(R.id.card_image);
            title = itemView.findViewById(R.id.title);
            name = itemView.findViewById(R.id.name);
            rating_star = itemView.findViewById(R.id.rating_star);
            fees = itemView.findViewById(R.id.fees);

        }
    }


}
