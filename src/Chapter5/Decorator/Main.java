package Chapter5.Decorator;

/**
 * Created by Vitalii.Nedzelskyi on 09.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Driver carDriver = new CarDriver();
        Main runner = new Main();
        runner.doDrive(carDriver);
        runner.doDrive(new BusDriver(carDriver));
        runner.doDrive(new CarDriverAndForwardingAgent(carDriver));
        BusDriver bus = new BusDriver(carDriver);
        bus.drive();

    }

    public void doDrive(Driver driver) {
        driver.drive();
    }
}
