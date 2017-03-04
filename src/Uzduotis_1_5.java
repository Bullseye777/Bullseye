

import java.util.Scanner;

public class Uzduotis_1_5 {

    public static void main(String[] args) {

        System.out.println("Sveiki, iveskite skaičių a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Sveiki, iveskite skaičių b ");
        int b = sc.nextInt();
        operacija((float) a, (float) b);
        operacija((int) a, (int) b);
    }

    private static void operacija(float a, float b) {
        float skirt = a - b;
        System.out.println("Skirtumas yra: "+skirt);
        float sum = a - b;
        System.out.println("Skirtumas yra: "+sum);

    }

    private static void operacija(int a, int b) {
        int skirt = a - b;
        System.out.println("Skirtumas yra: "+skirt);
        int sum = a - b;
        System.out.println("Skirtumas yra: "+sum);

    }
}
//}
//        Skaiciavimas1_5 objektas = new Skaiciavimas1_5();
//        objektas.ivedimas();
//        objektas.sum();
//        objektas.skirt();
//    }
//
//
//}
//
//class Skaiciavimas1_5 {
//    public int a;
//    public int b;
//    public float a2;
//    public float b2;
//
//    public void ivedimas() {
//        System.out.println("skaicius a:");
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        a2 = sc.nextFloat();
//        System.out.println("skaicius b:");
//        b = sc.nextInt();
//        b2 = sc.nextFloat();
//        System.out.println("Jus ivedete " + a + "ir " + b);
//    }
//
//    public void sum() {
//        int sum = a + b;
//        System.out.println("Skaiciu suma yra: " + sum);
//    }
//
//    public float  {
//        float sum = a2 + b2;
//        System.out.println("Skaiciu suma yra: " + sum(float a2, float b2));
//        return sum(a, b);
//    }
//
//    public void skirt() {
//        int skirt = a - b;
//        System.out.println("Skaiciu skirtumas yra: " + skirt);
//
//    }
//}
