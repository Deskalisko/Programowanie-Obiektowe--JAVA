package TASKS.LAB05.zadaniadomowe;

/*Na podstawie zadania poprzedniego utwórz klasę Student,
która posiada następujące pola: imię,
nazwisko, nr_indeksu, nazwa specjalności, rok_studiow.
Dla pól dobierz odpowiedni typ danych.
Utwórz cztery przeciążenia konstruktorów dla tej klasy
(każda wersja konstruktora powinna
 przyjmować przynajmniej jeden parametr - nie
  tworzyć konstruktora pustego). Utwórz metodę
wyświetlającą dane o studencie. Utwórz cztery obiekty
klasy student, każdy korzystający z innego
przeciążenia konstruktora podczas tworzenia obiektu.
Dla każdego obiektu uruchom metodę
wyświetlającą dane.*/

public class Student {
    private Osoba osoba;
    private int nrAlbumu;
    private String specjalnosc;
    private int rokStudiow;

    //konstruktory

    public Student(Osoba osoba, int nrAlbumu, String specjalnosc, int rokStudiow) {
        this.osoba = osoba;
        this.nrAlbumu = nrAlbumu;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }

    //bez roku studiow
    public Student(Osoba osoba, int nrAlbumu, String specjalnosc) {
        this.osoba = osoba;
        this.nrAlbumu = nrAlbumu;
        this.specjalnosc = specjalnosc;
    }
    //bez specjalnosci
    public Student(Osoba osoba, int nrAlbumu, int rokStudiow) {
        this.osoba = osoba;
        this.nrAlbumu = nrAlbumu;
        this.rokStudiow = rokStudiow;
    }
    //bez nrAlbumu
    public Student(Osoba osoba, String specjalnosc, int rokStudiow) {
        this.osoba = osoba;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }

    public void wyswietlDane() {
        osoba.pokazDane();
        System.out.println("Nr albumu: " + nrAlbumu);
        System.out.println("Specjalnosc: " + specjalnosc);
        System.out.println("Rok studiow: " + rokStudiow);
        System.out.println();
    }
}
