package collections.list.map;

/**
 * Created by dorka on 18.07.2017.
 */
public class NoSuchStudentException extends RuntimeException {
    public NoSuchStudentException() {
        super("Brak indexu w mapie");
    }
}
