package collections.list.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dorka on 18.07.2017.
 */
public class QueueEx2 {
    public static void main(String[] args) {
        Comparator<Person> comparator = new AgeComparator();
        Queue<Person> kolejka = new PriorityQueue<>(10,comparator);
        kolejka.offer(new Person("Dorota",24));
        kolejka.offer(new Person("Zbyszek",24));
        kolejka.offer(new Person("Basia",26));
        kolejka.offer(new Person("Tomek",23));
        kolejka.offer(new Person("Stara",50));
        kolejka.offer(new Person("Młoda",11));

        while(kolejka.size() > 0){
            System.out.println(kolejka.poll().getName());
        }

        System.out.println(kolejka.peek());
    }
}
