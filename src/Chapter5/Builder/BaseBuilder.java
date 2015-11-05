package Chapter5.Builder;

/**
 * This is Builder Pattern.
 * {@code BaseBuilder} is abstract class.
 *
 * @author Vitalii Nedzelskyi
 * @version 1.0
 */
public abstract class BaseBuilder {

    protected User user = new User();

    public User getUser() {
        return user;
    }

    public abstract void buildLogin();

    public abstract void buildPassword();

}
