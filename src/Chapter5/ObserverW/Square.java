package Chapter5.ObserverW;

/**
 * Created by Vitalii.Nedzelskyi on 11.11.2015.
 */
public class Square extends OperationObserver {
    private float square;

    public float valueChanged(Rectangle rectangle) {
        return square = rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public String toString() {
        return "S = " + square;
    }
}
