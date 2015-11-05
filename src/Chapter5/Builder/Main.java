package Chapter5.Builder;

/**
 * Created by Admin on 05-Nov-15.
 */
public class Main {


    public static void main(String[] args) {
        User b1 = new User().buildUser(new XMLBuilder());
        User b2 = new User().buildUser(new DBBuilder());

        System.out.println(b1.getName());
        System.out.println(b1.getPassword());
        System.out.println(b2.getName());
        System.out.println(b2.getPassword());
    }

}
