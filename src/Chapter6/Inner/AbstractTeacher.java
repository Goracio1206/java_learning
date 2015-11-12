package Chapter6.Inner;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public abstract class AbstractTeacher {

    private int id;
    public AbstractTeacher(int id) {
        this.id = id;
    }

    public abstract boolean excludeStudent(String name);
}
