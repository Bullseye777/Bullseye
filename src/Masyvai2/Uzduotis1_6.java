package Masyvai2;

import java.util.Scanner;

/**
 * Created by A on 2017.03.07.
 */
public class Uzduotis1_6 {
    String[] zodziai;


    public void nuskaitymas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite kiek žodžių norėsite atspausdinti:");
        int ilgis = sc.nextInt();
        zodziai = new String[ilgis];
        System.out.println("Įveskite " + ilgis + " žodžius");
        for (int i = 0; i < zodziai.length; i++) {
            System.out.println("Koks "+(i+1)+" zodis");
            String zodis = sc.next();
            zodziai[i] = zodis;
        }
    }

    public void spausdinimas() {

        for (int i = 0; i < zodziai.length; i++) {
            System.out.println("Įvesti žodžiai yra:" + zodziai[i]);

        }
    }
}
