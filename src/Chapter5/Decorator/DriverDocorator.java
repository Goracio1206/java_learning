package Chapter5.Decorator;

/**
 * Created by Vitalii.Nedzelskyi on 09.11.2015.
 */
public class DriverDocorator extends Driver {

    protected Driver driver;

    public DriverDocorator(Driver driver) {
        this.driver = driver;
    }

    public void drive() {
        driver.drive();
    }
}
