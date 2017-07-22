package generator;

import java.util.Random;

/**
 * Created by RENT on 2017-07-22.
 */
public class RandomNumbersGenerator {
    private int dx;
    private Random random;
    private int min;

    public RandomNumbersGenerator(int min, int max) {
        this.dx = max-min+1;
        this.random = new Random();
        this.min = min;
    }

    public int generate(){
        return random.nextInt(dx)+min;
    }

    public static void main(String[] args) {
        RandomNumbersGenerator gen = new RandomNumbersGenerator(20,100);
        for(int i=0;i<100;i++){
            System.out.println(gen.generate());
        }
    }
}
