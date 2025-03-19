package TASKS.LAB05.zadaniadomowe;

public class DaneOsoby {
    public void DaneOsobyRun() {
        //tworzenie trzech obiektów klasy Osoba przy użyciu konstruktorów
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 30);
        Osoba osoba2 = new Osoba("Anna", 15);
        Osoba osoba3 = new Osoba();

        System.out.println("Dane osoby 1:");
        osoba1.pokazDane();
        System.out.println("Dane osoby 2:");
        osoba2.pokazDane();
        System.out.println("Dane osoby 3:");
        osoba3.pokazDane();

    }
}
