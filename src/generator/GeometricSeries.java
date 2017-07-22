package generator;

/**
 * Created by RENT on 2017-07-22.
 */
public class GeometricSeries {
    private int a;
    private final int q;

    public GeometricSeries(int a, int q) {
        this.a = a;
        this.q = q;
    }

    public int generate(){
        a=a*q;
        return a;
    }

    public static void main(String[] args) {
        GeometricSeries generator = new GeometricSeries(4,2);

        for(int i=0;i<10;i++){
            System.out.println(generator.generate());
        }
    }


}
