package Chapter5.AbstractFactory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public abstract class BaseFactory {
    public abstract Circle createCircle(double radius);
    public abstract Triangle createTriangle(double a, double b );
}
