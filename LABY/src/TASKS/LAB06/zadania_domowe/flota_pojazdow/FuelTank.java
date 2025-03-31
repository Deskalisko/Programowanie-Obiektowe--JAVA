package TASKS.LAB06.zadania_domowe.flota_pojazdow;

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity, double currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public void refuel(double amount) {
        if(currentLevel + amount > capacity) {
            System.out.println("Nie można zatankować tyle paliwa, ponieważ przekroczono maksymalny poziom paliwa w zbiorniku");
        }else{
            currentLevel += amount;
            System.out.println("Zatankowano " + amount + " litrów paliwa. Poziom paliwa wynosi: " + currentLevel + " / " + capacity);
        }
    }

    public void consume(double amount) {
        if(amount > currentLevel) {
            System.out.println("Nie można spalić tyle paliwa, ponieważ nie masz wystarczającej ilości paliwa");
        }
        else {
            currentLevel -= amount;
            System.out.println("Spalono " + amount + " litrów paliwa. Poziom paliwa wynosi: " + currentLevel + " / " + capacity);
        }
    }

    public void displayInfo(){
        System.out.println("Poziom paliwa wynosi: " + currentLevel + " / " + capacity);
    }


}
