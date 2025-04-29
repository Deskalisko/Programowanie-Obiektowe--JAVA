package TASKS.LAB06.flota_pojazdow;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected int maxSpeed;
    //składowa klasy
    protected Engine engine;
    protected FuelTank fueltank;

    public Vehicle(String brand, String model, int year, int maxSpeed, Engine engine, FuelTank fueltank) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.fueltank = fueltank;
    }

    public void displayInfo(){
        System.out.println("Marka: " + brand+"\tModel: " + model +
                "\tRok produkcji: " + year + "\tMaksymalna prędkość: "
                + maxSpeed + " km/h");
        engine.displayInfo();
        engine.startEngine();
        fueltank.displayInfo();
    }

}
