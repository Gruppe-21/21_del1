package com.gruppe21.spil;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Spil {

    private final int antalTerninger;
    private final Terning[] terninger;
    private final java.util.Scanner scanner;
    private final Spiller[] spillere;
    private int aktuelSpillerNummer;

    public int getAntalTerninger() {
        return antalTerninger;
    }

    public Terning[] getTerninger() {
        return terninger;
    }

    public Spiller[] getSpillere() {
        return spillere;
    }

    public Spiller getAktuelSpiller() {
        return spillere[aktuelSpillerNummer];
    }

    public int getAktuelSpillerNummer() {
        return aktuelSpillerNummer;
    }

    public Spil(){
        scanner = new Scanner(System.in);
        antalTerninger = 2;
        terninger = new Terning[] {new Terning(6), new Terning(6)};
        spillere = new Spiller[2];
        setSpillere();
    }

    /**
     * Til testing uden konsolinput
     * @param spiller1 spillernavn
     * @param spiller2 spillernavn
     */
    public Spil(String spiller1, String spiller2 ){
        scanner = new Scanner(System.in);
        antalTerninger = 2;
        terninger = new Terning[] {new Terning(6), new Terning(6)};
        spillere = new Spiller[2];
        spillere[0] = new Spiller(spiller1);
        spillere[1] = new Spiller(spiller2);
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


    public void Play() {
        while(!KørRunde(terninger[0].kast(), terninger[1].kast(),false)){

        }
        System.out.println(spillere[aktuelSpillerNummer].getNavn() + " har vundet");
        scanner.close();
    }

    /**
     *
     * @param terningkast1
     * @param terningkast2
     * @param isTest
     * @return true hvis den nuværende spiller har vundet, ellers false
     */
    public boolean KørRunde(int terningkast1, int terningkast2, boolean isTest) {
        boolean harVundet = false;
        if(!isTest){
            System.out.println("Tryk enter for at kaste dine terninger\n" + spillere[aktuelSpillerNummer].getNavn() +
                    (spillere[aktuelSpillerNummer].isNavnSlutterMedS() ? "'" : "'s")
                    + " tur, " + spillere[aktuelSpillerNummer].getPoint() + " point");
            scanner.nextLine();
        }
        terninger[0].setVærdi(terningkast1);
        terninger[1].setVærdi(terningkast2);

        int sum;
        System.out.println("Du har slået " + terninger[0].getVærdi() + " og " + terninger[1].getVærdi() +
                ", og har derfor " +
                ((sum = terninger[0].getVærdi() + terninger[1].getVærdi()) == 2 ? 0 : sum + spillere[aktuelSpillerNummer].getPoint())
                + " point\n\n\n");

        if (terninger[0].getVærdi() == terninger[1].getVærdi()) {
            if (spillere[aktuelSpillerNummer].getPoint() >= 40 && terninger[0].getVærdi() != 1) harVundet = true;
            else {
                spillere[aktuelSpillerNummer].addPoint(sum);
                if (terninger[0].getVærdi() == 6) {
                    if (spillere[aktuelSpillerNummer].isToSekserer()) harVundet = true;
                    else spillere[aktuelSpillerNummer].setToSekserer(true);

                }
                if (!harVundet) {
                    if (terninger[0].getVærdi() == 1) spillere[aktuelSpillerNummer].setPoint(0);
                    if(terninger[0].getVærdi() != 6) spillere[aktuelSpillerNummer].setToSekserer(false);
                }
            }
        } else {
            spillere[aktuelSpillerNummer].addPoint(sum);
            spillere[aktuelSpillerNummer].setToSekserer(false);
            aktuelSpillerNummer = (aktuelSpillerNummer == 0 ? 1 : 0);
        }

        if(harVundet){
            spillere[0].setPoint(0);
            spillere[0].setToSekserer(false);

            spillere[1].setPoint(0);
            spillere[0].setToSekserer(false);

        }
        return harVundet;
    }

    private void setSpillere(){
        while(true) {
            try {
                System.out.println("Indtast spiller 1's navn:");
                spillere[0] = new Spiller(scanner.nextLine().strip());
                spillere[1] = new Spiller();
                while (true) {
                    System.out.println("Indtast spiller 2's navn:");
                    spillere[1].setNavn(scanner.nextLine().strip());
                    if (!spillere[1].getNavn().equals(spillere[0].getNavn())) break;
                    System.out.println("Spiller 1 og spiller 2 kan ikke have samme navn");
                }
                break;
            } catch (Exception e) {
                System.out.println("Der skete en fejl. Prøv igen");
            }
        }
    }

}
