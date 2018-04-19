package com.example.kknkuy.kknkuy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class Database extends BaseAdapter {
    Context c;
    int[] gambar = {R.drawable.sukaurip, R.drawable.sendang, R.drawable.bukit, R.drawable.pulau, R.drawable.sidomulyo};
    String[] judulkkn = {"Sukaurip", "Sendang", "Bukit Batu", "Pulau Kelapa", "Sidomulyo Makaryo"};

    public Database (Context ctx){
        this.c = ctx;
    }

    @Override
    public int getCount(){
        return judulkkn.length;
    }

    @Override
    public Object getItem(int i){
        return judulkkn[i];
    }

    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup){
        LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.oprec_list,null);

        ImageView mGambar = convertView.findViewById(R.id.gambar);
        TextView mJudul = convertView.findViewById(R.id.judul);

        mGambar.setImageResource(gambar[i]);
        mJudul.setText(judulkkn[i]);

        return convertView;
    }
}

