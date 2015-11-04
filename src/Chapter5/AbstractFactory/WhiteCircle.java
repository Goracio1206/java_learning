package Chapter5.AbstractFactory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public class WhiteCircle extends Circle {
    public WhiteCircle(double radius){
        this.radius = radius;
        color = "White";
    }

    public void square() {
        double s = Math.PI * Math.pow(radius, 2);
        System.out.println(color + " Circle" + "  Square = " + s);
    }

}
