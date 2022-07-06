package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter {
    ArrayList Gridlist = new ArrayList<Item>();
    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Item> objects) {
        super(context, resource, objects);
        Gridlist = objects;
    }
    public int getCount(){
        return super.getCount();
    }
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.grid_view, null);
        Item a = (Item) Gridlist.get(position);
        TextView name = v.findViewById(R.id.textView);
        TextView desc = v.findViewById(R.id.textView2);
        TextView price = v.findViewById(R.id.textView3);
        TextView mrp = v.findViewById(R.id.textView4);
        TextView disc = v.findViewById(R.id.textView5);
        ImageView img = v.findViewById(R.id.imageView);
        price.setText(a.getPrice());
        name.setText(a.getItem_name());
        desc.setText(a.getDescription());
        disc.setText(a.getDiscount());
        mrp.setText(a.getMrp());
        img.setImageResource(a.getImage());
        return v;
    }
}
