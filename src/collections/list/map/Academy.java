package collections.list.map;

import java.util.Map;
import java.util.HashMap;


public class Academy {

    private static long studentAmount = 100200;
    private Map<Long,String> students = new HashMap<>();


    void addStudent(String name, String surneme){
        students.put(studentAmount,name);
        studentAmount++;
    }

    void printStudents(){
        System.out.println(students);
    }

    boolean containsStudents(long index){
        return students.containsKey(index);
    }

}
