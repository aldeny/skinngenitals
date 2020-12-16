package com.example.aldeny.skinngenitals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Switch;

public class PilihJkActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cV1, cV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_jk);

        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pilih Jenis Kelamin");

        cV1 = (CardView) findViewById(R.id.cardLk);
        cV2 = (CardView) findViewById(R.id.cardPr);

        cV1.setOnClickListener(this);
        cV2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardLk:
                i = new Intent(this, DiagnosisActivity.class);
                startActivity(i);
                break;

            case R.id.cardPr:
                i = new Intent(this, DiagnosisPRActivity.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}
