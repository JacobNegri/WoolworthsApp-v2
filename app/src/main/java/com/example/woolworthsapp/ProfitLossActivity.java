package com.example.woolworthsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfitLossActivity extends AppCompatActivity {

    @Override
    protected void onCrete(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profitloss);

        configureBackButton();
    }

    private void configureBackButton(){
        Button backbtn = (Button) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfitLossActivity.this, SecondActivity.class));
            }
        });
    }

}