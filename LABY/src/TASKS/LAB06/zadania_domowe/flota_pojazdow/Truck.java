package TASKS.LAB06.zadania_domowe.flota_pojazdow;

public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(String marka, String model, int rokProdukcji, int maxSpeed, Engine engine, FuelTank fueltank, int loadCapacity) {
        super(marka, model, rokProdukcji, maxSpeed, engine, fueltank);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pojemność załadunkowa "+ loadCapacity + " t");
    }
}
