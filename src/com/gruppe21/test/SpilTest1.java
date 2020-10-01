package com.gruppe21.test;
import com.gruppe21.spil.Spil;

public class SpilTest1 {
    public static void main(String[] args) {


        Spil testspil = new Spil("Spiller1", "Spiller2");

        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(4,4,true); //Regel 4
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(6,1,true);
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(5,1,true);
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(6,5,true);
        //Regel 3
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(1,1,true);
        //Regel 2
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(3,1,true);
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(6,6,true);
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        System.out.println(testspil.KørRunde(4,4, true));
        //testspil.KørRunde(4,4,true);
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(1,1,true); //Sker et eller andet sjovt efter den her linje

        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(1,2,true);
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(5,5,true);
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        //System.out.println(testspil.getAktuelSpillerNummer());
        testspil.KørRunde(6,5,true);
        System.out.println("Turen går til  " + testspil.getAktuelSpiller().getNavn());
        testspil.KørRunde(6,6,true);

        if (testspil.KørRunde(6,6,true))
            System.out.println("Du har vundet Spiller1");

    }
}
