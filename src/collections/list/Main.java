package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-07-15.
 */
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Ania","haslo"));
        users.add(new User("Zbyszek","12345"));

        for(User user:users){
            System.out.println(user.name + " "+ user.password);
        }

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(4);
        numbersList.add(2);
        numbersList.add(5);
        numbersList.add(12);
        numbersList.add(3);
        numbersList.add(2);

        int[] numbersArr = {4,2,2,1,5,29,3,8};
        int pairs=0;
        for(int i=0;i<numbersArr.length;i++){
            if(numbersArr[i]==numbersList.get(i)){
                pairs++;
            }
        }
        System.out.println(pairs);
    }
}
