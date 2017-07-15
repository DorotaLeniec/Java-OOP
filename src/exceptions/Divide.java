package exceptions;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-15.
 */
public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj a :");
        int a = sc.nextInt();
        System.out.println("podaj b :");
        int b = sc.nextInt();

    try {
            System.out.println(a / b + " i " + a % b + "/" + b);
        }
    catch (ArithmeticException e){
            System.out.println("Dzielenie przez 0 jest niedozwolone!!");
        }
    }
}
