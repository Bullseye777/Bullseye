package uzduotis8;

import java.util.Scanner;

/**
 * Created by A on 2017.03.06.
 */
public class Uzduotis8 {
    public Uzduotis8() {
        int sum = 0;
        while (true) {
            System.out.println("Įveskite skaičius kuriuos norite sudėti, pabaigti įveskite '0'");
            Scanner sc = new Scanner(System.in);
            int sk = sc.nextInt();

            if (sk != 0) {
                sum = sum + sk;

            } else {
                System.out.println("Įvestų skaičių sumą lygi:" + sum);
            }
        }
    }
}
