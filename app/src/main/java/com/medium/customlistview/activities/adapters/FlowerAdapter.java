package com.medium.customlistview.activities.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.medium.customlistview.R;
import com.medium.customlistview.activities.models.Flower;
import java.util.ArrayList;

public class FlowerAdapter extends BaseAdapter {

    private ArrayList<Flower> flowers;
    private Context context;
    private LayoutInflater layoutInflater;

    public FlowerAdapter(Context context, ArrayList<Flower> flowers){
        this.context = context;
        this.flowers = flowers;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return flowers.size();
    }

    @Override
    public Object getItem(int i) {
        return flowers.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View customView = layoutInflater.inflate(R.layout.design_listview_custom,null);
        ImageView photo = (ImageView) customView.findViewById(R.id.flowerPhoto);
        TextView name = (TextView) customView.findViewById(R.id.flowerName);
        TextView genus = (TextView) customView.findViewById(R.id.flowerGenus);

        photo.setImageResource(flowers.get(i).getPhoto());
        name.setText(flowers.get(i).getName());
        genus.setText(flowers.get(i).getGenus());

        return customView;
    }
}
