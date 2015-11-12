package Chapter6.Inner;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        String[] exams = {"Biology", "IT", "Economy", "Physic", "Math","Test"};
        int[] marks = {3,5,2,4,2,5};
        Student student = new Student(1);
        student.setExams(exams, marks);
        System.out.println(student);
     }

}
