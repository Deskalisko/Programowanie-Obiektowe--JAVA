package TASKS.LAB07.Abstrakcje;

public abstract class Example {
    public static final double PI = 3.14159; //deklaracja stałej PI - musimy użyć final, aby nie mógłaby być zmieniona - inaczej wyrzuci się błąd
    abstract String Something(); // deklaracja abstrakcyjna metody Something() - musimy użyć abstract, aby mógłaby być implementowana w pochodnych klasach
    public void Message() {//zwykła metoda Message()
        System.out.println("Witaj w przykładzie!"); // metoda wypisująca wiadomość
    }
}
