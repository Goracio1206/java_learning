package Chapter5.Bridge.Abstraction;

import Chapter5.Bridge.Implementor.Color;

/**
 * Created by Vitalii.Nedzelskyi on 09.11.2015.
 */
public class Triangle extends Shape{
    public Triangle(Color color) {
        setColor(color);
    }

    public void performWithColor() {
        System.out.println("Performing in Triangle Class");
        color.useBrush();
    }
}
