package family;

/**
 * Created by dorka on 12.07.2017.
 */
public class Father extends FamilyMember{
    public Father(String name){
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Jestem tata nazywam sie: " + getName());
    }
}
