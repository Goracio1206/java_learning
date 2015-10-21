package Chapter4.Classes;

public class Car {
    private String model;
    private String color;
    private String type;
    private int price;
    private int fuel = 0;

    public Car(String model, String color, String type, int price, int fuel) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.fuel = fuel;
    }

    public Car() {}
    public Car(String model, String type, String color){
        this.model = model;
        this.type = type;
        this.color = color;
    }

    public void drive() {
        System.out.println("Drive car");
    }
    public void charge(int liters) {
        this.fuel = liters;
    }

    public Cycle changeCycle(Cycle cycle) {
        return new Cycle(cycle.getDiametr(), 3);
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car model: " + this.model + "\n"
                + "Car color: " + this.color + "\n"
                + "Car type: " + this.type + "\n"
                + "Car price: " + this.price + "\n"
                + "Fuel capacity: " + this.fuel + "L";
    }
}