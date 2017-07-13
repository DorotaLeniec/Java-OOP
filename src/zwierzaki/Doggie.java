package zwierzaki;

/**
 * Created by dorka on 13.07.2017.
 */
public class Doggie  extends Animal{
    public Doggie(String name, int legAmount) {
        super(name, legAmount);
    }

    @Override
    public void run() {
        System.out.println("Jestem super psem. Wabię sie " + getName() + " mam " + getLegAmount()+ " łapki.");
    }
}
