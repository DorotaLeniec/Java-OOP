package generator;

/**
 * Created by RENT on 2017-07-22.
 */
public class SectionGenerator {

    private int counter;
    private int start;
    private int end;

    public SectionGenerator(int start, int end) {
        this.start = start;
        this.end = end;
        this.counter = start;
    }


    public int generator() {
        if (end >= start) {
            return start++;
        }
        return 0;
    }

    public static void main(String[] args) {
        SectionGenerator section = new SectionGenerator(30,60);
        for(int i =0;i<=32;i++){
            System.out.println(section.generator());
        }
    }
}

