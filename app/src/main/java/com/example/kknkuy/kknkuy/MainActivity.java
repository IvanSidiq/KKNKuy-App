package com.example.kknkuy.kknkuy;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("KKNKuy");
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

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Chat.class));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_sign_in) {
            startActivity(new Intent(MainActivity.this,Login.class));
        } else if (id == R.id.nav_setting) {
            startActivity(new Intent(MainActivity.this,Setting.class));
        } else if (id == R.id.nav_help) {
            startActivity(new Intent(MainActivity.this,Help.class));
        } else if (id == R.id.nav_about_us) {
            startActivity(new Intent(MainActivity.this,AboutUs.class));
        } else if (id == R.id.nav_log_out) {
            startActivity(new Intent(MainActivity.this,BelumTersedia.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
