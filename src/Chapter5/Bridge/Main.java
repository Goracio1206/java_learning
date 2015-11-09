package Chapter5.Bridge;

import Chapter5.Bridge.Abstraction.Circle;
import Chapter5.Bridge.Abstraction.Triangle;
import Chapter5.Bridge.Implementor.YellowColor;

/**
 * Created by Vitalii.Nedzelskyi on 09.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        YellowColor color = new YellowColor();
        new Triangle(color).performWithColor();
        new Circle(color).performWithColor();
    }
}
