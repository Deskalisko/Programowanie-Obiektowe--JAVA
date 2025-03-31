package TASKS.LAB06.zadania_domowe.zad3;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private String telefon;

    public Klient(String imie, String nazwisko, String email, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.telefon = telefon;
    }

    public void wyswietlInfo(){
        System.out.println("Informacje o kliencie:  ");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Email: " + email);
        System.out.println("Telefon: " + telefon);
    }
}
