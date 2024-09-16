package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketCapacity; // in cubic meters
    private double maxReach;

    public Excavator() {
    }

    public Excavator(double bucketCapacity, double maxReach, String name, String color) {
        super.setName(name);
        super.setColor(color);
        this.bucketCapacity = bucketCapacity;
        this.maxReach = maxReach;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
