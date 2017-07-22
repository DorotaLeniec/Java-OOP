package generatorStringow;

/**
 * Created by RENT on 2017-07-22.
 */
public class Generator {
    public static void main(String[] args) {
        System.out.println(generate(10,"a"));
        System.out.println(generate2(10,"b"));
    }

    public static String generate(int size,String letter){
        String result = "";
        for(int i=0; i<size; i++){
            result+=letter;
        }
        return result;
    }

    public static String generate2(int size,String letter){
        String result = "";
        for(int i=0; i<size/2; i++){
            result+=letter;
        }
        return result+result;
    }
}
