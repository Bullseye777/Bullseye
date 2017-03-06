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

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Uzduotis0 uzduotis0 = new Uzduotis0();
        System.out.println("------------------");
        System.out.println("Iveskite skaiciu nuo 1 iki 4");
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
        }
    }
}
