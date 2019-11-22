package com.example.woolworthsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView profitlosscard, supplycard, floralcard, schedulecard, contactcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        profitlosscard = (CardView)findViewById(R.id.profitloss_card);
        supplycard = (CardView)findViewById(R.id.marketupdate_card);
        floralcard = (CardView)findViewById(R.id.floral_card);
        schedulecard = (CardView)findViewById(R.id.planner_card);
        contactcard = (CardView)findViewById(R.id.contacts_card);

        profitlosscard.setOnClickListener(this);
        supplycard.setOnClickListener(this);
        floralcard.setOnClickListener(this);
        schedulecard.setOnClickListener(this);
        contactcard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.profitloss_card : i = new Intent(this,Actual1.class);startActivity(i); break;
            case R.id.marketupdate_card : i = new Intent(this,Actual2.class);startActivity(i); break;
            case R.id.floral_card : i = new Intent(this,Actual3.class);startActivity(i); break;
            case R.id.planner_card : i = new Intent(this,Actual4.class);startActivity(i); break;
            case R.id.contacts_card : i = new Intent(this,Actual5.class);startActivity(i); break;
            default:break;
        }
    }
}
