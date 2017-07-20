package Zadania2;

import java.awt.*;
import java.util.Random;

/**
 * Created by RENT on 2017-07-20.
 */
public class Power {
    static Random random = new Random();



    public static void main(String[] args) {
        System.out.println(pow(3,3));

        printRandoms(5);
        printRandoms(6);
        printRandoms(7);


    }



    private static void printRandoms(int size) {
        int[][] randomNumb = randomNumbers(size);
        System.out.println("_____________________________________");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(randomNumb[i][j]+ " || ");
            }
            System.out.println();
        }
        System.out.println("_____________________________________");
    }

    static int pow(int a, int b){
        int result = 1;
        for(int i=0;i<b;i++){
            result*=a;
        }
        return  result;
    }

    static int[][] randomNumbers(int size){
        int[][] result = new int[size][size];
        for(int i=0;i<size;i++){
            for( int j=0;j<size;j++){
                result[i][j] = random.nextInt(10);
            }
        }
        return result;
    }
}

