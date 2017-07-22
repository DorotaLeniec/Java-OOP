package generator;

/**
 * Created by RENT on 2017-07-22.
 */
public class SequenceGenerator {
    private int counter = 0;

    public int generate(){
        counter++;
        return counter;
    }

    public static void main(String[] args) {
        SequenceGenerator generator = new SequenceGenerator();
        for(int i=0;i<10;i++){
            System.out.println(generator.generate());
        }
    }
}
