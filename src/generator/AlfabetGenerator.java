package generator;

/**
 * Created by RENT on 2017-07-22.
 */
public class AlfabetGenerator {
    private char letter = '`';

    public char generate(){
        if(letter == 'z') {
            letter = '`';
        }
        letter++;
        return letter;
    }

    public static void main(String[] args) {
        AlfabetGenerator generator = new AlfabetGenerator();

        for(int i=0;i<40;i++){
            System.out.println(generator.generate());
        }
    }
}
