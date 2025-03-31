package TASKS.LAB06.zadania_domowe.zad3;

public class Podrecznik extends Ksiazka {
    private String przedmiot;
    private String poziom;

    public Podrecznik(String tytul, String autor, String wydawca, int rokWydania, int liczbaStron, int cena, String przedmiot, String poziom) {
        super(tytul, autor, wydawca, rokWydania, liczbaStron, cena);
        this.przedmiot = przedmiot;
        this.poziom = poziom;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Przedmiot: " + przedmiot);
        System.out.println("Poziom: " + poziom);
    }
}
