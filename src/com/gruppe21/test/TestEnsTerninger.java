package com.gruppe21.test;

import com.gruppe21.spil.Terning;

public class TestEnsTerninger {
    public static void TestEnsTerninger(int iterationer) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        int resultat[][] = new int[terning1.getAntalSider()][terning2.getAntalSider()];

        // Kør selve testen. Altså kast terning og gem resultat;
        for (int i = 0; i < iterationer; i++) {
            resultat[terning2.kast() -1][terning1.kast()-1]++;
        }
        String output = " ";
        for (int i = 0; i < resultat.length; i++) {
            output += " " + (i + 1);
        }
        output += "\n";
        // Udskriv resultatet
        for (int i = 0; i < resultat.length; i++) {
            output += (i+ 1);
            for (int j = 0; j < resultat[i].length; j++) {
                output += " " + 36 * ((float)resultat[i][j]/iterationer);
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
