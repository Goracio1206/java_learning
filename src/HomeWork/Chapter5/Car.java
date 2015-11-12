package HomeWork.Chapter5;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class Car extends Transport {

    public void calculate(Delivery delivery) {
        System.out.println("Price for car is: " + price + "\n" + "It will take 3 days");
    }

    public Car(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "";
    }
}
