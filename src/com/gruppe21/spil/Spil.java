package com.gruppe21.spil;

import java.util.Scanner;

public class Spil {

    private int antalTerninger;
    private Terning[] terninger;
    private String[] spillerNavne = {"", ""};
    private int[] point = {0, 0};

    public Spil(){
        antalTerninger = 2;
        terninger = new Terning[] {new Terning(6), new Terning(6)};
    }
    /*
    public Spil(int[] antalSider){
        this.antalTerninger = antalSider.length;
        terninger = new Terning[antalTerninger];
        for (int i = 0; i < antalTerninger; i++) {
            terninger[i] = new Terning(antalSider[i]);
        }
    }
    */

    // Kald dette for at starte spillet.
    public void Play() {
        java.util.Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Indtast spiller 1's navn:");
                spillerNavne[0] = scanner.nextLine();
                System.out.println("Indtast spiller 2's navn:");
                spillerNavne[1] = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.flush();
                System.out.println("Der skete en fejl. Prøv igen");
            }
        }

        int spiller = 0;
        boolean toSekserer = false;
        while(true){
            System.out.println( "Tryk enter for at kaste dine terninger\n" + spillerNavne[spiller] +
                    (spillerNavne[spiller].toLowerCase().charAt(spillerNavne[spiller].length() - 1) == 's' ? "'" : "'s")
                    + " tur, " + point[spiller] + " point");
            scanner.nextLine();
            terninger[0].kast();
            terninger[1].kast();
            int sum;
            System.out.println("Du har slået " + terninger[0].getVærdi() + " og " + terninger[1].getVærdi()  +
                    ", og har derfor " +
                    ( (sum = terninger[0].getVærdi() + terninger[1].getVærdi()) == 2 ? 0 : sum + point[spiller])
                    + " point\n\n\n");

            if (terninger[0].getVærdi() == terninger[1].getVærdi()){
                if (point[spiller] >= 40 && terninger[0].getVærdi() != 1) break;
                else if (terninger[0].getVærdi() == 6){
                    if (toSekserer) break;
                    else toSekserer = true;
                }
                point[spiller] += sum;
                if (terninger[0].getVærdi() == 1) {
                    point[spiller] = 0;
                    spiller = spiller == 0 ? 1 : 0;
                    toSekserer = false;
                }
            }
            else {
                point[spiller] += sum;
                spiller = spiller == 0 ? 1 : 0;
                toSekserer = false;
            }
        }
        System.out.println(spillerNavne[spiller] +
                (spillerNavne[spiller].toLowerCase().charAt(spillerNavne[spiller].length() - 1) == 's' ? "'" : "'s")
                + " har vundet");
        scanner.close();
    }
}
