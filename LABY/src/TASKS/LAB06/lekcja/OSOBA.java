package TASKS.LAB06.lekcja;

public class OSOBA {
    private String imie;
    private String PESEL;
    public int a;
    public int b;
    public OSOBA(String imie, String PESEL) {
        this.imie=imie;
        this.PESEL=PESEL;
    }

    public void view(){
        System.out.println("Metoda z klasy OSOBA");
    }
}
