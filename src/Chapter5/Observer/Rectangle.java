package Chapter5.Observer;

import java.util.*;

/**
 * Created by Admin on 11-Nov-15.
 */
public class Rectangle {
    private float height;
    private float weight;
    private ArrayList<OperationalObserver> operate = new ArrayList<OperationalObserver>();

    public Rectangle(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public void addObserver(OperationalObserver oper) {
        operate.add(oper);
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        notifyObserver();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
        notifyObserver();
    }

    private void notifyObserver() {
        Iterator it = operate.iterator();
        while (it.hasNext()) {
            ((OperationalObserver) it.next()).valueChanged(this);
        }
    }

    @Override
    public String toString() {
        String s = "";
        Iterator it = operate.iterator();
        while (it.hasNext()) {
            s = s + it.next().toString() + "\n";
        }
        return s;
    }
}
