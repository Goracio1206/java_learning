package Chapter5.Decorator;

/**
 * Created by Vitalii.Nedzelskyi on 09.11.2015.
 */
public class BusDriver extends DriverDocorator {

    public BusDriver(Driver driver) {
        super(driver);
    }

    private void addedBehaviourOne() {
        System.out.println("I am a bus Dirver");
    }

    public void drive() {
        driver.drive();
        addedBehaviourOne();
    }

}
