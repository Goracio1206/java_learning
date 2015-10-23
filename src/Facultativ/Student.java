package Facultativ;


import java.util.ArrayList;

/**
 * ������� �����������. ������������� ��������� ������ �� ����.
 * ������� ������������ �� ����, ��������� � �� ��������� �������-������ ���������� ������,
 * ������� ����������� � ������. ���������, �������������� � ������ ��� �������� ����� ���� ���������.
 */
public class Student extends Person {

    public Student(){}

    public Student(String fName, String lName) {
        super(fName, lName, false);
    }

    public boolean isOpenedCourses(Teacher teacher, String classe) {
        boolean ispresent = false;
        ArrayList<String> temp = teacher.getOpenedCalsses();
        for (String elem : temp) {
            if (elem.equals(classe)){
                ispresent = true;
                break;
            }
        }
        return ispresent;
    }

    public void startStudy(Teacher teacher, String classes,Student student) {
        if (isOpenedCourses(teacher, classes)){
            teacher.addStudentToClasss(student, classes);
        }else {
            System.out.println("Current classes are not available for now. Please try again later!");
        }

    }

}
