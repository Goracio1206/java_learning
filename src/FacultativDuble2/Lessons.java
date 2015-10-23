package FacultativDuble2;

import Facultativ.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Lessons {
    private boolean state;
    private String lessonsName;
    private Person teacher;
    private HashMap<Person, Integer> student = new HashMap<Person, Integer>();

    public Lessons() {}

    public Lessons(String lessonsName, Person teacher, Person student) {
        this.lessonsName = lessonsName;
        this.teacher = teacher;
        this.student.put(student, 0);
    }

    private String printStudent() {
        StringBuilder stb = new StringBuilder();
        for (Map.Entry<Person, Integer> elem : student.entrySet()){
            stb.append(elem.getKey() + " " + elem.getValue() + "\n");
        }
        return stb.toString();
    }

    @Override
    public String toString() {
        return this.lessonsName + "\n"
                + this.teacher.toString() + "\n"
                + printStudent();
    }

}
