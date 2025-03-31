package TASKS.LAB06.zadania_domowe.flota_pojazdow;

public class Car extends Vehicle{
    private int passengersCapacity;

    public Car(String marka, String model, int rokProdukcji, int maxSpeed, Engine engine, FuelTank fueltank, int passengersCapacity) {
        super(marka, model, rokProdukcji, maxSpeed, engine, fueltank);
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pojemnośc pasażerska: " + passengersCapacity);
    }
}
