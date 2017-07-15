package list;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-15.
 */
public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(4);
        list.add("jojo");
        list.add(true);

        for(Object item:list){
            System.out.println(item);
        }
    }

}
