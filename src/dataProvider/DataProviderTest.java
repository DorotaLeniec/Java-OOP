package dataProvider;

/**
 * Created by RENT on 2017-07-15.
 */
public class DataProviderTest {
    public static void main(String[] args) {
        DataProvider randomProvider = new RandomDataProvider();
//        DataProvider dataProvider = new ConsoleDataProvider();
//        String name = dataProvider.nextString("imie");
//        int age = dataProvider.nextInt("wiek");
//        System.out.println("Hej " + name + " "+ age);

        System.out.println(randomProvider.nextInt("www"));
        System.out.println(randomProvider.nextInt("www"));
        System.out.println(randomProvider.nextInt("www"));
        System.out.println(randomProvider.nextInt("www"));
        System.out.println(randomProvider.nextInt("www"));
        System.out.println(randomProvider.nextInt("www"));
    }
}
