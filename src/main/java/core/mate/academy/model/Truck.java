package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;
    private int numberOfAxles;

    public Truck() {
        super(null, null);
    }

    public Truck(double loadCapacity, int numberOfAxles, String name, String color) {
        super(name, color);
        super.setName(name);
        super.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
