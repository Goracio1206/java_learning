package HomeWork.Chapter5;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class Train extends Transport {

    public void calculate(Delivery delivery) {
        System.out.println("Price for Train is: " + price + "\n" + "It will take 1 day");
    }

    public Train(int price) {
        super(price);
    }

}
