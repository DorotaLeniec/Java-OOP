package zwierzaki;

/**
 * Created by dorka on 13.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Doggie("Azor",4),new Kitten("Misiek",4), new Snake("Snake" , 0)};

        for(Animal animal : animals){
            animal.run();
        }
    }

}
