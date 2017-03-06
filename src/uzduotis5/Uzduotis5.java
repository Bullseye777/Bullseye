package uzduotis5;

import java.util.Scanner;

/**
 * Created by A on 2017.03.06.
 */
public class Uzduotis5 {
    public  Uzduotis5(){
        System.out.println("Iveskite skaičių, nustatysime ar jis lyginis ar ne");
        Scanner sc = new  Scanner(System.in);
        int sk = sc.nextInt();
        if (sk%2==0) {
            System.out.println("Skaičius yra lyginis");
        }
        else{
            System.out.println("Skaičius yra nelyginis");
            }


    }
}
