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
import android.widget.CheckBox;
import android.widget.RadioButton;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DiagnosisActivity extends AppCompatActivity {
    private RadioButton rB01,rB02,rB03,rB04,rB05,rB06,rB07,rB08,rB09,rB10
            ,rB11,rB12,rB13,rB14,rB15,rB16,rB17,rB18,rB19,rB20
            ,rB21,rB22,rB23,rB24,rB25,rB26,rB27,rB28,rB29,rB30
            ,rB31,rB32,rB33,rB34,rB35,rB36,rB37,rB38,rB39,rB40
            ,rB41,rB42,rB43,rB44,rB45,rB46,rB47,rB48,rB49,rB50
            ,rB51,rB52,rB53,rB54,rB55,rB56,rB57,rB58,rB59,rB60
            ,rB61,rB62,rB63,rB64,rB65,rB66,rB67,rB68,rB69,rB70
            ,rB71,rB72,rB73,rB74,rB75,rB76,rB77,rB78,rB79,rB80
            ,rB81,rB82,rB83,rB84,rB85,rB86,rB87,rB88,rB89,rB90
            ,rB91,rB92,rB93,rB94,rB95,rB96,rB97,rB98,rB99,rB100
            ,rB101,rB102,rB103,rB104,rB105,rB106;
    private Button diagnosis;

    String Penyakit = "";

    public boolean cekGejala[] = new boolean[53];
    public double bobotGejala[] = new double[53];
    public String namaPenyakit[] = new String[18];
    public ListPenyakit vektorGP[] = new ListPenyakit[53];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pilih Gejala");

        //Daftar Nama Penyakit
        namaPenyakit[0]="Impetigo Vesikobulosa";
        namaPenyakit[1]="Kusta";
        namaPenyakit[2]="Ektima";
        namaPenyakit[3]="Folikulitis";
        namaPenyakit[4]="Tinea Kruris";
        namaPenyakit[5]="Tinea Korporis";
        namaPenyakit[6]="Pitiriasis Versikolor";
        namaPenyakit[7]="Onikomikosis";
        namaPenyakit[8]="Varisela";
        namaPenyakit[9]="Herpes Zoster";
        namaPenyakit[10]="Head-Foot-Mouth Disease";
        namaPenyakit[11]="Veruka Vulgaris";
        namaPenyakit[12]="Skabies";
        namaPenyakit[13]="Uretritis Gonere";
        namaPenyakit[14]="Sifilis";
        namaPenyakit[15]="Uretritis Non Spesifik";
        namaPenyakit[16]="Ulkus Mole";
        namaPenyakit[17]="Kondiloma Akuminata";

        ListPenyakit lp = new ListPenyakit();
        lp.indeksPenyakit.add(0);
        lp.indeksPenyakit.add(9);
        vektorGP[0] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(0);
        lp.indeksPenyakit.add(5);
        lp.indeksPenyakit.add(6);
        lp.indeksPenyakit.add(11);
        lp.indeksPenyakit.add(12);
        vektorGP[1] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(0);
        vektorGP[2] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(1);
        vektorGP[3] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(1);
        vektorGP[4] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(1);
        vektorGP[5] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(1);
        vektorGP[6] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(1);
        vektorGP[7] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(1);
        vektorGP[8] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(2);
        vektorGP[9] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(2);
        vektorGP[10] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(3);
        vektorGP[11] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(3);
        lp.indeksPenyakit.add(12);
        vektorGP[12] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(3);
        lp.indeksPenyakit.add(4);
        vektorGP[13] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(4);
        lp.indeksPenyakit.add(5);
        lp.indeksPenyakit.add(6);
        vektorGP[14] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(4);
        vektorGP[15] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(5);
        vektorGP[16] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(5);
        vektorGP[17] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(6);
        vektorGP[18] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(17);
        vektorGP[19] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(7);
        vektorGP[20] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(7);
        vektorGP[21] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(7);
        vektorGP[22] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(8);
        lp.indeksPenyakit.add(9);
        lp.indeksPenyakit.add(10);
        lp.indeksPenyakit.add(13);
        vektorGP[23] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(8);
        lp.indeksPenyakit.add(9);
        vektorGP[24] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(8);
        vektorGP[25] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(8);
        lp.indeksPenyakit.add(10);
        vektorGP[26] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(8);
        lp.indeksPenyakit.add(9);
        lp.indeksPenyakit.add(10);
        vektorGP[27] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(8);
        lp.indeksPenyakit.add(9);
        vektorGP[28] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(9);
        vektorGP[29] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(9);
        vektorGP[30] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(10);
        vektorGP[31] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(10);
        vektorGP[32] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(10);
        vektorGP[33] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(10);
        vektorGP[34] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(11);
        vektorGP[35] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(11);
        vektorGP[36] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(12);
        vektorGP[37] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(13);
        lp.indeksPenyakit.add(16);
        vektorGP[38] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(13);
        vektorGP[39] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(13);
        vektorGP[40] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(13);
        vektorGP[41] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(13);
        vektorGP[42] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(17);
        vektorGP[43] = lp;

        /*lp = new ListPenyakit();
        lp.indeksPenyakit.add(14);
        vektorGP[44] = lp;*/

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(17);
        vektorGP[44] = lp;

        /*lp = new ListPenyakit();
        lp.indeksPenyakit.add(14);
        vektorGP[46] = lp;*/

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(15);
        vektorGP[45] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(16);
        vektorGP[46] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(16);
        vektorGP[47] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(17);
        vektorGP[48] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(17);
        vektorGP[49] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(17);
        vektorGP[50] = lp;

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(17);
        vektorGP[51] = lp;

        /*lp = new ListPenyakit();
        lp.indeksPenyakit.add(18);
        vektorGP[54] = lp;*/

        /*lp = new ListPenyakit();
        lp.indeksPenyakit.add(18);
        vektorGP[55] = lp;*/

        /*lp = new ListPenyakit();
        lp.indeksPenyakit.add(18);
        vektorGP[56] = lp;*/

        lp = new ListPenyakit();
        lp.indeksPenyakit.add(17);
        vektorGP[52] = lp;

        //BOBOT
        bobotGejala[0] = 0.4;
        bobotGejala[1] = 0.3;
        bobotGejala[2] = 0.7;
        bobotGejala[3] = 0.7;
        bobotGejala[4] = 0.6;
        bobotGejala[5] = 0.3;
        bobotGejala[6] = 0.3;
        bobotGejala[7] = 0.4;
        bobotGejala[8] = 0.5;
        bobotGejala[9] = 0.7;
        bobotGejala[10] = 0.8;
        bobotGejala[11] = 0.7;
        bobotGejala[12] = 0.6;
        bobotGejala[13] = 0.5;
        bobotGejala[14] = 0.5;
        bobotGejala[15] = 0.7;
        bobotGejala[16] = 0.7;
        bobotGejala[17] = 0.6;
        bobotGejala[18] = 0.7;
        bobotGejala[19] = 0.7;
        bobotGejala[20] = 0.7;
        bobotGejala[21] = 0.8;
        bobotGejala[22] = 0.6;
        bobotGejala[23] = 0.5;
        bobotGejala[24] = 0.5;
        bobotGejala[25] = 0.4;
        bobotGejala[26] = 0.4;
        bobotGejala[27] = 0.4;
        bobotGejala[28] = 0.6;
        bobotGejala[29] = 0.5;
        bobotGejala[30] = 0.6;
        bobotGejala[31] = 0.7;
        bobotGejala[32] = 0.4;
        bobotGejala[33] = 0.4;
        bobotGejala[34] = 0.6;
        bobotGejala[35] = 0.8;
        bobotGejala[36] = 0.7;
        bobotGejala[37] = 0.4;
        bobotGejala[38] = 0.5;
        bobotGejala[39] = 0.7;
        bobotGejala[40] = 0.6;
        bobotGejala[41] = 0.8;
        bobotGejala[42] = 0.7;
        bobotGejala[43] = 0.3;
        /*bobotGejala[44] = 0.6;*/
        bobotGejala[44] = 0.4;
        /*bobotGejala[46] = 0.4;*/
        bobotGejala[45] = 0.7;
        bobotGejala[46] = 0.2;
        bobotGejala[47] = 0.4;
        bobotGejala[48] = 0.4;
        bobotGejala[49] = 0.5;
        bobotGejala[50] = 0.4;
        bobotGejala[51] = 0.3;
        /*bobotGejala[54] = 0.4;*/
        /*bobotGejala[55] = 0.6;*/
        /*bobotGejala[56] = 0.4;*/
        bobotGejala[52] = 0.4;

    /*
        //Bobot
        vektorGP[0][0]=0.4;
        vektorGP[1][0]=0.4;
        vektorGP[2][0]=0.8;

        vektorGP[3][1]=0.6;
        vektorGP[4][1]=0.6;
        vektorGP[5][1]=0.2;
        vektorGP[6][1]=0.2;
        vektorGP[7][1]=0.4;
        vektorGP[8][1]=0.4;

        vektorGP[9][2]=0.8;
        vektorGP[10][2]=0.8;

        vektorGP[11][3]=0.6;
        vektorGP[12][3]=0.8;
        vektorGP[13][3]=0.6;

        vektorGP[14][4]=0.8;
        vektorGP[15][4]=0.6;
        vektorGP[16][4]=0.6;

        vektorGP[17][5]=0.8;
        vektorGP[18][5]=0.6;

        vektorGP[19][6]=0.8;

        vektorGP[20][7]=0.8;
        vektorGP[21][7]=0.8;
        vektorGP[22][7]=0.6;

        vektorGP[23][8]=0.6;
        vektorGP[24][8]=0.6;
        vektorGP[25][8]=0.4;
        vektorGP[26][8]=0.4;
        vektorGP[27][8]=0.4;
        vektorGP[28][8]=0.6;

        vektorGP[29][9]=0.6;
        vektorGP[30][9]=0.6;

        vektorGP[31][10]=0.8;
        vektorGP[32][10]=0.4;
        vektorGP[33][10]=0.4;
        vektorGP[34][10]=0.6;

        vektorGP[35][11]=0.8;
        vektorGP[36][11]=0.8;

        vektorGP[37][12]=0.4;

        vektorGP[38][13]=0.6;
        vektorGP[39][13]=0.6;
        vektorGP[40][13]=0.6;
        vektorGP[41][13]=0.8;
        vektorGP[42][13]=0.6;

        vektorGP[43][14]=0.8;
        vektorGP[44][14]=0.6;
        vektorGP[45][14]=0.4;
        vektorGP[46][14]=0.4;

        vektorGP[47][15]=0.8;

        vektorGP[48][16]=0.2;
        vektorGP[49][16]=0.4;

        vektorGP[50][17]=0.4;
        vektorGP[51][17]=0.6;
        vektorGP[52][17]=0.4;
        vektorGP[53][17]=0.4;

        vektorGP[54][18]=0.4;
        vektorGP[55][18]=0.6;
        vektorGP[56][18]=0.4;

        vektorGP[57][19]=0.4;
*/

        rB01 = (RadioButton)findViewById(R.id.rb01);
        rB02 = (RadioButton)findViewById(R.id.rb02);
        rB03 = (RadioButton)findViewById(R.id.rb03);
        rB04 = (RadioButton)findViewById(R.id.rb04);
        rB05 = (RadioButton)findViewById(R.id.rb05);
        rB06 = (RadioButton)findViewById(R.id.rb06);
        rB07 = (RadioButton)findViewById(R.id.rb07);
        rB08 = (RadioButton)findViewById(R.id.rb08);
        rB09 = (RadioButton)findViewById(R.id.rb09);
        rB10 = (RadioButton)findViewById(R.id.rb10);
        rB11 = (RadioButton)findViewById(R.id.rb11);
        rB12 = (RadioButton)findViewById(R.id.rb12);
        rB13 = (RadioButton)findViewById(R.id.rb13);
        rB14 = (RadioButton)findViewById(R.id.rb14);
        rB15 = (RadioButton)findViewById(R.id.rb15);
        rB16 = (RadioButton)findViewById(R.id.rb16);
        rB17 = (RadioButton)findViewById(R.id.rb17);
        rB18 = (RadioButton)findViewById(R.id.rb18);
        rB19 = (RadioButton)findViewById(R.id.rb19);
        rB20 = (RadioButton)findViewById(R.id.rb20);
        rB21 = (RadioButton)findViewById(R.id.rb21);
        rB22 = (RadioButton)findViewById(R.id.rb22);
        rB23 = (RadioButton)findViewById(R.id.rb23);
        rB24 = (RadioButton)findViewById(R.id.rb24);
        rB25 = (RadioButton)findViewById(R.id.rb25);
        rB26 = (RadioButton)findViewById(R.id.rb26);
        rB27 = (RadioButton)findViewById(R.id.rb27);
        rB28 = (RadioButton)findViewById(R.id.rb28);
        rB29 = (RadioButton)findViewById(R.id.rb29);
        rB30 = (RadioButton)findViewById(R.id.rb30);
        rB31 = (RadioButton)findViewById(R.id.rb31);
        rB32 = (RadioButton)findViewById(R.id.rb32);
        rB33 = (RadioButton)findViewById(R.id.rb33);
        rB34 = (RadioButton)findViewById(R.id.rb34);
        rB35 = (RadioButton)findViewById(R.id.rb35);
        rB36 = (RadioButton)findViewById(R.id.rb36);
        rB37 = (RadioButton)findViewById(R.id.rb37);
        rB38 = (RadioButton)findViewById(R.id.rb38);
        rB39 = (RadioButton)findViewById(R.id.rb39);
        rB40 = (RadioButton)findViewById(R.id.rb40);
        rB41 = (RadioButton)findViewById(R.id.rb41);
        rB42 = (RadioButton)findViewById(R.id.rb42);
        rB43 = (RadioButton)findViewById(R.id.rb43);
        rB44 = (RadioButton)findViewById(R.id.rb44);
        rB45 = (RadioButton)findViewById(R.id.rb45);
        rB46 = (RadioButton)findViewById(R.id.rb46);
        rB47 = (RadioButton)findViewById(R.id.rb47);
        rB48 = (RadioButton)findViewById(R.id.rb48);
        rB49 = (RadioButton)findViewById(R.id.rb49);
        rB50 = (RadioButton)findViewById(R.id.rb50);
        rB51 = (RadioButton)findViewById(R.id.rb51);
        rB52 = (RadioButton)findViewById(R.id.rb52);
        rB53 = (RadioButton)findViewById(R.id.rb53);
        rB54 = (RadioButton)findViewById(R.id.rb54);
        rB55 = (RadioButton)findViewById(R.id.rb55);
        rB56 = (RadioButton)findViewById(R.id.rb56);
        rB57 = (RadioButton)findViewById(R.id.rb57);
        rB58 = (RadioButton)findViewById(R.id.rb58);
        rB59 = (RadioButton)findViewById(R.id.rb59);
        rB60 = (RadioButton)findViewById(R.id.rb60);
        rB61 = (RadioButton)findViewById(R.id.rb61);
        rB62 = (RadioButton)findViewById(R.id.rb62);
        rB63 = (RadioButton)findViewById(R.id.rb63);
        rB64 = (RadioButton)findViewById(R.id.rb64);
        rB65 = (RadioButton)findViewById(R.id.rb65);
        rB66 = (RadioButton)findViewById(R.id.rb66);
        rB67 = (RadioButton)findViewById(R.id.rb67);
        rB68 = (RadioButton)findViewById(R.id.rb68);
        rB69 = (RadioButton)findViewById(R.id.rb69);
        rB70 = (RadioButton)findViewById(R.id.rb70);
        rB71 = (RadioButton)findViewById(R.id.rb71);
        rB72 = (RadioButton)findViewById(R.id.rb72);
        rB73 = (RadioButton)findViewById(R.id.rb73);
        rB74 = (RadioButton)findViewById(R.id.rb74);
        rB75 = (RadioButton)findViewById(R.id.rb75);
        rB76 = (RadioButton)findViewById(R.id.rb76);
        rB77 = (RadioButton)findViewById(R.id.rb77);
        rB78 = (RadioButton)findViewById(R.id.rb78);
        rB79 = (RadioButton)findViewById(R.id.rb79);
        rB80 = (RadioButton)findViewById(R.id.rb80);
        rB81 = (RadioButton)findViewById(R.id.rb81);
        rB82 = (RadioButton)findViewById(R.id.rb82);
        rB83 = (RadioButton)findViewById(R.id.rb83);
        rB84 = (RadioButton)findViewById(R.id.rb84);
        rB85 = (RadioButton)findViewById(R.id.rb85);
        rB86 = (RadioButton)findViewById(R.id.rb86);
        rB87 = (RadioButton)findViewById(R.id.rb87);
        rB88 = (RadioButton)findViewById(R.id.rb88);
        rB89 = (RadioButton)findViewById(R.id.rb89);
        rB90 = (RadioButton)findViewById(R.id.rb90);
        rB91 = (RadioButton)findViewById(R.id.rb91);
        rB92 = (RadioButton)findViewById(R.id.rb92);
        rB93 = (RadioButton)findViewById(R.id.rb93);
        rB94 = (RadioButton)findViewById(R.id.rb94);
        rB95 = (RadioButton)findViewById(R.id.rb95);
        rB96 = (RadioButton)findViewById(R.id.rb96);
        rB97 = (RadioButton)findViewById(R.id.rb97);
        rB98 = (RadioButton)findViewById(R.id.rb98);
        rB99 = (RadioButton)findViewById(R.id.rb99);
        rB100 = (RadioButton)findViewById(R.id.rb100);
        rB101 = (RadioButton)findViewById(R.id.rb101);
        rB102 = (RadioButton)findViewById(R.id.rb102);
        rB103 = (RadioButton)findViewById(R.id.rb103);
        rB104 = (RadioButton)findViewById(R.id.rb104);
        rB105 = (RadioButton)findViewById(R.id.rb105);
        rB106 = (RadioButton)findViewById(R.id.rb106);

        diagnosis = (Button) findViewById(R.id.diagnosis);

        diagnosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Gejala = "";*/


                if (rB01.isChecked()) {
                    cekGejala[0] = true;
                }if(rB02.isChecked()) {
                    cekGejala[0] = false;
                }

                if (rB03.isChecked()) {
                    cekGejala[1] = true;
                }if (rB04.isChecked()){
                    cekGejala[1] = false;
                }

                if (rB05.isChecked()) {
                    cekGejala[2] = true;
                }if(rB06.isChecked()) {
                    cekGejala[2] = false;
                }

                if (rB07.isChecked()) {
                    cekGejala[3] = true;
                }if (rB08.isChecked()){
                    cekGejala[3] = false;
                }

                if (rB09.isChecked()) {
                    cekGejala[4] = true;
                }if(rB10.isChecked()) {
                    cekGejala[4] = false;
                }

                if (rB11.isChecked()) {
                    cekGejala[5] = true;
                }if (rB12.isChecked()){
                    cekGejala[5] = false;
                }

                if (rB13.isChecked()) {
                    cekGejala[6] = true;
                }if(rB14.isChecked()) {
                    cekGejala[6] = false;
                }

                if (rB15.isChecked()) {
                    cekGejala[7] = true;
                }if (rB16.isChecked()){
                    cekGejala[7] = false;
                }

                if (rB17.isChecked()) {
                    cekGejala[8] = true;
                }if(rB18.isChecked()) {
                    cekGejala[8] = false;
                }

                if (rB19.isChecked()) {
                    cekGejala[9] = true;
                }if (rB20.isChecked()){
                    cekGejala[9] = false;
                }

                if (rB21.isChecked()) {
                    cekGejala[10] = true;
                }if(rB22.isChecked()) {
                    cekGejala[10] = false;
                }

                if (rB23.isChecked()) {
                    cekGejala[11] = true;
                }if (rB24.isChecked()){
                    cekGejala[11] = false;
                }

                if (rB25.isChecked()) {
                    cekGejala[12] = true;
                }if(rB26.isChecked()) {
                    cekGejala[12] = false;
                }

                if (rB27.isChecked()) {
                    cekGejala[13] = true;
                }if (rB28.isChecked()){
                    cekGejala[13] = false;
                }

                if (rB29.isChecked()) {
                    cekGejala[14] = true;
                }if (rB30.isChecked()){
                    cekGejala[14] = false;
                }

                if (rB31.isChecked()) {
                    cekGejala[15] = true;
                }if(rB32.isChecked()) {
                    cekGejala[15] = false;
                }

                if (rB33.isChecked()) {
                    cekGejala[16] = true;
                }if (rB34.isChecked()){
                    cekGejala[16] = false;
                }

                if (rB35.isChecked()) {
                    cekGejala[17] = true;
                }if(rB36.isChecked()) {
                    cekGejala[17] = false;
                }

                if (rB37.isChecked()) {
                    cekGejala[18] = true;
                }if (rB38.isChecked()){
                    cekGejala[18] = false;
                }

                if (rB39.isChecked()) {
                    cekGejala[19] = true;
                }if(rB40.isChecked()) {
                    cekGejala[19] = false;
                }

                if (rB41.isChecked()) {
                    cekGejala[20] = true;
                }if (rB42.isChecked()){
                    cekGejala[20] = false;
                }

                if (rB43.isChecked()) {
                    cekGejala[21] = true;
                }if(rB44.isChecked()) {
                    cekGejala[21] = false;
                }

                if (rB45.isChecked()) {
                    cekGejala[22] = true;
                }if (rB46.isChecked()){
                    cekGejala[22] = false;
                }
                if (rB47.isChecked()) {
                    cekGejala[23] = true;
                }if(rB48.isChecked()) {
                    cekGejala[23] = false;
                }

                if (rB49.isChecked()) {
                    cekGejala[24] = true;
                }if (rB50.isChecked()){
                    cekGejala[24] = false;
                }

                if (rB51.isChecked()) {
                    cekGejala[25] = true;
                }if(rB52.isChecked()) {
                    cekGejala[25] = false;
                }

                if (rB53.isChecked()) {
                    cekGejala[26] = true;
                }if (rB54.isChecked()){
                    cekGejala[26] = false;
                }

                if (rB55.isChecked()) {
                    cekGejala[27] = true;
                }if(rB56.isChecked()) {
                    cekGejala[27] = false;
                }

                if (rB57.isChecked()) {
                    cekGejala[28] = true;
                }if (rB58.isChecked()){
                    cekGejala[28] = false;
                }

                if (rB59.isChecked()) {
                    cekGejala[29] = true;
                }if(rB60.isChecked()) {
                    cekGejala[29] = false;
                }

                if (rB61.isChecked()) {
                    cekGejala[30] = true;
                }if (rB62.isChecked()){
                    cekGejala[30] = false;
                }

                if (rB63.isChecked()) {
                    cekGejala[31] = true;
                }if(rB64.isChecked()) {
                    cekGejala[31] = false;
                }

                if (rB65.isChecked()) {
                    cekGejala[32] = true;
                }if (rB66.isChecked()){
                    cekGejala[32] = false;
                }

                if (rB67.isChecked()) {
                    cekGejala[33] = true;
                }if(rB68.isChecked()) {
                    cekGejala[33] = false;
                }

                if (rB69.isChecked()) {
                    cekGejala[34] = true;
                }if (rB70.isChecked()){
                    cekGejala[34] = false;
                }

                if (rB71.isChecked()) {
                    cekGejala[35] = true;
                }if(rB72.isChecked()) {
                    cekGejala[35] = false;
                }

                if (rB73.isChecked()) {
                    cekGejala[36] = true;
                }if (rB74.isChecked()){
                    cekGejala[36] = false;
                }

                if (rB75.isChecked()) {
                    cekGejala[37] = true;
                }if(rB76.isChecked()) {
                    cekGejala[37] = false;
                }

                if (rB77.isChecked()) {
                    cekGejala[38] = true;
                }if (rB78.isChecked()){
                    cekGejala[38] = false;
                }

                if (rB79.isChecked()) {
                    cekGejala[39] = true;
                }if(rB80.isChecked()) {
                    cekGejala[39] = false;
                }

                if (rB81.isChecked()) {
                    cekGejala[40] = true;
                }if (rB82.isChecked()){
                    cekGejala[40] = false;
                }

                if (rB83.isChecked()) {
                    cekGejala[41] = true;
                }if(rB84.isChecked()) {
                    cekGejala[41] = false;
                }

                if (rB85.isChecked()) {
                    cekGejala[42] = true;
                }if (rB86.isChecked()){
                    cekGejala[42] = false;
                }

                if (rB87.isChecked()) {
                    cekGejala[43] = true;
                }if(rB88.isChecked()) {
                    cekGejala[43] = false;
                }

                if (rB89.isChecked()) {
                    cekGejala[44] = true;
                }if (rB90.isChecked()){
                    cekGejala[44] = false;
                }

                if (rB91.isChecked()) {
                    cekGejala[45] = true;
                }if(rB92.isChecked()) {
                    cekGejala[45] = false;
                }

                if (rB93.isChecked()) {
                    cekGejala[46] = true;
                }if (rB94.isChecked()){
                    cekGejala[46] = false;
                }

                if (rB95.isChecked()) {
                    cekGejala[47] = true;
                }if(rB96.isChecked()) {
                    cekGejala[47] = false;
                }

                if (rB97.isChecked()) {
                    cekGejala[48] = true;
                }if (rB98.isChecked()){
                    cekGejala[48] = false;
                }

                if (rB99.isChecked()) {
                    cekGejala[49] = true;
                }if(rB100.isChecked()) {
                    cekGejala[49] = false;
                }

                if (rB101.isChecked()) {
                    cekGejala[50] = true;
                }if (rB102.isChecked()){
                    cekGejala[50] = false;
                }

                if (rB103.isChecked()) {
                    cekGejala[51] = true;
                }if(rB104.isChecked()) {
                    cekGejala[51] = false;
                }

                if (rB105.isChecked()) {
                    cekGejala[52] = true;
                }if(rB106.isChecked()) {
                    cekGejala[52] = false;
                }


                int jumGejalaDipilih = 0;
                ArrayList<M> mNew = new ArrayList<>();
                ArrayList<M> mOld = new ArrayList<>();
                M mTemp;
                double pembagi;

                for (int i = 0; i < cekGejala.length; i++) {
                    pembagi = 1;

                    if (cekGejala[i] == true) {
                        jumGejalaDipilih++;

                        if (jumGejalaDipilih == 1) {
                            mTemp = new M();
                            mTemp.belief = bobotGejala[i];
                            mTemp.indeksPenyakit = vektorGP[i].indeksPenyakit;
                            mTemp.theta = false;

                            mNew.add(mTemp);

                            mTemp = new M();
                            mTemp.belief = 1 - bobotGejala[i];
                            mTemp.theta = true;

                            mNew.add(mTemp);

                        } else {

                            mOld.clear();

                            for (int j = 0; j < mNew.size(); j++) {
                                mOld.add(mNew.get(j));
                            }

                            mNew.clear();
                            for (int j = 0; j < mOld.size(); j++) {

                                if (mOld.get(j).theta == false) {
                                    mTemp = new M();
                                    mTemp.belief = mOld.get(j).belief * bobotGejala[i];
                                    mTemp.indeksPenyakit = ListPenyakit.irisanPenyakit(mOld.get(j).indeksPenyakit, vektorGP[i].indeksPenyakit);

                                    if (mTemp.indeksPenyakit.isEmpty()) {
                                        pembagi = pembagi - mTemp.belief;

                                    } else {
                                        mTemp.theta = false;

                                        mNew.add(mTemp);
                                    }


                                    mTemp = new M();
                                    mTemp.belief = mOld.get(j).belief * (1 - bobotGejala[i]);
                                    mTemp.indeksPenyakit = mOld.get(j).indeksPenyakit;
                                    mTemp.theta = false;

                                    mNew.add(mTemp);
                                } else {
                                    mTemp = new M();
                                    mTemp.belief = mOld.get(j).belief * bobotGejala[i];
                                    mTemp.indeksPenyakit = vektorGP[i].indeksPenyakit;
                                    mTemp.theta = false;
                                    mNew.add(mTemp);

                                    mTemp = new M();
                                    mTemp.belief = mOld.get(j).belief * (1 - bobotGejala[i]);
                                    mTemp.theta = true;

                                    mNew.add(mTemp);
                                }

                            }


                            boolean sudahDiCek[] = new boolean[mNew.size()];

                            for (int j = 1; j < mNew.size(); j++) {
                                sudahDiCek[j] = false;
                            }

                            mOld.clear();
                            for (int j = 0; j < mNew.size(); j++) {
                                mOld.add(mNew.get(j));
                            }
                            mNew.clear();
                            mNew = new ArrayList<>();

                            int idkMNew = 0;
                            for (int j = 0; j < mOld.size(); j++) {
                                if (j == (mOld.size() - 1)) {
                                    mNew.add(mOld.get(j));
                                    continue;
                                }
                                if (sudahDiCek[j] == false) {
                                    mNew.add(mOld.get(j));
                                    sudahDiCek[j] = true;
                                    for (int k = (j + 1); k < mOld.size(); k++) {
                                        if (ListPenyakit.apakahPenyakitSama(mOld.get(j).indeksPenyakit, mOld.get(k).indeksPenyakit) == true) {
                                            mNew.get(j).belief = mNew.get(j).belief + mOld.get(k).belief;
                                            sudahDiCek[k] = true;
                                        }
                                    }
                                    mNew.get(idkMNew).belief = mNew.get(idkMNew).belief / pembagi;
                                    idkMNew++;
                                }

                            }

                        }
                    }
                }
                //Mem-print hasil
                ArrayList<Integer> penyakitTerDetect;
                /*Hasil hasil;*/
                DecimalFormat x = new DecimalFormat("#.##");

                for (int i = 0; i < mNew.size(); i++) {
                    if (mNew.get(i).theta == false) {
                        penyakitTerDetect = mNew.get(i).indeksPenyakit;

                        for (int j = 0; j < penyakitTerDetect.size(); j++) {
                            Penyakit += namaPenyakit[penyakitTerDetect.get(j)]+", ";

                        }

                        Penyakit += (x.format((mNew.get(i).belief) * 100)) + "%\n\n";

                        
                    }
                }

                Intent u = new Intent(DiagnosisActivity.this, HasilActivity.class);
                Bundle b = new Bundle();
                b.putString("Penyakit", Penyakit);
                /*b.putString("Persen", Persen);*/
                u.putExtras(b);
                startActivity(u);
                finish();

            }
        });

    }

    /*@Override
    public void finish() {
        super.finish();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }*/
}