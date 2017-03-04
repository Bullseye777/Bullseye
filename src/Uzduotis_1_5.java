

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

