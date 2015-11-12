package Chapter6.Inner;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class TeachersLogic {
    public static void excludeProcess(int deanId, String name) {
        AbstractTeacher teacher = new TeacherCreator().createTeacher(deanId);

        System.out.println("Student: " + name + " excluded: " + teacher.excludeStudent(name));
    }

    public static void main(String[] args) {
        excludeProcess(122, "Bla Vla");
        excludeProcess(777, "asdfasd");
    }
}
