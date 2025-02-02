package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private double bladeCapacity;

    public Bulldozer() {
        super();
    }

    public Bulldozer(double bladeWidth, double bladeCapacity, String name, String color) {
        super(name, color);
        this.bladeWidth = bladeWidth;
        this.bladeCapacity = bladeCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
