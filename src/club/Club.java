package club;

/**
 * Created by RENT on 2017-07-15.
 */
public class Club {
    void enter(Person person){
        if(person.getAge()>=18){
            System.out.println("WITAJ! " + person.getName() + " Starzy.");
        }else {
            throw new NoAdultException();
        }
    }
}
