package Chapter5.ObserverW;

/**
 * Created by Vitalii.Nedzelskyi on 11.11.2015.
 */
public class Perimetr extends OperationObserver {

    private float perimetr;

    public float valueChanged(Rectangle rectangle) {
        return perimetr = 2 * (rectangle.getHeight() + rectangle.getWidth());
    }
    @Override
    public String toString() {
        return "P = " + perimetr;
    }

}
