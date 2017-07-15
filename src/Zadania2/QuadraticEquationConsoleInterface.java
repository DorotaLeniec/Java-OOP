package Zadania2;

import java.util.Scanner;

/**
 * Created by dorka on 12.07.2017.
 */
public class QuadraticEquationConsoleInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj parametry rownania kwadratowego zaczynając od najwyzszej potegi x:(podawaj je po spacji)");
        QuadraticEquation equation = new QuadraticEquation(sc.nextInt(), sc.nextInt(), sc.nextInt());
        equation.printEquation();
        System.out.println("Oblicz delte - PRESS 1/Oblicz x1 - PRESS 2/ Oblicz x2 - PRESS 3/ Zakoncz - PRESS 4/Podaj nowe parametry - PRESS 5 ");
        int step = sc.nextInt();
        while (step != 4) {
            if (step == 1) {
                equation.printDelta();
            } else if (step == 2 || step == 3) {
                if (step == 2) {
                    try {
                        equation.printX1();
                    } catch (NegativDeltaException e) {
                        System.out.println("Delta jest ujemna. Brak rozwiązan rzeczywistych.");
                    }
                } else {
                    try {
                        equation.printX2();
                    } catch (NegativDeltaException e) {
                        System.out.println("Delta jest ujemna. Brak rozwiązan rzeczywistych.");
                    }
                }
            } else if (step == 5) {
                System.out.println("Podaj parametry rownania kwadratowego zaczynając od najwyzszej potegi x:(podawaj je po spacji)");
                equation = new QuadraticEquation(sc.nextInt(), sc.nextInt(), sc.nextInt());
                equation.printEquation();
            } else {
                System.out.println("Nie obslugujemy wartosci " + step);
            }
            System.out.println("Oblicz delte - press 1/Oblicz x1 - press 2/ Oblicz x2 - press 3/ Zakoncz - press 4/Podaj nowe parametry - PRESS 5 ");
            step = sc.nextInt();
        }
    }
}
