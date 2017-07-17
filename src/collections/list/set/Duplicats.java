package collections.list.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dorka on 17.07.2017.
 */
public class Duplicats {
    public static void main(String[] args) {
        String name = "Dor tel bla   aaaa ".replace(" ","");
        String[] letterArr = name.split("");

        Set<String> letters = new HashSet<>();

        letters.addAll(Arrays.asList(letterArr));
        System.out.println("Czy sa powtórzenia? " + containsDuplicats(letters,letterArr));


    }
    public static boolean containsDuplicats(Set<String> letters, String[] letterArr){
        return letters.size()!=letterArr.length;

    }
}
