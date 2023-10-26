package com.example.notestest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

class Notes {
    static String name, text;
    String GetName(String filename){
        filename = name;
        return name;
    }
    void SetText(String filetext){
        this.text = filetext;
    }
    Notes(String nameoffile, String txt) {
        GetName(name);
        SetText(text);
    }
}
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}