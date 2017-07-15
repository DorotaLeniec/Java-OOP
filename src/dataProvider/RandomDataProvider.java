package dataProvider;

import java.util.Random;

/**
 * Created by RENT on 2017-07-15.
 */
public class RandomDataProvider implements DataProvider {
    private String[] words = {"slowo1","slowo2","slowo3","slowo4","slowo5"};

    Random random = new Random();
    @Override
    public int nextInt(String name) {
        return random.nextInt(10);
    }

    @Override
    public String nextString(String name) {
        return null;
    }
}
