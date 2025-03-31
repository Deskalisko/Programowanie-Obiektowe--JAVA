package TASKS.LAB07.Lekcja;

import TASKS.LAB06.zadania_domowe.zad1.Punkt;

//deklaracja klasy abstrakcyjnej
public class Figura{
	
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	
	
	Figura(){
		punkt = new Punkt(0,0);
	}
	Figura(String kolor){
		this.kolor=kolor;
	}
	Figura(Punkt punkt){
		this.punkt=punkt;
	}
	String getKolor(){
		return kolor;
	}
	//metody abstrakcyjne
	
	
	}
