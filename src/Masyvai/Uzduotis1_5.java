package Masyvai;

import java.util.Scanner;

/**
 * Created by A on 2017.03.07.
 */
public class Uzduotis1_5 {
    public Uzduotis1_5() {

        System.out.println("Iveskite 5 skaičius");
        int[] mas = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite skaičių " + (i + 1) + "(-ą)");
            mas[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.println("Įvesti skaičiai yra:");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + ",");
            sum += mas[i];
                    }
               System.out.println("Įvestų skaičių suma yra:" + sum);
    }
}
