package Chapter5.AbstractFactory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public class WhiteTrtiangle extends Triangle {

    public WhiteTrtiangle(double a, double b) {
        this.a = a;
        this.b = b;
        color = "White";
    }

    public void square() {
        double s = 0.5 * a * b;
        System.out.println(color + " Triangle" + "  Square = " + s);
    }

}
