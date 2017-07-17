package collections.list.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dorka on 17.07.2017.
 */
public class Studies {
    public static void main(String[] args) {
        Student stu1 = new Student("Dorota","Leniec",100200);
        Student stu2 = new Student("Kasia","Bobek",100400);
        Student stu3 = new Student("Antek","Kowalik",100500);

        Map<String,Long> students = new TreeMap<>();
        students.put(stu1.getName(),stu1.getIndexNo());
        students.put(stu2.getName(),stu2.getIndexNo());
        students.put(stu3.getName(),stu3.getIndexNo());
        System.out.println("Ilosc studentów " + students.size());
        System.out.println(students);

        Academy academy = new Academy();
        academy.addStudent("Dorota","Leniec");
        academy.addStudent("Kasia","Bobek");
        academy.addStudent("Zofia","Hej");
        academy.addStudent("Zofia","Hej");



        academy.printStudents();
        System.out.println("Na uczelni jest uczen z indexem: " + academy.containsStudents(100204));


    }
}
