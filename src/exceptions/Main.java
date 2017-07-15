package exceptions;


import java.util.Random;

/**
 * Created by RENT on 2017-07-15.
 */
public class Main {
    public static void main(String[] args) {
        try{
            doSomething();
        }catch(MyOwnException e){
            System.out.println("cos poszło nie tak.");
        }
    }

    private static void doSomething() throws MyOwnException {
        Random random = new Random();
        System.out.println("TRY ");
        if(random.nextBoolean()) {
            throw new MyOwnException();
        }
    }
}
