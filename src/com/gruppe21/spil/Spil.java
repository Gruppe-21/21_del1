package com.gruppe21.spil;

import java.util.Scanner;

public class Spil {

    private final int antalTerninger;
    private final Terning[] terninger;
    private final String[] spillerNavne = {"", ""};
    private final int[] point = {0, 0};
    java.util.Scanner scanner;

    public Spil(){
        antalTerninger = 2;
        terninger = new Terning[] {new Terning(6), new Terning(6)};
        setSpillerNavne(scanner = new Scanner(System.in), spillerNavne);
    }
    /*
    public Spil(int[] antalSider){
        this.antalTerninger = antalSider.length;
        terninger = new Terning[antalTerninger];
        for (int i = 0; i < antalTerninger; i++) {
            terninger[i] = new Terning(antalSider[i]);
        }
        setSpillerNavne(scanner = new Scanner(System.in), spillerNavne);
    }
    */

    // Kald dette for at starte spillet.
    public void Play() {
        int spiller = 0;
        boolean toSekserer = false;
        while(true){
            System.out.println( "Tryk enter for at kaste dine terninger\n" + spillerNavne[spiller] +
                    (spillerNavne[spiller].toLowerCase().endsWith("s") ? "'" : "'s")
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
                if (point[spiller] >= 40) break;
                point[spiller] += sum;
                if (terninger[0].getVærdi() == 6){
                    if (toSekserer) break;
                    else toSekserer = true;
                    continue;
                }
                if (terninger[0].getVærdi() == 1) {
                    point[spiller] = 0;
                }
            }
            else {
                point[spiller] += sum;
                spiller = (spiller == 0 ? 1 : 0);
            }
            toSekserer = false;
        }
        System.out.println(spillerNavne[spiller] + " har vundet");
        scanner.close();
    }

    private void setSpillerNavne(Scanner scanner, String[] spillerNavne){
        while(true) {
            try {
                System.out.println("Indtast spiller 1's navn:");
                spillerNavne[0] = scanner.nextLine().strip();
                while (true) {
                    System.out.println("Indtast spiller 2's navn:");
                    spillerNavne[1] = scanner.nextLine().strip();
                    if (!spillerNavne[1].equals(spillerNavne[0])) break;
                    System.out.println("Spiller 1 og spiller 2 kan ikke have samme navn");
                }
                break;
            } catch (Exception e) {
                System.out.println("Der skete en fejl. Prøv igen");
            }
            return;
        }
    }

}
