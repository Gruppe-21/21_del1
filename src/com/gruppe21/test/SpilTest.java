package com.gruppe21.test;
import com.gruppe21.spil.Spil;

public class SpilTest {
    public static void main(String[] args) {


        Spil testspil = new Spil("Spiller1", "Spiller2");

        //Regel 4
        testspil.KørRunde(1,6,true);
        testspil.KørRunde(5,5,true);
        testspil.KørRunde(4,4,true);
        testspil.KørRunde(6,6,true);
        //Regel 3
        testspil.KørRunde(1,1,true);
        //Regel 2
        testspil.KørRunde(6,5,true);
        testspil.KørRunde(6,3,true);
        testspil.KørRunde(4,5,true);
        testspil.KørRunde(6,5,true);
        testspil.KørRunde(5,5,true);
    }
}
