package Facultativ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ������� �����������. ������������� ��������� ������ �� ����.
 * ������� ������������ �� ����, ��������� � �� ��������� �������-������ ���������� ������,
 * ������� ����������� � ������. ���������, �������������� � ������ ��� �������� ����� ���� ���������.
 */
public class Classes extends Teacher {
    private String classes;
    private boolean state;
    private HashMap<Student, Integer> studentsList = new HashMap<Student, Integer>();

    public Classes(String classes, boolean state) {
        this.classes = classes;
        this.state = state;
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
        return this.classes + "\n" + printStudentsList();
    }
}
