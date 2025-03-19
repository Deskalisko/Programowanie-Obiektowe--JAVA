package TASKS.LAB06.flota_pojazdow;

public class ZADRUN {
    public void RunMain() {
        //testowanie rozwiązania
        Engine carEngine = new Engine(150,"Benzyna");
        FuelTank carFuelTank = new FuelTank(100,30);
        Car myCar = new Car("Toyota", "Corolla",
                2020, 180,carEngine, carFuelTank,5);

        Engine truckEngine = new Engine(400,"Diesel");
        FuelTank truckFuelTank = new FuelTank(500,150);
        Truck myTruck = new Truck("Ford", "F-150",
                2015, 90, truckEngine, truckFuelTank,3);


        System.out.println("=================Informacje o aucie==============");
        myCar.displayInfo();
        carFuelTank.consume(10);
        carFuelTank.refuel(50);
        myCar.displayInfo();

    }
}
