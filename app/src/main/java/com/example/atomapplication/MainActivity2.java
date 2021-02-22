package com.example.atomapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends MainActivity {

    Button mButton;
    EditText mEdit;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setContentView(R.layout.activity_main2);
        mButton = findViewById(R.id.enterbutton);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit = findViewById(R.id.PersonName);
                String theString = mEdit.getText().toString();
                Intent i = new Intent(String.valueOf(this), MainActivity3.java);
                i.putExtra("key", theString);
                startActivity(i);
            }
        });


    }

}
