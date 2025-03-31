package TASKS.LAB06.zadania_domowe.flota_pojazdow;

public class Engine {
    private int power;
    private String fuelType;


    public Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }


    public void startEngine() {
        System.out.println("Silnik uruchomiony.");
    }

    public void stopEngine() {
        System.out.println("Silnik zatrzymany.");
    }

    public void displayInfo() {
        System.out.println("Moc silnika: " + power + " kW");
        System.out.println("Rodzaj paliwa: " + fuelType);
    }

}
