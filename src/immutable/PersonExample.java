package immutable;

/**
 * Created by RENT on 2017-07-22.
 */
public class PersonExample {
    public static void main(String[] args) {
        Person a = new Person("Jan", "Kowalski");
        Person b = new Person("Jan", "Kowalski");

        System.out.println(a == b); //  false
        System.out.println(a.equals(b)); // true

        b = b.withName("Adam");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // false
        a = b;
        System.out.println(a == b); // true
        System.out.println(a.equals(b)); // true
        a = a.withName("Paweł");
        b = b.withSurname("Nowak");
        System.out.println(a == b);  // false
        System.out.println(a.equals(b)); // false
        System.out.println(a); // Paweł Kowalski
        System.out.println(b); // Adam Nowak

    }
}
