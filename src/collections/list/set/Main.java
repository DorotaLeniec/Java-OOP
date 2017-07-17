package collections.list.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by dorka on 17.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Set<NumberPair> numberPairs = new HashSet<>();
        numberPairs.add(new NumberPair(1, 2));
        numberPairs.add(new NumberPair(2, 1));
        numberPairs.add(new NumberPair(1, 1));
        numberPairs.add(new NumberPair(1, 1));
        numberPairs.add(new NumberPair(2, 2));
        numberPairs.add(new NumberPair(2, 2));

        for (NumberPair numberPair : numberPairs) {
            numberPair.print();
        }
    }
}
