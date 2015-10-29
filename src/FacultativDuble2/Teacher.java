package FacultativDuble2;

import java.util.Map;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Teacher extends People {
    private String spec;

    public Teacher() {}
    public Teacher(String fName, String lName, String spec) {
        super(fName, lName, true);
        this.spec = spec;
    }

    public void setPointToStudent(Lesson lesson, People student, Integer point) {
        for (Map.Entry<People, Integer> elem: lesson.getStudent().entrySet() ) {
            if (elem.getKey().equals(student)) {
                elem.setValue(point);
                break;
            }
        }



    }

}
