package TASKS.LAB06.flota_pojazdow;

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity, double currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public void refuel(double amount) {
        if(currentLevel + amount > capacity){
            System.out.println("Nie udało się zatankować paliwa. Poziom paliwa jest już pełny.");
            // Zatrzymujemy metodę refuel() w przypadku niepowodzenia załadowania paliwa.
        }else{
            currentLevel += amount;
            if (currentLevel > capacity) {
                currentLevel = capacity;
            }
            System.out.println("Załadowano " + amount + " litrów paliwa. Poziom paliwa wynosi: " + currentLevel + " / " + capacity + " l.");
        }
    }
    public void consume(double amount) {
        if(amount > currentLevel){
            System.out.println("Nie wystarczająca ilość paliwa. Aktualny poziom paliwa wynosi: " + currentLevel );

        }else {
            currentLevel -= amount;
            System.out.println("Zużyto " + amount + " litrów paliwa. Pozostało paliwa : " + currentLevel);
        }
    }

    public void displayInfo(){
        System.out.println("Poziom paliwa wynosi: " + currentLevel + " / "+capacity + " l.  Pojemność zbiornika: " + capacity + " l. ");
    }
}



//Kompozycja: Klasa FuelTank (Zbiornik paliwa)
//Powinna zawierać:
//        •
//capacity (pojemność zbiornika)
//•
//currentLevel (aktualny poziom paliwa)
//•
//Metody refuel(double amount) (zatankowanie) i consume(double amount) (zużycie paliwa).
