package Chapter5.AbstractFactory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public class BlackTriangle extends Triangle {

    public BlackTriangle(double a, double b) {
        this.a = a;
        this.b = b;
        color = "Black";
    }

    public void square() {
        double s = 0.5 * a * b;
        System.out.println(color + " Triangle" + "  Square = " + s);
    }
}
