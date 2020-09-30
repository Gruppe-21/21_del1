package com.gruppe21.test;


import com.gruppe21.spil.Terning;


// Brug denne klasse til at køre tests
public class FairTerning {
    private static int iterationer = 1000000 ;

    public static void main(String[] args) {


        FairTerning();
    }

    public static void FairTerning() {
        Terning die1 = new Terning();

        int i = 1;
        double et = 0;
        double to = 0;
        double tre = 0;
        double fire = 0;
        double fem = 0;
        double seks = 0;
        while (i <= 1000000) { //Kaster 100 gange
            die1.kast();

            switch (die1.getVærdi()) {
                case 1:
                    et++;
                    break;
                case 2:
                    to++;
                    break;
                case 3:
                    tre++;
                    break;
                case 4:
                    fire++;
                    break;
                case 5:
                    fem++;
                    break;
                case 6:
                    seks++;
                    break;
                default:
                    System.out.println("Error");
                    break;

            }
            i++;
        }
        System.out.println("antallet af 1'ere er: "+et);
        System.out.println("antallet af 2'ere er: "+to);
        System.out.println("antallet af 3'ere er: "+tre);
        System.out.println("antallet af 4'ere er: "+fire);
        System.out.println("antallet af 5'ere er: "+fem);
        System.out.println("antallet af 6'ere er: "+seks);

        }
        }




