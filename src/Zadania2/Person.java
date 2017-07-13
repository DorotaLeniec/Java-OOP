package Zadania2;

/**
 * Created by dorka on 12.07.2017.
 */
public class Person {
    private String name;
    private String surName;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surName = surname;
        this.age = age;
    }
    @Override
    public String toString(){
        String text = "Jestem " + name + " " + surName + " mam " + age + "lat. HEJ!";
        return text;
    }


}
