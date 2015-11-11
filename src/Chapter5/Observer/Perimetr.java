package Chapter5.Observer;

/**
 * Created by Admin on 11-Nov-15.
 */
public class Perimetr extends OperationalObserver {

    private float perimetr;

    public float valueChanged(Rectangle rectangle) {
        return perimetr  = 2 *  (rectangle.getWeight() + rectangle.getHeight());
    }

    @Override
    public String toString() {
    return "P = " + perimetr;
    }
}
