package com.gruppe21.test;

import com.gruppe21.spil.Spil;

public class SpilTest2 {
    public static void main(String[] args) {

        Spil testspil2 = new Spil("Player1", "Player2");

        System.out.println("Turen går til  " + testspil2.getAktuelSpiller().getNavn());
        testspil2.KørRunde(5,6,true);

        System.out.println("Turen går til  " + testspil2.getAktuelSpiller().getNavn());
        testspil2.KørRunde(6,6,true);

        System.out.println("Turen går til  " + testspil2.getAktuelSpiller().getNavn());
        testspil2.KørRunde(6,5,true);

        System.out.println("Turen går til  " + testspil2.getAktuelSpiller().getNavn());
        testspil2.KørRunde(1,3,true);

        System.out.println("Turen går til  " + testspil2.getAktuelSpiller().getNavn());
        testspil2.KørRunde(6,6,true);

        System.out.println("Turen går til  " + testspil2.getAktuelSpiller().getNavn());
        testspil2.KørRunde(3,3,true);

        if (testspil2.KørRunde(4,4,true)){
            System.out.println("Du har vundet Spiller2");


        }
    }
}
