package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableLayout;
import com.github.aakira.expandablelayout.ExpandableLinearLayout;

import java.util.List;

/**
 * Created by android on 27/6/18.
 */

public class Expand_adapter extends RecyclerView.Adapter<Expand_adapter.ViewHolder> {

    Context mContext;
    private List<Expand_model> expand_models;


    public Expand_adapter(Context mContext, List<Expand_model> expand_models) {
        this.mContext = mContext;
        this.expand_models = expand_models;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expendable_view,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        holder.setIsRecyclable(false);
        holder.expandable.setInRecyclerView(true);
        holder.expand_title.setText(expand_models.get(position).getTitle());
        holder.expand_detail.setText(expand_models.get(position).getExpand_detail());
        holder.expandable.initLayout();




        holder.expand_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.expandable.toggle();
            }
        });





    }

    @Override
    public int getItemCount() {
        return expand_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView expand_title;
        TextView expand_detail;
        ExpandableLinearLayout expandable;


        public ViewHolder(View itemView) {
            super(itemView);

            expand_title = itemView.findViewById(R.id.expand_title);
            expand_detail = itemView.findViewById(R.id.expand_detail);
            expandable = itemView.findViewById(R.id.expandable);
        }

    }

}

