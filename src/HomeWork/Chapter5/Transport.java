package HomeWork.Chapter5;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public abstract class Transport {

    protected int price;

    public Transport(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void calculate(Delivery delivery);
}
