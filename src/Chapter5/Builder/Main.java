package Chapter5.Builder;

/**
 * Created by Admin on 05-Nov-15.
 */
public class Main {

    public static User buildUser(BaseBuilder builder){
        builder.buildLogin();
        builder.buildPassword();
        return builder.getUser();
    }

    public static void main(String[] args) {
        User b1 = buildUser(new XMLBuilder());
        User b2 = buildUser(new DBBuilder());

        System.out.println(b1.getName());
        System.out.println(b1.getPassword());
        System.out.println(b2.getName());
        System.out.println(b2.getPassword());
    }

}
