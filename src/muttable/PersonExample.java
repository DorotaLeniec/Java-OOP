package muttable;

/**
 * Created by RENT on 2017-07-22.
 */
public class PersonExample {
    public static void main(String[] args) {
        Person a = new Person("Ania","Kowalska");
        Person b = new Person("Ania","Kowalska");

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
