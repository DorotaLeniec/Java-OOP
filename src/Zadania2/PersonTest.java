package Zadania2;

/**
 * Created by dorka on 12.07.2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Kasia","Ketler",23),
            new Person("Zosia","Grzyb",34),
        };

        for(Person person:people){
            System.out.println(person);
        }

    }
}
