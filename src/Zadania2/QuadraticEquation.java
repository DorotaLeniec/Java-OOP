package Zadania2;

/**
 * Created by dorka on 12.07.2017.
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calcDelta(){
        return b*b - (4*a*c);
    }

    public double calcX1(){
            return (-b - Math.sqrt(calcDelta()))/2*a;
    }

    public double calcX2(){
            return (-b + Math.sqrt(calcDelta()))/2*a;
    }
    public void printEquation(){
        System.out.println("Rownanie kwadratowe : "+ a+"x²+"+b+ "x+"+c);
    }
    public void printX1(){
        System.out.println("x1 = "+ calcX1());
    }
    public void printX2(){
        System.out.println("x2 = "+ calcX2());
    }
    public void printDelta(){
        System.out.println("Delta = "+ calcDelta());
    }

    public void printData(){
        System.out.println("Rownanie kwadratowe : "+ a+"x²+"+b+ "x+"+c);
        System.out.println("Delta = "+ calcDelta());
        System.out.println("x1 = "+ calcX1());
        System.out.println("x2 = "+ calcX2());
    }

    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(5,2,1);
        equation.printData();
    }

}
