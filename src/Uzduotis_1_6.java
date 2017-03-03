import java.util.Scanner;

/**
 * Created by A on 2017.03.03.
 */
public class Uzduotis_1_6 {
    public static void main(String[] args) {
System.out.println("Sveiki, iveskite savo mase, kg: ");
        Scanner sc = new Scanner(System.in);
        int mase = sc.nextInt();
        System.out.println("Sveiki, iveskite savo ugi, m: ");
        float ugis = sc.nextFloat();
        int i=2;
        int ugis2 = (int) Math.pow(ugis, i);
        int kmi = mase/ugis2;
        System.out.println("Sveiki, Jusu KMI: "+kmi);
    }
}
