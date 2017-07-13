package family;

/**
 * Created by dorka on 12.07.2017.
 */
public class Mother extends FamilyMember{

    public Mother(String name){
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Jestem mama mam na imie : " + getName());
    }
}
