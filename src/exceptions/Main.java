package exceptions;

import java.util.Random;

/**
 * Created by RENT on 2017-07-15.
 */
public class Main {
    public static void main(String[] args) {
        doSomething();
    }

    private static void doSomething() {
        Random random = new Random();
        {
            try {
                System.out.println("TRY ");
                if(random.nextBoolean()) {
                    throw new MyOwnException();
                }
            } catch (MyOwnException e) {
                System.out.println("Catch");
            }
        }
    }
}
