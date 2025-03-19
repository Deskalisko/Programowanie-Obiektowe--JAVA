package TASKS.LAB05.zadaniadomowe;
/*Utwórz klasę Osoba zawierającą pola imię nazwisko oraz wiek, konstruktor z 3 parametrami, dwoma
        (imię i wiek) oraz konstruktor bezparametrowy. Napisz metodę pokazDane() wypisującą dane osoby.
Następnie utwórz klasę DaneOsobe w której utworzysz 3 obiekty i klasy Osoba oraz wywołasz
odpowiednie metody i zainicjalizujesz odpowiednie pola.*/
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
//3 parameters
    public Osoba(String imie, String nazwisko, int wiek) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.wiek = wiek;
    }

    //2 parameters
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    //no parameters
    public Osoba(){
        this.imie = "";
        this.nazwisko = "";
        this.wiek = 0;
    }

    public void pokazDane() {
        System.out.println("Imię: " + imie + ", Nazwisko: " + nazwisko + ", Wiek: " + wiek);
    }
}
