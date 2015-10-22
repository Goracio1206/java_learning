package Facultativ;

/**
 * ������� �����������. ������������� ��������� ������ �� ����.
 * ������� ������������ �� ����, ��������� � �� ��������� �������-������ ���������� ������,
 * ������� ����������� � ������. ���������, �������������� � ������ ��� �������� ����� ���� ���������.
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

}
