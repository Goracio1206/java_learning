package Facultativ;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Система Факультатив. Преподаватель объявляет запись на Курс.
 * Студент записывается на Курс, обучается и по окончании Препода-ватель выставляет Оценку,
 * которая сохраняется в Архиве. Студентов, Преподавателей и Курсов при обучении может быть несколько.
 */
public class Student extends Person {

    private ArrayList<Classes> classes = new ArrayList<Classes>();

    @Override
    public String toString() {
        return super.toString() + "\n" + classes.toString();
    }



}
