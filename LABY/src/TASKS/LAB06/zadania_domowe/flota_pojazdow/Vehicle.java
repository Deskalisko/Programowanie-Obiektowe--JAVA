package TASKS.LAB06.zadania_domowe.flota_pojazdow;

public class Vehicle {
    private String marka;
    private String model;
    private int rokProdukcji;
    private int maxSpeed;
    private Engine engine;
    private FuelTank fueltank;

    public Vehicle(String marka, String model, int rokProdukcji, int maxSpeed, Engine engine, FuelTank fueltank) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.fueltank = fueltank;
    }

    public void displayInfo(){
        System.out.println("Informacje o pojazdzie:  \n");
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Maksymalna predkosc: " + maxSpeed + " km/h");
        System.out.println("Informacje o silniku:  \n");
        engine.displayInfo();
        System.out.println("Informacje o paliwie:  \n");
        fueltank.displayInfo();
        engine.startEngine();
        fueltank.displayInfo();
    }


}
