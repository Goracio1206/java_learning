package Facultativ;

import java.util.ArrayList;

/**
 * ������� �����������. ������������� ��������� ������ �� ����.
 * ������� ������������ �� ����, ��������� � �� ��������� �������-������ ���������� ������,
 * ������� ����������� � ������. ���������, �������������� � ������ ��� �������� ����� ���� ���������.
 */
public class Archive {
    private static ArrayList<String> archive  = new ArrayList<String>();

    @Override
    public String toString(){
        for (String elem : archive)
            System.out.println(elem);

        return "";
    }

}
