import java.util.Scanner;

/**
 * Created by A on 2017.03.03.
 */
public class Uzduotis_1_3 {

    public static void main(String[] args){
        System.out.println("Sveiki, iveskite skaiciu a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Iveskite skaiciu b");
        int b = sc.nextInt();
        int skirt = a-b;
        int sum = a+b;
        System.out.println("Skaiciu skirtumas yra : "+ skirt);
        System.out.println("Skaiciu suma yra : "+ sum);
    }
}
