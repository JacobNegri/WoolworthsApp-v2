package com.example.woolworthsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView contactcard, floralcard, profitlosscard, schedulecard, supplycard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        contactcard = (CardView) findViewById(R.id.contacts_card);
        floralcard = (CardView) findViewById(R.id.floral_card);
        profitlosscard = (CardView) findViewById(R.id.profitloss_card);
        schedulecard = (CardView) findViewById(R.id.planner_card);
        supplycard = (CardView) findViewById(R.id.marketupdate_card);

        contactcard.setOnClickListener(this);
        floralcard.setOnClickListener(this);
        profitlosscard.setOnClickListener(this);
        schedulecard.setOnClickListener(this);
        supplycard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.contacts_card : i = new Intent(this,ContactsActivity.class);startActivity(i); break;
            case R.id.floral_card : i = new Intent(this,FloralActivity.class);startActivity(i); break;
            case R.id.profitloss_card : i = new Intent(this,ProfitLossActivity.class);startActivity(i); break;
            case R.id.planner_card : i = new Intent(this,ScheduleActivity.class);startActivity(i); break;
            case R.id.marketupdate_card : i = new Intent(this,SupplyActivity.class);startActivity(i); break;
            default:break;
        }
    }
}
