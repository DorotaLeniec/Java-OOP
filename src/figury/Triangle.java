package figury;

/**
 * Created by dorka on 13.07.2017.
 */
public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

        public double countArea(){
        return a*b*c;
        }
    public double countCircumference(){
        return a+b+c;
    }
}
