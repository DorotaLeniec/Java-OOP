package collections.list.queue;

import java.util.Comparator;

/**
 * Created by dorka on 18.07.2017.
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name + " " + getAge();
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return  other.age - this.age;
    }
}
