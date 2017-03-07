package Pamokos;

//import uzduotis0.Uzduotis0;

/**
 * Created by A on 2017.03.06.
 */


import uzduotis0.Uzduotis0;
import uzduotis1.Uzduotis1;
import uzduotis2.Uzduotis2;
import uzduotis3.Uzduotis3;
import uzduotis4.Uzduotis4;
import uzduotis5.Uzduotis5;
import uzduotis6.Uzduotis6;
import uzduotis7.Uzduotis7;
import uzduotis8.Uzduotis8;
import Masyvai.Uzduotis1_5;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Uzduotis0 uzduotis0 = new Uzduotis0();
        System.out.println("------------------");
        System.out.println("Iveskite skaiciu nuo 1 iki 9 užduočiai pasirinkti");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int skaicius = sc.nextInt();
            switch (skaicius) {
                case (1):
                    Uzduotis1 uzduotis1 = new Uzduotis1();
                    break;
                case (2):
                    Uzduotis2 uzduotis2 = new Uzduotis2();
                    break;
                case (3):
                    Uzduotis3 uzduotis3 = new Uzduotis3();
                    break;
                case (4):
                    Uzduotis4 uzduotis4 = new Uzduotis4();
                    break;
                case (5):
                    Uzduotis5 uzduotis5 = new Uzduotis5();
                    break;
                case (6):
                    Uzduotis6 uzduotis6 = new Uzduotis6();
                    break;
                case (7):
                    Uzduotis7 uzduotis7 = new Uzduotis7();
                    break;
                case (8):
                    Uzduotis8 uzduotis8 = new Uzduotis8();
                    break;
                case (9):
                    Uzduotis1_5 masyvai = new Uzduotis1_5();
                    System.out.println("Iveskite kiek skaičių reiks įvesti:");
                    masyvai.nuskaitymas(sc.nextInt());
                    masyvai.skaiciavimas();
                    break;

                default:
                    System.out.println("Ivedėte blogą skaičių, tokios užduoties nėra");
            }
            // break;
        }
    }
}

