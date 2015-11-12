package Chapter5.ObserverW;

/**
 * Created by Vitalii.Nedzelskyi on 11.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4,1);
        System.out.println(rect.toString());
        rect.addObserver(new Perimetr());
        rect.addObserver(new Square());
        rect.setWidth(15);
        System.out.println(rect.toString());
        rect.setHeight(54);
        System.out.println(rect.toString());

    }
}
