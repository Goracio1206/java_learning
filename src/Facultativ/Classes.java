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
