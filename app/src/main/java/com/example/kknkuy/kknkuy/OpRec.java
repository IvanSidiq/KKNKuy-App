package com.example.kknkuy.kknkuy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by ASUS on 06/04/2018.
 */

public class OpRec extends Activity {

    GridView mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oprec);
        mView = (GridView) findViewById(R.id.gridview2);

        Database database = new Database(this);
        mView.setAdapter(database);

        mView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getApplicationContext(),OpRecList.class);
                intent.putExtra("position", i);

                startActivity(intent);
            }
        });
    }
}
