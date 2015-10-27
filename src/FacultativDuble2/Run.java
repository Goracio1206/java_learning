package FacultativDuble2;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Run {
    public static void main(String[] args) {
        Lesson les = new Lesson("IT");

        People teacher = new Teacher("John", "Dow", "IT");

        les.assignTeacher(teacher);

        System.out.println(les.toString());
    }
}
