package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableLinearLayout;

import java.util.List;

/**
 * Created by android on 6/7/18.
 */

public class Enrolladapter extends RecyclerView.Adapter<Enrolladapter.ViewHolder> {

    private Context mContext;
    private List<Enrollmodel> enrollmodels;


    public Enrolladapter(Context mContext, List<Enrollmodel> enrollmodels) {
        this.mContext = mContext;
        this.enrollmodels = enrollmodels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.enroll,parent,false);
        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
            holder.radio_text.setText(enrollmodels.get(position).getDetail());
            holder.price.setText(enrollmodels.get(position).getPrice());
            holder.content.setText(enrollmodels.get(position).getContent());
            holder.h_count.setText(enrollmodels.get(position).getH_count());
            holder.video_lession.setText(enrollmodels.get(position).getVideo_lesson());
            holder.verify.setText(enrollmodels.get(position).getVerify());
            holder.setIsRecyclable(false);
            holder.expand_view.setInRecyclerView(true);
            holder.expand_view.initLayout();

            holder.radio_text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.expand_view.toggle();

                }
            });


    }

    @Override
    public int getItemCount() {
        return enrollmodels.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {


        TextView radio_text;
        TextView price;
        TextView content;
        TextView h_count;
        TextView video_lession;
        TextView verify;
        ExpandableLinearLayout expand_view;

        public ViewHolder(View itemView) {
            super(itemView);

            radio_text = itemView.findViewById(R.id.radio_text);
            price = itemView.findViewById(R.id.price);
            content = itemView.findViewById(R.id.content);
            h_count = itemView.findViewById(R.id.h_count);
            video_lession = itemView.findViewById(R.id.video_lession);
            verify = itemView.findViewById(R.id.verify);
            expand_view = itemView.findViewById(R.id.expand_view);



        }
    }
}
