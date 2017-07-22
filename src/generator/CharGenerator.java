package generator;

/**
 * Created by RENT on 2017-07-22.
 */
public class CharGenerator {
    private RandomNumbersGenerator randomCharNumbers = new RandomNumbersGenerator('a','z');

    public char generate(){
        return (char)randomCharNumbers.generate();
    }

    public static void main(String[] args) {
        CharGenerator charGenerator = new CharGenerator();
        for(int i=0;i<26;i++){
            System.out.println(charGenerator.generate());
        }
    }

}
