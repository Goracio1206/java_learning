package Facultativ;

/**
 * Система Факультатив. Преподаватель объявляет запись на Курс.
 * Студент записывается на Курс, обучается и по окончании Препода-ватель выставляет Оценку,
 * которая сохраняется в Архиве. Студентов, Преподавателей и Курсов при обучении может быть несколько.
 */
public class Classes {
    private String classesName;
    private int point;

    public Classes(String classesName) {
        this.classesName = classesName;
    }

    public Classes(String classesName, int point) {
        this.classesName = classesName;
        this.point = point;
    }

    public Classes() {}

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
