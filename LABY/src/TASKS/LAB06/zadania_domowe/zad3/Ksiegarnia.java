package TASKS.LAB06.zadania_domowe.zad3;

import java.util.ArrayList;
import java.util.List;

public class Ksiegarnia {
    private String nazwa;
    private List<Ksiazka> ksiazki;
    private List<Klient> klienci;

    public Ksiegarnia(String nazwa) {
        this.nazwa = nazwa;
        this.ksiazki = new ArrayList<>();
        this.klienci = new ArrayList<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
    }
    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void infoKsiegarnia(){
        System.out.println("Nazwa księgarni: "+ nazwa);
        System.out.println("Ilość ksiązek: "+ksiazki.size());
        System.out.println("Lista książek: \n");
        for(Ksiazka ksiazka : ksiazki){
            ksiazka.info();
        }
        System.out.println("Lista klientow: \n");
        for(Klient klient : klienci){
            klient.wyswietlInfo();
        }


    }

}
