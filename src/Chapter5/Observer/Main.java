package Chapter5.Observer;

/**
 * Created by Admin on 11-Nov-15.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4,8);
        rect.addObserver(new Square());
        rect.addObserver(new Perimetr());
        System.out.println(rect.toString());

        rect.setHeight(7);
        System.out.println(rect);

        rect.setWeight(8);
        System.out.println(rect);
    }
}
