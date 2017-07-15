package club;

/**
 * Created by RENT on 2017-07-15.
 */
public class Person {
    public String getName() {
        return name;
    }

    private String name;
    private String surName;

    public int getAge() {
        return age;
    }

    private int age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
}
