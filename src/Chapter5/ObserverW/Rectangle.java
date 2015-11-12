package Chapter5.ObserverW;

import java.util.*;

/**
 * Created by Vitalii.Nedzelskyi on 11.11.2015.
 */
public class Rectangle {
    private float width;
    private float height;
    private ArrayList<OperationObserver> observerList = new ArrayList<OperationObserver>();

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public void addObserver(OperationObserver observer) {
        observerList.add(observer);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
        notifyObserver();
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
        notifyObserver();
    }

    private void notifyObserver() {
        Iterator it  =  observerList.iterator();
        while (it.hasNext()) {
            ((OperationObserver) it.next()).valueChanged(this);
        }
    }

    @Override
    public String toString() {
        String s = "";
        Iterator it = observerList.iterator();
        while (it.hasNext()) {
            s = s + ((OperationObserver) it.next()).toString() + "\n";
        }
        return s;
    }
}
