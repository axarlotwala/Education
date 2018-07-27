package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by android on 29/6/18.
 */

public class Child_adapter extends RecyclerView.Adapter<Child_adapter.ViewHolder> {

    Context mContext;
    private List<Child_recycler> child_recyclers;

    public Child_adapter(Context mContext, List<Child_recycler> child_recyclers) {
        this.mContext = mContext;
        this.child_recyclers = child_recyclers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.democheckbox,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.demo_text.setText(child_recyclers.get(position).getDemo_text());
        holder.demo_check.setChecked(true);

    }

    @Override
    public int getItemCount() {
        return child_recyclers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView demo_text;
        CheckBox demo_check;


        public ViewHolder(View itemView) {
            super(itemView);

            demo_text = itemView.findViewById(R.id.demo_text);
            demo_check = itemView.findViewById(R.id.demo_check);

        }
    }


}
