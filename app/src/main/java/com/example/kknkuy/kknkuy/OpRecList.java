package com.example.kknkuy.kknkuy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 07/04/2018.
 */

public class OpRecList extends Activity {
    int position = 0;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oprec_list);

        Intent intent = getIntent();
        position = intent.getExtras().getInt("position");

        Database adapter = new Database(this);
        ImageView gambar = (ImageView)findViewById(R.id.gambar);
        TextView judulkkn = (TextView)findViewById(R.id.judul);

        gambar.setImageResource(adapter.gambar[position]);
        judulkkn.setText(adapter.judulkkn[position]);
    }
}
