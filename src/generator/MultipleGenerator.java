package generator;

/**
 * Created by RENT on 2017-07-22.
 */
public class MultipleGenerator {

    private int multipleValue;
    private int multiple;

    public MultipleGenerator(int multipleValue) {
        this.multipleValue = multipleValue;
    }

    public int generate(){
        multiple+=multipleValue;
        return multiple;
    }

    public static void main(String[] args) {
        MultipleGenerator multipleGenerator = new MultipleGenerator(11);

        for(int i=0;i<10;i++){
            System.out.println(multipleGenerator.generate());
        }
    }
}
