package generator;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by RENT on 2017-07-22.
 */
public class BooleanGenerator {
    private boolean value = false;

    public boolean generate(){
        return value = !value;
    }

    public static void main(String[] args) {
        BooleanGenerator generator = new BooleanGenerator();
        for(int i=0;i<10;i++){
            System.out.println(generator.generate());
        }
    }
}
