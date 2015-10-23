package Facultativ;

/**
 * Система Факультатив. Преподаватель объявляет запись на Курс.
 * Студент записывается на Курс, обучается и по окончании Препода-ватель выставляет Оценку,
 * которая сохраняется в Архиве. Студентов, Преподавателей и Курсов при обучении может быть несколько.
 */
public class Person {
    private String fName;
    private String lName;
    private boolean teacher;

    public Person(String fName, String lName, boolean teacher){
        this.fName = fName;
        this.lName = lName;
        this.teacher = teacher;
    }

    public Person() {}

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public boolean isTeacher() {
        return teacher;
    }

    public void setTeacher(boolean teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        if (this.teacher)
            return "Teacehr: " + this.fName + " " + this.lName + " ";
        else
            return "Student: " + this.fName + " " + this.lName + " ";
    }
 }
