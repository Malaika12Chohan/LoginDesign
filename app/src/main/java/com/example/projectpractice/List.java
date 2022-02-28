package com.example.projectpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class List extends BaseAdapter {
    Context context;
    String jewleryList[];
    int pics[];
    LayoutInflater inflater;
    public List (Context applicationContex, String[] jewleryList,int[] pics){
        this.context = context;
        this.jewleryList = jewleryList;
        this.pics=pics;
        inflater = (LayoutInflater.from(applicationContex)) ;

    }
    @Override
    public int getCount(){
        return jewleryList.length;
    }
    @Override
    public Object getItem(int i){
        return null;
    }
    @Override
    public long getItemId(int i){
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup ViewGroup){
        view = inflater.inflate(R.layout.list_items,null);
        TextView jewlery = (TextView) view.findViewById(R.id.text1);
        ImageView image = (ImageView) view.findViewById(R.id.image);
        jewlery.setText(jewleryList[i]);
        image.setImageResource(pics[i]);
        return view;
    }
}



