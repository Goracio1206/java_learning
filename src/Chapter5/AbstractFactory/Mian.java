package Chapter5.AbstractFactory;

/**
 * This is Main class where You can execute {@code AbstractFactory} functional.
 * @author Vitalii Nedzelskyi
 * @version 1.0
 */
public class Mian {
    public static void main(String[] args) {

        BaseFactory fact1 = AbstractFactory.getFactory("White");
        BaseFactory fact2 = AbstractFactory.getFactory("Black");
        Circle circle1 = fact1.createCircle(4.6);
        Circle cercle2 = fact2.createCircle(5.7);
        Triangle tri1 = fact1.createTriangle(4.1, 5.2);
        Triangle tri2 = fact2.createTriangle(4.2, 5.4);

        tri1.square();
        tri2.square();
        circle1.square();
        cercle2.square();
    }
}
