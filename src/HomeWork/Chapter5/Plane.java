package HomeWork.Chapter5;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class Plane extends Transport {

    public void calculate(Delivery delivery) {
        System.out.println("Price for Plane is: " + price + "\n" + "It will take 7 hours");
    }

    public Plane(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "";
    }
}
