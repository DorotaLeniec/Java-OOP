package exceptions;

/**
 * Created by RENT on 2017-07-15.
 */
public class Main {
    public static void main(String[] args) {
        doSomething();
        return;
    }

    private static void doSomething() {
        throw new MyOwnException();
    }
}
