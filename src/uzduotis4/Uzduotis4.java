package uzduotis4;

import java.util.Scanner;

/**
 * Created by A on 2017.03.06.
 */
public class Uzduotis4 {
    public Uzduotis4() {


        System.out.println("Sveiki, iveskite savo mase, kg: ");
        Scanner sc = new Scanner(System.in);
        int mase = sc.nextInt();
        System.out.println("Iveskite savo ugi, m: ");
        float ugis = sc.nextFloat();
        int ugis2 = (int) Math.pow(ugis, 2);
        int kmi = mase / ugis2;
        System.out.println("Jusu KMI: " + kmi);
    }
}


