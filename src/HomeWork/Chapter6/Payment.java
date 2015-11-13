package HomeWork.Chapter6;

import java.util.ArrayList;


/**
 * Created by Vitalii.Nedzelskyi on 13.11.2015.
 */
public class Payment {
    private static int totalprice;
    private ArrayList<Purchase> shopingList = new ArrayList<Purchase>();

    private class Purchase {
        private String name;
        private int price;

        public Purchase(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public String getName() {
           return name;
        }
        @Override
        public String toString() {
            return "Item: " + this.name + " cost:" + this.price;
        }
    }

    public void addPurchase(String name, int price) {
        totalprice += price;
        shopingList.add(new Purchase(name, price));
    }

    @Override
    public String toString() {
        String result = "";
        result = "Total price is: " + this.totalprice + "\n";
        for (Purchase elem: shopingList) {
            result +="\n" + elem.toString();
        }
        return result;
    }



}
