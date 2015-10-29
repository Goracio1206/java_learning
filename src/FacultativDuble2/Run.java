package FacultativDuble2;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Run {
    public static void main(String[] args) {
        Lesson les = new Lesson("IT");

        People teacher = new Teacher("John", "Dow", "IT");
        les.openClasses();
        People st1 = new Student("James", "Villson");
        People st2 = new Student("Sara", "Parker");
        People st3 = new Student("Bill", "Vill");
        People st4 = new Student("Janies", "Vi");
        People st5 = new Student("Jame", "Bol");
        People st6 = new Student("Robert", "Son");
        People st7 = new Student("Bruce", "Crab");

        les.addStudent(st1);
        les.addStudent(st2);
        les.addStudent(st3);
        les.addStudent(st4);
        les.addStudent(st5);
        les.addStudent(st6);



        les.assignTeacher(teacher);
        ((Teacher) teacher).setPointToStudent(les, st2, 3);
        ((Teacher) teacher).setPointToStudent(les, st1, 5);
        ((Teacher) teacher).setPointToStudent(les, st7, 5);

        System.out.println(les.toString());

    }
}
