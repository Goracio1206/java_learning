package FacultativDuble2;

import Facultativ.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Lesson {
    private boolean state;
    private String lessonsName;
    private People teacher;
    private HashMap<People, Integer> student = new HashMap<People, Integer>();

    public Lesson(String lessonsName) {
        this.lessonsName = lessonsName;
    }

    public Lesson(String lessonsName, People teacher, People student) {
        this.lessonsName = lessonsName;
        this.teacher = teacher;
        this.student.put(student, 0);
    }
    public void assignTeacher(People teacher) {
        this.teacher = teacher;
    }

    public void addStudent(People student) {
        this.student.put(student, 0);
    }

    private String printStudent() {
        StringBuilder stb = new StringBuilder();
        for (Map.Entry<People, Integer> elem : student.entrySet()){
            stb.append(elem.getKey() + " " + elem.getValue() + "\n");
        }
        return stb.toString();
    }

    @Override
    public String toString() {
        return "Lesson: " + this.lessonsName + "\n"
                + this.teacher.toString() + "\n"
                + printStudent();
    }

}
