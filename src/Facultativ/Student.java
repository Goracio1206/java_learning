package Facultativ;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ������� �����������. ������������� ��������� ������ �� ����.
 * ������� ������������ �� ����, ��������� � �� ��������� �������-������ ���������� ������,
 * ������� ����������� � ������. ���������, �������������� � ������ ��� �������� ����� ���� ���������.
 */
public class Student extends Person {

    private ArrayList<Classes> classes = new ArrayList<Classes>();

    @Override
    public String toString() {
        return super.toString() + "\n" + classes.toString();
    }



}
