import java.util.Scanner;

/**
 * Created by A on 2017.03.03.
 */
public class Uzduotis_1_2 {
    public static void main(String[] args){
        System.out.println("Sveiki iveskite zodi");
        Scanner sc = new Scanner(System.in);
        String zodis = sc.next();
        int a =zodis.length();
        System.out.println("Zodyje yra "+a+" simboliai");
    }
}
