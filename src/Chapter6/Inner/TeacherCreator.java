package Chapter6.Inner;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class TeacherCreator {
    public TeacherCreator() {}

    public AbstractTeacher createTeacher(int id) {
        class Dean extends AbstractTeacher {
            Dean(int id) {
                super(id);
            }

            public boolean excludeStudent(String name) {
                if (name != null){
                    //changing Student information in DB
                    return true;
                }
                else return false;
            }
        }

        if (isDeanId(id))
            return new Dean(id);
        else return new Teacher(id);
    }

    private static boolean isDeanId(int id){
        //check rector from DB
        return (id == 777);
    }
}
