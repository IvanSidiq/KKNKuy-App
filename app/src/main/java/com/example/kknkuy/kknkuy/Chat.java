package com.example.kknkuy.kknkuy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by user on 18/04/2018.
 */

public class Chat extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        RelativeLayout chat1 = (RelativeLayout) findViewById(R.id.chatBox);
        chat1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, ChatRoom.class));
            }
        });
        RelativeLayout chat2 = (RelativeLayout) findViewById(R.id.chatBox2);
        chat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, ChatRoom.class));
            }
        });
        RelativeLayout chat3 = (RelativeLayout) findViewById(R.id.chatBox3);
        chat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, ChatRoom.class));
            }
        });
        RelativeLayout chat4 = (RelativeLayout) findViewById(R.id.chatBox4);
        chat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, ChatRoom.class));
            }
        });
        ImageView team1 = (ImageView) findViewById(R.id.teamaccount1);
        team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, TeamAccount.class));
            }
        });
        ImageView team2 = (ImageView) findViewById(R.id.teamaccount2);
        team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, TeamAccount.class));
            }
        });
        ImageView team3 = (ImageView) findViewById(R.id.teamaccount3);
        team3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, TeamAccount.class));
            }
        });
        ImageView team4 = (ImageView) findViewById(R.id.teamaccount4);
        team4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this, TeamAccount.class));
            }
        });
    }
}
