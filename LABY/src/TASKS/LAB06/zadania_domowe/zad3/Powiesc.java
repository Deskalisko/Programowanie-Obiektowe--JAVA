package TASKS.LAB06.zadania_domowe.zad3;

public class Powiesc extends Ksiazka {
    private String gatunek;

    public Powiesc(String tytul, String autor, String wydawca, int rokWydania, int liczbaStron, int cena, String gatunek) {
        super(tytul, autor, wydawca, rokWydania, liczbaStron, cena);
        this.gatunek = gatunek;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Gatunek: " + gatunek);
    }
}
