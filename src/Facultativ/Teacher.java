package Facultativ;

import java.util.ArrayList;


/**
 * ������� �����������. ������������� ��������� ������ �� ����.
 * ������� ������������ �� ����, ��������� � �� ��������� �������-������ ���������� ������,
 * ������� ����������� � ������. ���������, �������������� � ������ ��� �������� ����� ���� ���������.
 */
public class Teacher extends Person {
    private String specialization;
    private ArrayList<Classes> openedCalsses = new ArrayList<Classes>();


    public Teacher(String specialization) {
        this.specialization = specialization;
    }

    public Teacher() {}

    public void openClasses(String classesName) {
        this.openedCalsses.add(new Classes(classesName, true));
    }

    public Teacher(String fName, String lName, boolean teaher, String specialize) {
        super(fName, lName, teaher);
        this.specialization = specialize;
    }

    public void prinClasses() {
        for (Classes elem : openedCalsses){
            System.out.println(elem);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
        + "Teacher specialization is:  " + this.specialization;
    }
}
