package Chapter5.Builder;

/**
 * Created by Admin on 05-Nov-15.
 */
public class DBBuilder extends BaseBuilder {

    public void buildLogin() {
        user.setName("Moder");
    }

    public void buildPassword() {
        user.setPassword("Qawsed1234");
    }
}
