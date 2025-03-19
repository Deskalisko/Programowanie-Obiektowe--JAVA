package TASKS.LAB05.zadaniadomowe;

import TASKS.LAB02.InputData;

public class WprowadzanieStudenta {
    public Student nowyStudent;
    public void WprowadzStudentaRun() {
        InputData input = new InputData();
        System.out.println("Podaj imię :");
        String imie = input.InputString();
        System.out.println("Podaj nazwisko :");
        String nazwisko = input.InputString();
        System.out.println("Podaj specjalność");
        String specjalnosc = input.InputString();
        System.out.println("Podaj wiek");
        int wiek = input.InputInt();
        System.out.println("Podaj nrAlbumu");
        int nrAlbumu = input.InputInt();
        System.out.println("Podaj rok studiów");
        int rokStudiow = input.InputInt();

        nowyStudent= new Student(new Osoba(imie,nazwisko,wiek),nrAlbumu,specjalnosc,rokStudiow);
        System.out.println("Dane studenta: " );
        nowyStudent.wyswietlDane();

    }
    public Student getNowyStudent() {
        return nowyStudent;
    }
}
