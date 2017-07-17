package collections.list.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dorka on 17.07.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        Set<Double> mySet = makeSet(1,2,3,4,5,5,5,4);
        for (Double aDouble : mySet) {
            System.out.println(aDouble);
        }
    }

    public static Set<Double> makeSet(double... varargs){
        Set<Double> result = new HashSet<>();
        for (double arg : varargs) {
            result.add(arg);
        }
        return result;
    }
}
