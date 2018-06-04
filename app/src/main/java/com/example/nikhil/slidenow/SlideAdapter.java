package com.example.nikhil.slidenow;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by NIKHIL on 04-06-2018.
 */

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    //List of images

    public int[] list_img =
            {
                    R.drawable.image_1,
                    R.drawable.image_2,
                    R.drawable.image_3,
                    R.drawable.image_4
            };


    //List Of Titles

    public String[] list_title =
            {
                    "COSMONOUT",
                    "SATELLITE",
                    "GALAXY",
                    "ROCKET"
            };

    //List of Descriptions

    public String[] list_descriptions =
            {

                    "Even though space travel didn’t happen until the 1960’s, rockets have been around for a long time. The first rocket was invented by the Chinese around year 1200. Rockets are the oldest of all engines. ",
                    "A galaxy is a massive group of stars, star clusters, interstellar gas and dust, and dark matter which is all gravitationally bound together.",
                    "The word 'galaxy' is derived from the Greek word galaxias which means \"milky\", it is a reference to our own galaxy the Milky Way. ",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi "
            };

    //List of background colors

    public int[] list_colors =
    {
        Color.rgb(111, 0, 253),
        Color.rgb(239,85,85),
        Color.rgb(110,49,89),
        Color.rgb(1,188,212)


    };

    public SlideAdapter(Context context)
    {
        this.context = context;
    }


    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.slide,container,false);

        LinearLayout layoutSlide =  view.findViewById(R.id.slideLinearLayout);

        ImageView imgSlide =  view.findViewById(R.id.slideImage);

        TextView textTitle = view.findViewById(R.id.txtTitle);

        TextView textDesc = view.findViewById(R.id.textDesc);

        layoutSlide.setBackgroundColor(list_colors[position]);

        imgSlide.setImageResource(list_img[position]);

        textTitle.setText(list_title[position]);

        textDesc.setText(list_descriptions[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }
}
