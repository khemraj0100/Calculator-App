package com.example.calcutator.util;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calcutator.R;

public class sample extends AppCompatActivity implements View.OnClickListener {
private Button showToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);


        Button showToast = (Button) findViewById(R.id.Bnt1);
        showToast.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Bnt1: {
                Toast.makeText(this, "hello", Toast.LENGTH_LONG).show();
            }
        }


    }
}