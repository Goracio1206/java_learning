package Chapter5.Builder;

/**
 * Created by Admin on 05-Nov-15.
 */
public class XMLBuilder extends BaseBuilder {

    public void buildLogin() {
        user.setName("Admin");
    }

    public void buildPassword() {
        user.setPassword("Qwerty");
    }

}
