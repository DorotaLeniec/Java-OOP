package family;

/**
 * Created by dorka on 12.07.2017.
 */
public class Daughter extends FamilyMember{
 public Daughter(String name){
     super(name);
 }

    @Override
    public void introduce() {
        System.out.println("Jestem córką: mam na imie :" + getName());
}
}
