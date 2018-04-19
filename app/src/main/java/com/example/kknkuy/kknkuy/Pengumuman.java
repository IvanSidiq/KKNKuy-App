package com.example.kknkuy.kknkuy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Pengumuman extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pengumuman);

        Button button_tambah = (Button) findViewById(R.id.pengumuman_tambah);
        button_tambah.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pengumuman.this, PengumumanTambah.class));
            }
        });
    }

    public void func1(View view){
        startActivity(new Intent(Pengumuman.this, PengumumanRinci.class));}
}
