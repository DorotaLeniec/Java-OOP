package dataProvider;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-15.
 */
public class ConsoleDataProvider implements DataProvider {
    private Scanner sc = new Scanner(System.in);

    @Override
    public int nextInt(String name) {
        System.out.println("podaj "+name+": ");
        return sc.nextInt();
    }

    @Override
    public String nextString(String name) {
        System.out.println("podaj "+name+": ");
        return sc.next();
    }
}
