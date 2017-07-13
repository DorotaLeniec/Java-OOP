package zwierzaki;

/**
 * Created by dorka on 13.07.2017.
 */
public abstract class Animal {
    private String name;
    private int legAmount;

    public Animal(String name, int legAmount) {
        this.name = name;
        this.legAmount = legAmount;
    }

    public String getName() {
        return name;
    }

    public int getLegAmount() {
        return legAmount;
    }

    public abstract void run();
}
