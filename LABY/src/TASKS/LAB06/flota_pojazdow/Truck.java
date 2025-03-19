package TASKS.LAB06.flota_pojazdow;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, String model, int year, int maxSpeed, Engine engine, FuelTank fueltank, int loadCapacity) {
        super(brand, model, year, maxSpeed, engine, fueltank);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }


}
