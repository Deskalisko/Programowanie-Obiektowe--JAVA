package TASKS.LAB06.lekcja;

public class student extends OSOBA {// do extends trzeba zrobic konstruktor, bo sypie bledem
    private int nrAlbumu;
    private String kierunek;
    //konstruktor - na bazie klasy studenta
    public student(String imie, String PESEL, int nrAlbumu, String kierunek) {
        super(imie, PESEL);//wbudowana metoda pozwala na wywołanie konstruktora klasy bazowej
        // super musi byc wywolana w konstrzuktorze jako pierrwsza
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
    }
    public void view(){
        super.view();// nadpisanie metody z klasy bazowej
        System.out.println("Pozostałe dane z klasy Student");
        System.out.println("Nr Albumu: " + nrAlbumu);
        System.out.println("Kierunek: " + kierunek);
    }
}
