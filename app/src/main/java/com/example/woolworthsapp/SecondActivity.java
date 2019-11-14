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

        contactcard = (CardView) findViewById(R.id.contactscard);
        floralcard = (CardView) findViewById(R.id.floralcard);
        profitlosscard = (CardView) findViewById(R.id.profitlosscard);
        schedulecard = (CardView) findViewById(R.id.plannercard);
        supplycard = (CardView) findViewById(R.id.marketupdatecard);

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
            case R.id.contactscard : i = new Intent(this,ContactsActivity.class); break;
            case R.id.floralcard : i = new Intent(this,FloralActivity.class); break;
            case R.id.profitlosscard : i = new Intent(this,ProfitLossActivity.class); break;
            case R.id.plannercard : i = new Intent(this,ScheduleActivity.class); break;
            case R.id.marketupdatecard : i = new Intent(this,SupplyActivity.class); break;
            default:break;
        }
    }
}
