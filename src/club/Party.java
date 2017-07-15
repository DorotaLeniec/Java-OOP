package club;

/**
 * Created by RENT on 2017-07-15.
 */
public class Party {
    public static void main(String[] args) {
        Club club = new Club();
        Person[] people = {
                new Person("Ania","Kowalska",12),
                new Person("Basia","Kowalska",22),
                new Person("Zosia","Kowalska",50),
                new Person("Tomasz","Kowalska",12),
                new Person("Bogdan","Kowalska",44),
                new Person("Danka","Kowalska",16),
        };

        for(Person person:people){
            try {
                club.enter(person);
            } catch (NoAdultException e ){
                System.out.println(person.getName() + " sory jestes za mloda.");
            }
        }
    }
}
