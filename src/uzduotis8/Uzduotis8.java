package uzduotis8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by A on 2017.03.06.
 */
public class Uzduotis8 {
    public Uzduotis8() {
        int sk = -1;
        System.out.println("Įveskite skaičius kuriuos norite sudėti, pabaigti įveskite '0'");
        int sum = 0;
        while (sk != 0) {
            try {
                Scanner sc = new Scanner(System.in);
                sk = sc.nextInt();
                sum = sum + sk;

            } catch (InputMismatchException e) {
                System.out.println("Įveskite skaičių:");
            }
        }
            System.out.println("Įvestų skaičių sumą lygi:" + sum);

        }
    }

