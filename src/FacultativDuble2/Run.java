package FacultativDuble2;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Run {
    public static void main(String[] args) {
        Lesson les = new Lesson("IT");

        People teacher = new Teacher("John", "Dow", "IT");
        les.openClasses();
        les.addStudent(new Student("James", "Villson"));
        les.addStudent(new Student("Sara", "Parker"));
        les.addStudent(new Student("Bill", "Vill"));
        les.addStudent(new Student("John", "Villson"));
        les.addStudent(new Student("Janies", "Vi"));
        les.addStudent(new Student("Jame", "Bol"));
        les.addStudent(new Student("Robert", "Son"));
        les.addStudent(new Student("Bruce", "Crab"));
        les.addStudent(new Student("Jack", "V"));

        les.assignTeacher(teacher);

        System.out.println(les.toString());
    }
}
