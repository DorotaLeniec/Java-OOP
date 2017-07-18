package collections.list.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dorka on 18.07.2017.
 */
public class University {

    private Map<Long,Student> map = new HashMap<>();
    private int indexNo = 419800;

    public int getStudentCount() {
        return map.size();
    }

    public void addStudent(String name, String surName){
        Student student = new Student(name, surName,indexNo);
        indexNo++;
        map.put(student.getIndexNo(),student);
    }
    public boolean containsStudent(long index){
       return map.containsKey(index)? true:false;
    }


    public void printAllStudents(){
        printAllStudents(new DefaultFormat());
    }
    public void printAllStudents(StudentFormat defaultFormat){
        for (Student student : map.values()) {
            System.out.println(defaultFormat.format(student));
        }
    }

    public Student getStudent(long indexNumber){
        if(map.containsKey(indexNumber)){
            return map.get(indexNumber);
        } else {
            throw new NoSuchStudentException();
        }
    }
}
