package Facultativ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Система Факультатив. Преподаватель объявляет запись на Курс.
 * Студент записывается на Курс, обучается и по окончании Препода-ватель выставляет Оценку,
 * которая сохраняется в Архиве. Студентов, Преподавателей и Курсов при обучении может быть несколько.
 */
public class Classes extends Teacher {

    private String classes;
    private boolean state;
    private HashMap<Student, Integer> studentsList = new HashMap<Student, Integer>();

    public Classes() {}

    public Classes(String classes, boolean state) {
        this.classes = classes;
        this.state = state;
    }

    public String getClasses() {
        return classes;
    }


    public void addStudent(Student student, int point) {
        this.studentsList.put(student, point);
    }

    private String printStudentsList(){
        StringBuilder stb = new StringBuilder();
        for (Map.Entry<Student, Integer> elem : studentsList.entrySet()){
            stb.append(elem.getKey() + " - " + elem.getValue());
        }
        return stb.toString();
    }

    @Override
    public String toString() {
        return this.classes+ ":" + "\n" + ((studentsList.isEmpty())? "No students for now!" :printStudentsList());
    }
}
