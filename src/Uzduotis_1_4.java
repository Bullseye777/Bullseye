

import java.util.Scanner;

public class Uzduotis_1_4 {

    public static void main(String[] args) {
        Skaiciavimas objektas = new Skaiciavimas();
        objektas.ivedimas();
        objektas.sum();
        objektas.skirt();
    }


}

class Skaiciavimas {
    public int a;
    public int b;

    public void ivedimas() {
        System.out.println("skaicius a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("skaicius b:");
        b = sc.nextInt();
        System.out.println("Jus ivedete " + a + "ir " + b);
    }

    public void sum() {
        int sum = a + b;
        System.out.println("Skaiciu suma yra: " + sum);
    }

    public void skirt() {
        int skirt = a - b;
        System.out.println("Skaiciu skirtumas yra: " + skirt);

    }
}
