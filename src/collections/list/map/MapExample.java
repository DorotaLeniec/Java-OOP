package collections.list.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dorka on 17.07.2017.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('a',1);
        map.put('b',2);
        map.put('z',4);
        System.out.println("ROZMIAR mapy: " + map.size());
        System.out.println("Czy zawiera b " + map.containsKey('b'));
        System.out.println("Czy zawiera 1 " + map.containsValue(1));
        System.out.println(map);
    }
}
