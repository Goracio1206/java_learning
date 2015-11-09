package Chapter5.Bridge.Abstraction;

import Chapter5.Bridge.Implementor.Color;

/**
 * Created by Vitalii.Nedzelskyi on 09.11.2015.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        setColor(color);
    }

    public void performWithColor() {
        System.out.println(" Parforming in Circle Class");
        color.useBrush();
    }


}
