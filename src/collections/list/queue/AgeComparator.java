package collections.list.queue;

import java.util.Comparator;

/**
 * Created by dorka on 18.07.2017.
 */
public class AgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
//        return o1.getAge() - o2.getAge();
    }
}
