package uzduotis6;

import java.util.Scanner;

/**
 * Created by A on 2017.03.06.
 */
public class Uzduotis6 {
    public Uzduotis6() {
        while (true) {
            System.out.println("Iveskite žodį kad jį atpausdintume arba žodį 'pabaiga' kad išsijungtų");
            Scanner sc = new Scanner(System.in);
            String zodis = sc.next();
            if (!zodis.equals("pabaiga")) {
                System.out.println(zodis);

            } else {
                break;
            }

        }
    }

}