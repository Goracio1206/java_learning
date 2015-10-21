package Chapter4;

import Chapter4.Classes.Car;
import Chapter4.Classes.Cycle;


public class Run {
    public static void main(String[] args){
        Car car = new Cycle("Skoda", "Liftback", "white", 19 , 3);

        System.out.println(car);
        System.out.println();
        System.out.println(car.getModel());
       car.drive();
    }
}
