package com.example.qianqian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chat.ChatMainActivity;
import com.example.myapplication.SquareMainActivity;
import com.example.personal.PersonalMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goChat(View view) {
        startActivity(new Intent(this, ChatMainActivity.class));
    }

    public void goSquare(View view) {
        startActivity(new Intent(this, SquareMainActivity.class));
    }

    public void goPersonal(View view) {
        startActivity(new Intent(this, PersonalMainActivity.class));
    }
}