package TASKS.LAB06.zadania_domowe.zad3;

public class Ksiazka {
    private String tytul;
    private String autor;
    private String wydawca;
    private int rokWydania;
    private int liczbaStron;
    private int cena;

    public Ksiazka(String tytul, String autor, String wydawca, int rokWydania, int liczbaStron, int cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawca = wydawca;
        this.rokWydania = rokWydania;
        this.liczbaStron = liczbaStron;
        this.cena = cena;
    }

    public void info() {
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Wydawca: " + wydawca);
        System.out.println("Rok wydania: " + rokWydania);
        System.out.println("Liczba stron: " + liczbaStron);
        System.out.println("Cena: " + cena + " zł");
    }


}
