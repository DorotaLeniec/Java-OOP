package collections.list.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by dorka on 17.07.2017.
 */
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
