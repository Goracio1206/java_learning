package HomeWork.Chapter6;


/**
 * Created by Vitalii.Nedzelskyi on 13.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addPurchase("bla vasd",31);
        payment.addPurchase("Sweter", 50);
        payment.addPurchase("Jeans", 150);
        System.out.println(payment);
    }
}
