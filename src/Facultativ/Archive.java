package Facultativ;

import java.util.ArrayList;

/**
 * Система Факультатив. Преподаватель объявляет запись на Курс.
 * Студент записывается на Курс, обучается и по окончании Препода-ватель выставляет Оценку,
 * которая сохраняется в Архиве. Студентов, Преподавателей и Курсов при обучении может быть несколько.
 */
public class Archive {
    private static ArrayList<String> archive  = new ArrayList<String>();

    public void addToArchive(Teacher teacher, String classes, Student student) {
        teacher
        StringBuilder stb = new StringBuilder();
        stb.append(teacher.getfName() + " " + teacher.getlName() + "  - " + classes.getStudentsList().keySet().equals(student));
        archive.add(stb.toString());
    }

    @Override
    public String toString(){
        for (String elem : archive)
            System.out.println(elem);

        return "";
    }

}
