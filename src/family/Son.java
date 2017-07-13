package family;

/**
 * Created by dorka on 12.07.2017.
 */
public class Son extends FamilyMember {
  public Son(String name){
      super(name);
  }

    @Override
    public void introduce() {
        System.out.println("Jestem synem nazywam sie :"+ getName());
    }
}
