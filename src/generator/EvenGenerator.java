package generator;

/**
 * Created by RENT on 2017-07-22.
 */
public class EvenGenerator {
    private int counter = 2;

    public int generate(){
        return counter+=2;
    }

    public static void main(String[] args) {
        EvenGenerator evenGenerator = new EvenGenerator();
        for(int i=0;i<20;i++){
            System.out.println(evenGenerator.generate());
        }

    }
}
