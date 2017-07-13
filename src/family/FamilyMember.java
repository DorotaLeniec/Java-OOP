package family;

/**
 * Created by dorka on 13.07.2017.
 */
public abstract class FamilyMember {

    private String name;
    public FamilyMember(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void introduce();

}
