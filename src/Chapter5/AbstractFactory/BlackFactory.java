package Chapter5.AbstractFactory;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BaseDVFactory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public class BlackFactory extends BaseFactory {
    public Circle createCircle(double radius) {
        return new BlackCircle(radius);
    }
    public Triangle createTriangle(double a, double b) {
        return new BlackTriangle(a, b);
    }
}
