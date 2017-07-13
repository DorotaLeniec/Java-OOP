package figury;

/**
 * Created by dorka on 13.07.2017.
 */
public class Square implements Figure {
    private double a;
    public Square(double a){
        this.a = a;
    }
    public double countArea(){
        return a*a;
    }
    public double countCircumference(){
        return 4*a;
    }
}
