package Chapter5.Factory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Base one = Factory.getClassFromFactory("Student");
        Base two = Factory.getClassFromFactory("Teacher");
      //  Base three = Factory.getClassFromFactory("bla bla");
        one.perform();
        two.perform();

    }
}
