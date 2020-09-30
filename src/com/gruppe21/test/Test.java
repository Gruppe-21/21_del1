package com.gruppe21.test;


import com.gruppe21.spil.Terning;

// Brug denne klasse til at køre tests
public class Test {
    private static int iterationer = 1000000 ;

    public static void main(String[] args) {
        FairTerning.FairTerning(iterationer);
        TestEnsTerninger.TestEnsTerninger(iterationer);
    }

}
