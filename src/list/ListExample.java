package list;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-15.
 */
public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        list.add(4);
        list.add(2);
        list.add(3);

        for(Integer item:list){
            System.out.println(item);
        }
    }

}
