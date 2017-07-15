package list;

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
        numbersList.add(2);
        numbersList.add(9);
        numbersList.add(1);
        numbersList.add(3);
        numbersList.add(6);
        int[] numbersArr = {4,9,2,5,6};
        int pairs=0;
        for(int i=0;i<numbersArr.length;i++){
            if(numbersArr[i]==numbersList.get(i)){
                pairs++;
            }
        }
        System.out.println(pairs);
    }
}
