package Chapter6.Inner;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class Teacher extends AbstractTeacher {

    public Teacher(int id) {
        super(id);
    }

    public boolean excludeStudent(String name) {
        return false;
    }

}
