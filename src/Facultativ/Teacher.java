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

    public Teacher() {}

    public void openClasses(String classesName) {
        this.openedCalsses.add(new Classes(classesName, true));
    }

    public Teacher(String fName, String lName, String specialize) {
        super(fName, lName, true);
        this.specialization = specialize;
    }

    public ArrayList<String> getOpenedCalsses() {
        ArrayList<String> temp = new ArrayList<String>();
        for (Classes elem : openedCalsses) {
            temp.add(elem.getClasses());
        }
        return temp;
    }

    public void addStudentToClasss(Student student, String classes) {
      for (Classes elem : openedCalsses){
          if (elem.getClasses().equals(classes)){
              elem.addStudent(student, 0);
          }
      }
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
