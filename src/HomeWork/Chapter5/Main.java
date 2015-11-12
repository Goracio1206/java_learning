package HomeWork.Chapter5;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Transport car = new Car(700);
        Delivery del = new Delivery();
        car.calculate(del);

        Transport plane = new Plane(500);
        Transport train = new Train(300);
        Transport plane1 = new Plane(100);

        plane.calculate(del);
        plane1.calculate(del);
        plane.calculate(del);
        System.out.println(plane.price);
        System.out.println(plane1.price);

    }
}
