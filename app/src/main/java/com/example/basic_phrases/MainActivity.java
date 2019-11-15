package com.example.basic_phrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){
       int id = view.getId();
       String ourId = "";
       ourId = view.getResources().getResourceEntryName(id);
        Log.i("Button Tabbed:", "button Click : " + ourId);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
