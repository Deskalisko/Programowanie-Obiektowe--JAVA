package TASKS.LAB06.flota_pojazdow;

public class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String brand, String model, int year, int maxSpeed, Engine engine, FuelTank fueltank, int passengerCapacity) {
        super(brand, model, year, maxSpeed, engine, fueltank);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pojemność pasażerska: " + passengerCapacity);
    }

}
