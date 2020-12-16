/*
 * Copyright (c) Aldeny 2019
 */

package com.example.aldeny.skinngenitals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView penyakit;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Hasil Cek Penyakit");

        Bundle b = getIntent().getExtras();

        penyakit = (TextView) findViewById(R.id.tvPenyakit);

        penyakit.setText(b.getCharSequence("Penyakit"));


        btn = findViewById(R.id.lihat);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(HasilActivity.this, PenyakitActivity.class);
    }
}
