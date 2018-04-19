package com.example.kknkuy.kknkuy;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost TabHostWindow;
        TabHostWindow = (TabHost) findViewById(android.R.id.tabhost);

        TabSpec tab1 = TabHostWindow.newTabSpec("Tab satu");
        TabSpec tab2 = TabHostWindow.newTabSpec("Tab dua");
        TabSpec tab3 = TabHostWindow.newTabSpec("Tab tiga");

        tab1.setIndicator("Home");
        tab1.setContent(new Intent(this, Home.class));
        tab2.setIndicator("Pengumuman");
        tab2.setContent(new Intent(this, Pengumuman.class));
        tab3.setIndicator("OpRec");
        tab3.setContent(new Intent(this, OpRec.class));

        TabHostWindow.addTab(tab1);
        TabHostWindow.addTab(tab2);
        TabHostWindow.addTab(tab3);
    }
}
