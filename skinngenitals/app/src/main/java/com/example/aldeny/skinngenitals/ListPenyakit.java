/*
 * Copyright (c) Aldeny 2019
 */

package com.example.aldeny.skinngenitals;

import java.util.ArrayList;

public class ListPenyakit {
    public ArrayList<Integer> indeksPenyakit = new ArrayList<>();

    public static ArrayList<Integer> irisanPenyakit(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> hasil = new ArrayList<>();

        for (int i = 0; i < A.size(); i++){
            for (int j = 0; j < B.size(); j++){

                if (A.get(i) == B.get(j)){
                    hasil.add(A.get(i));
                }

            }
        }

        return hasil;
    }

    public static boolean apakahPenyakitSama(ArrayList<Integer> A, ArrayList<Integer> B){
        boolean hasil = true;

        if (A.size() == B.size()){
            for (int i = 0; i < A.size(); i++){
                boolean ketemu = false;
                for (int j = 0; j < B.size(); j++){

                    if (A.get(i) == B.get(j)){
                        ketemu = true;
                        break;
                    }

                }
                hasil = ketemu;

                if (hasil == false){
                    break;
                }
            }
        }
        else{
            hasil = false;
        }


        return hasil;
    }
}
