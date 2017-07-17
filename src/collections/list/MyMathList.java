package collections.list;
import java.util.List;
import java.util.ArrayList;


/**
 * Created by RENT on 2017-07-15.
 */
public class MyMathList {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        for(int i=1;i<=10;i++){
            numbers.add((double)i);
            System.out.println(numbers.get(i-1));
        }

        List<Boolean> booleans = new ArrayList<>();
        for(int i=1;i<=10;i++){
            if(i%2==0){
            booleans.add(true);
            }else {
                booleans.add(false);
            }
            System.out.println(booleans.get(i-1));
        }

        System.out.println("Suma " + sum(numbers));
        System.out.println("Iloczyn " + product(numbers));
        System.out.println("Srednia " + avr(numbers));

        negative(booleans);

        for(int i=0;i<booleans.size();i++){
            System.out.println(booleans.get(i));
        }

        System.out.println("Koniunkcja " + conjunction(booleans));



    }

    public static double sum(List<Double> numbers){
        double sum =0;
        for(int i=0;i<numbers.size();i++){
            sum+=numbers.get(i);
        }
        return sum;
    }

    public static double product(List<Double> numbers){
        double product =1;
        for(int i=0;i<numbers.size();i++){
            product*=numbers.get(i);
        }
        return product;
    }

    public static double avr(List<Double> numbers){
        double sum = sum(numbers);
        return sum/numbers.size();

    }

    public static void negative(List<Boolean> booleans){
        for(int i=0;i<booleans.size();i++){
            booleans.set(i,!(booleans.get(i)));
        }
    }

    public static boolean conjunction(List<Boolean> booleans){
        boolean result = true;
        for(boolean bol : booleans){
            if(!bol){
                result = bol;
            }
        }
        return result;
    }
}
