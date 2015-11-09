package Chapter5.Bridge.Abstraction;

import Chapter5.Bridge.Implementor.Color;

/**
 * Created by Vitalii.Nedzelskyi on 09.11.2015.
 */
public abstract class Shape {

    protected Color color;

    public Shape() {
        color = null;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void performWithColor();
}
