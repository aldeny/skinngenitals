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

public class PenyakitActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);

        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Informasi Penyakit");

        //Pendefinisian Button//
        bt1 = (Button) findViewById(R.id.btn1);
        bt2 = (Button) findViewById(R.id.btn2);
        bt3 = (Button) findViewById(R.id.btn3);
        bt4 = (Button) findViewById(R.id.btn4);
        bt5 = (Button) findViewById(R.id.btn5);
        bt6 = (Button) findViewById(R.id.btn6);
        bt7 = (Button) findViewById(R.id.btn7);
        bt8 = (Button) findViewById(R.id.btn8);
        bt9 = (Button) findViewById(R.id.btn9);
        bt10 = (Button) findViewById(R.id.btn10);
        bt11 = (Button) findViewById(R.id.btn11);
        bt12 = (Button) findViewById(R.id.btn12);
        bt13 = (Button) findViewById(R.id.btn13);
        bt14 = (Button) findViewById(R.id.btn14);
        bt15 = (Button) findViewById(R.id.btn15);
        bt16 = (Button) findViewById(R.id.btn16);
        bt17 = (Button) findViewById(R.id.btn17);
        bt18 = (Button) findViewById(R.id.btn18);
        bt19 = (Button) findViewById(R.id.btn19);
        bt20 = (Button) findViewById(R.id.btn20);

        //Code Clik untuk Button//
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);
        bt13.setOnClickListener(this);
        bt14.setOnClickListener(this);
        bt15.setOnClickListener(this);
        bt16.setOnClickListener(this);
        bt17.setOnClickListener(this);
        bt18.setOnClickListener(this);
        bt19.setOnClickListener(this);
        bt20.setOnClickListener(this);
    }



    /*@Override
    public void finish() {
        super.finish();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }*/

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.btn1 : i = new Intent(this, ImpetigoActivity.class);startActivity(i);
                 break;

            case R.id.btn2 : i = new Intent(this, KustaActivity.class);startActivity(i);
                 break;

            case R.id.btn3 : i = new Intent(this, EktimaActivity.class);startActivity(i);
                 break;

            case R.id.btn4 : i = new Intent(this, FolikulitisActivity.class);startActivity(i);
                break;

            case R.id.btn5 : i = new Intent(this, KrurisActivity.class);startActivity(i);
                break;

            case R.id.btn6 : i = new Intent(this, KorporisActivity.class);startActivity(i);
                break;

            case R.id.btn7 : i = new Intent(this, VersikolorActivity.class);startActivity(i);
                break;

            case R.id.btn8 : i = new Intent(this, OnikomikosisActivity.class);startActivity(i);
                break;

            case R.id.btn9 : i = new Intent(this, VariccelaActivity.class);startActivity(i);
                break;

            case R.id.btn10 : i = new Intent(this, ZosterActivity.class);startActivity(i);
                break;

            case R.id.btn11 : i = new Intent(this, HfmdActivity.class);startActivity(i);
                break;

            case R.id.btn12 : i = new Intent(this, VulgarisActivity.class);startActivity(i);
                break;

            case R.id.btn13 : i = new Intent(this, UretritisActivity.class);startActivity(i);
                break;

            case R.id.btn14 : i = new Intent(this, ServisitisActivity.class);startActivity(i);
                break;

            case R.id.btn15 : i = new Intent(this, SifilisActivity.class);startActivity(i);
                break;

            case R.id.btn16 : i = new Intent(this, NonspesifikActivity.class);startActivity(i);
                break;

            case R.id.btn17 : i = new Intent(this, MoleActivity.class);startActivity(i);
                break;

            case R.id.btn18 : i = new Intent(this, KandidiasisActivity.class);startActivity(i);
                break;

            case R.id.btn19 : i = new Intent(this, KondilomaActivity.class);startActivity(i);
                break;

            case R.id.btn20 : i = new Intent(this, SkabiesActivity.class);startActivity(i);
                break;

            default:break;
        }
    }
}
