package com.gruppe21;

import com.gruppe21.spil.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // instantierer spillet
        Spil spil = new Spil();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // Starter spillet
        while (true){
            spil.Play();
            while (true){
                System.out.println("Spil igen? (Y/N):");
                String str = scanner.nextLine();
                if (str.equals("Y")) break;
                else if (str.equals("N")) return;
                else System.out.println("Ugyldigt input.");
            }
        }

    }
}

