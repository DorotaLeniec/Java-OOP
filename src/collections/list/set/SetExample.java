package collections.list.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by dorka on 17.07.2017.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> oddSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        int[] odds = {11,5,2,5,1,2,5,7,9,11,1,1,1,2,2,5,5,5,5,5};
        for (int odd : odds) {
            oddSet.add(odd);
            treeSet.add(odd);
        }
        printSizeAndElements(oddSet);
        oddSet.remove(9);
        oddSet.remove(11);
        printSizeAndElements(oddSet);

        for (Integer item : treeSet) {
            System.out.println(item);
        }
        System.out.println("Rozmiar zbioru przy implementacji TreeSet : "+ treeSet.size());
    }

    private static void printSizeAndElements(Set<Integer> oddSet) {
        for (Integer integer : oddSet) {
            System.out.println(integer);
        }
        System.out.println("rozmiar zbioru liczb nieparzystych: "+ oddSet.size());
    }
}
