package example.app.com.education;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by android on 30/6/18.
 */

public class Slide_adapter extends PagerAdapter {

    private Context mContext;
    private List<Integer> images;
    private LayoutInflater layoutInflater;

    public Slide_adapter(Context mContext, List<Integer> images) {
        this.mContext = mContext;
        this.images = images;
        layoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);

    }

    @Override
    public int getCount() {
        return images.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup view, int position) {
       View imageLayout =  layoutInflater.inflate(R.layout.image_slider,view,false);
        ImageView image = imageLayout.findViewById(R.id.image_slide);

        image.setImageResource(images.get(position));
        view.addView(imageLayout,0);
        return  imageLayout;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}
