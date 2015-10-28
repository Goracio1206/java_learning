package FacultativDuble2;

import Facultativ.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Lesson extends LessonsList {
    private boolean state;
    private String lessonsName;
    private People teacher;
    private HashMap<People, Integer> student = new HashMap<People, Integer>();

    public Lesson(String lessonsName) {
        this.lessonsName = lessonsName;
        addLessonsList(this);
    }

    public Lesson(String lessonsName, People teacher, People student) {
        this.lessonsName = lessonsName;
        this.teacher = teacher;
        this.student.put(student, 0);
        addLessonsList(this);
    }

    public void assignTeacher(People teacher) {
        this.teacher = teacher;
    }

    public void addStudent(People student) {
        this.student.put(student, 0);
    }

    public void openClasses() {
        this.state = true;
    }

    private String printStudent() {
        StringBuilder stb = new StringBuilder();
        for (Map.Entry<People, Integer> elem : student.entrySet()){
            stb.append(elem.getKey() + " has a " + elem.getValue() + " point." + "\n");
        }
        return stb.toString();
    }

    @Override
    public String toString() {

        if (this.state) {
            return super.toString() + "Lesson: " + this.lessonsName + "\n"
                    + this.teacher.toString() + "\n"
                    + printStudent();
        } else {
            return "This " + this.lessonsName + " classes is not available for now. Please try again later!";
        }
    }

}
