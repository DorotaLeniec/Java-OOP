package collections.list.map;

/**
 * Created by dorka on 18.07.2017.
 */
public class DefaultFormat implements StudentFormat {
    @Override
     public String format(Student student){
        return "[" + student.getSurName() + ", " + student.getSurName() + ", "+ student.getIndexNo() + "]";
    }
}
