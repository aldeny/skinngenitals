/*
 * Copyright (c) Aldeny 2019
 */

package com.example.aldeny.skinngenitals;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView card1,card2,card3,card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



        //Pendefinisian CardView//
        card1 = (CardView) findViewById(R.id.dataCard);
        card2 = (CardView) findViewById(R.id.diagCard);
        card3 = (CardView) findViewById(R.id.tentangCard);
        card4 = (CardView) findViewById(R.id.bantuanCard);

        //Code Clik untuk CardVIew//
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.dataCard : i = new Intent(this, PenyakitActivity.class);startActivity(i);
                break;

            case R.id.diagCard : i = new Intent(this, PilihJkActivity.class);startActivity(i);
                break;

            case R.id.tentangCard : i = new Intent(this, TentangActivity.class);startActivity(i);
                break;

            case R.id.bantuanCard : i = new Intent(this, BantuanActivity.class);startActivity(i);
                /*overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);*/break;

            default:break;
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.drawable.icon);
        builder.setMessage("Apakah anda ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }

}
