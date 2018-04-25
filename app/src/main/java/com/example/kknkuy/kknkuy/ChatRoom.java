package com.example.kknkuy.kknkuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.cenkgun.chatbar.ChatBarView;

public class ChatRoom extends AppCompatActivity {

    TextView textView;      //buat activity_chat_room
    ChatBarView chatBarView;//buat activity_chat_room
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_room);

        textView = findViewById(R.id.textView);
        chatBarView = findViewById(R.id.chatBar);

        //setup
        chatBarView.setMessageBoxHint("Enter your message");
    }
}
