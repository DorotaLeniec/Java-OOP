package figury;

/**
 * Created by dorka on 13.07.2017.
 */
public class Circle implements Figure{
    private double r;
    public Circle(double r){
        this.r = r;
    }
    public double countArea(){
        return Math.PI*r*r;
    }
    public double countCircumference(){
        return 2*Math.PI*r;
    }
}
