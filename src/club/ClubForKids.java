package club;

/**
 * Created by RENT on 2017-07-15.
 */
public class ClubForKids extends Club {
    @Override
    void enter(Person person) {
       if(person.getAge()<18){
           System.out.println("HEJ " + person.getName() + " Młodzi ");
       } else {
           throw new NoKidException(person.getName() + "Wpuszczamy tylko mlodych!!!!");
       }
    }
}
