package com.gruppe21.test;


import com.gruppe21.spil.*;

// Brug denne klasse til at køre tests
public class Test {
    private static int iterationer = 1000000 ;

    public static void main(String[] args) {

        Spil testspil = new Spil("Spiller1", "Spiller2");

        System.out.println("Turen går til Spiller "+testspil.getAktuelSpillerNummer());


        testspil.KørRunde(3,1,true);

        System.out.println("Turen går til Spiller "+testspil.getAktuelSpillerNummer());

        testspil.KørRunde(6,6,true);

        System.out.println("Turen går til Spiller "+testspil.getAktuelSpillerNummer());

        testspil.KørRunde(4,4,true);

        System.out.println("Turen går til Spiller "+testspil.getAktuelSpillerNummer());

        testspil.KørRunde(1,1,true);

        System.out.println("Turen går til Spiller "+testspil.getAktuelSpillerNummer());
        testspil.KørRunde(1,2,true);
        System.out.println("Turen går til Spiller "+testspil.getAktuelSpillerNummer());

        testspil.KørRunde(5,5,true);
    }

}
