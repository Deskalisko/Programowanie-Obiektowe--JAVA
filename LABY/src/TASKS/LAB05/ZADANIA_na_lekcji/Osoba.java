package TASKS.LAB05.ZADANIA_na_lekcji;

public class Osoba {
    //definicja pól
    private String imie;
    private String nazwisko;
    private int wiek;

    //definicja konstruktorów
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    //definicja metod
    public void displayInfo() {
        System.out.println("Imię: " + imie + ", Nazwisko: " + nazwisko + ", Wiek: " + wiek);
    }
}
