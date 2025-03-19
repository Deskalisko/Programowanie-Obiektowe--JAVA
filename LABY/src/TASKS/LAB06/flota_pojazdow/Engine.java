package TASKS.LAB06.flota_pojazdow;

public class Engine {
    private int power;
    private String fuelType;

    public Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }

    public void startEngine(){
        System.out.println("Silnik uruchomiony.");
    }

    public void displayInfo(){
        System.out.println("Silnik o mocy: " + power + " kW,\n Typ paliwa: " + fuelType);
    }


}
