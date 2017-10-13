package com.betagro.adulvitc.aquaculturewatertest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Adulvitc on 13/10/2560.
 */

public class GridAdapter extends BaseAdapter {

    private Context context;
    private int[] imagesInts;


    public GridAdapter(Context context, int[] imagesInts) {
        this.context = context;
        this.imagesInts = imagesInts;
    }

    @Override
    public int getCount() {
        return imagesInts.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.activity_adapter, viewGroup, false);

        ImageView imageView = view1.findViewById(R.id.imvIcon);

        imageView.setImageResource(imagesInts[i]);


        return view1;
    }


}   //Main Class
