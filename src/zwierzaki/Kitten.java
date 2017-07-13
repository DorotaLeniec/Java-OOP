package zwierzaki;

/**
 * Created by dorka on 13.07.2017.
 */
public class Kitten extends Animal{
    public Kitten(String name, int legAmount) {
        super(name, legAmount);
    }

    @Override
    public void run() {
        System.out.println("Jesem wrednym kotem. Pan  i władca " + getName() + " mam " + getLegAmount() + " lapki");
    }
}
