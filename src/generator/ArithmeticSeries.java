package generator;

/**
 * Created by RENT on 2017-07-22.
 */
public class ArithmeticSeries {
    private final int a;
    private final int r;
    private int n = 1;

    public ArithmeticSeries(int a, int r) {
        this.a = a;
        this.r = r;
    }

    public int generate(){
        return a + (n++-1)*r;
    }

    public static void main(String[] args) {
        ArithmeticSeries generator = new ArithmeticSeries(4,1);

        for(int i=0;i<10;i++){
            System.out.println(generator.generate());
        }
    }


}
