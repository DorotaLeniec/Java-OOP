package family;

/**
 * Created by dorka on 12.07.2017.
 */
public class Family {
    public static void main(String[] args) {
        Mother mother = new Mother("Mama");
        Father father = new Father("Tata");
        Son son = new Son("Syn");

        Daughter dother = new Daughter("Córa");
        FamilyMember[] members = {mother, father, son, dother};

        for (FamilyMember member : members) {
            member.introduce();
        }
    }

}
