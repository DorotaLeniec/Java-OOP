package collections.list.map;

/**
 * Created by dorka on 18.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        University uni = new University();
        uni.addStudent("Dorota","Leniec");
        uni.addStudent("Kasia","Kuku");
        uni.addStudent("Basia","Bziu");
        uni.printAllStudents(student -> student.getIndexNo()+"");


        System.out.println("Czy na uczelni isnieje osoba o indexie 419802? " + uni.containsStudent(419802));
        try
        {
            Student stu1 = uni.getStudent(419802);
            System.out.println("Uczen o indexie 419802 to : "+ stu1.getName() + " " + stu1.getSurName());
        }
        catch (NoSuchStudentException e){

        }
        System.out.println("Na uczelni obecnie uczy się : " + uni.getStudentCount() + " uczniów");
        uni.addStudent("Tomek","Boman");
        uni.addStudent("Antonina","Kiler");
        System.out.println("Na uczelni obecnie uczy się : " + uni.getStudentCount() + " uczniów");
        try
        {
            Student stu2 = uni.getStudent(419702);
        }
        catch(NoSuchStudentException e){
           System.out.println("Nie ma ucznia o takim indexie.");
        }
    }
}
