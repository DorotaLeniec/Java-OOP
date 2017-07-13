package Zadania2;

/**
 * Created by dorka on 11.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Osoba dorota = new Osoba("Dorota", 25);
        Osoba kamil = new Osoba("Kamil", 28);
        Osoba kuba = new Osoba("Kuba", 15);

        System.out.println("Jestem " + dorota.name + " mam " + dorota.age +" lat.");
        System.out.println("Jestem " + kamil.name + " mam " + kamil.age +" lat.");
        System.out.println("Jestem " + kuba.name + " mam " + kuba.age +" lat.");

        TeddyBear bear = new TeddyBear("Kolargol");
        System.out.println("miś miś miś : "+ bear.getName());

    }
}
