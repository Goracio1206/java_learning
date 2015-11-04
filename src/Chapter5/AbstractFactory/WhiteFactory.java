package Chapter5.AbstractFactory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public class WhiteFactory extends BaseFactory {

    public Circle createCircle(double radius) {
        return new WhiteCircle(radius);
    }

    public Triangle createTriangle(double a, double b) {
        return new WhiteTrtiangle(a, b);
    }
}
