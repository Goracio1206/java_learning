package Chapter5.Decorator;

/**
 * Created by Vitalii.Nedzelskyi on 09.11.2015.
 */
public class CarDriverAndForwardingAgent extends DriverDocorator {

    public CarDriverAndForwardingAgent(Driver driver) {
        super(driver);
    }

    private void addedBehaviourTwo() {
        System.out.println("I am a Forwarding Agent");
    }

    public void drive() {
        driver.drive();
        addedBehaviourTwo();
    }
}
