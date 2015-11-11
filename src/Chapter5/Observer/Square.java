package Chapter5.Observer;

/**
 * Created by Admin on 11-Nov-15.
 */
public class Square extends OperationalObserver {

    private float square;

    public float valueChanged(Rectangle rectangle) {
        return square = rectangle.getHeight() * rectangle.getWeight();
    }

    @Override
    public String toString() {
        return "S = " + square;
    }
 }
