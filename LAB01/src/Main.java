import Tasks.Run;

public class Main {
    public static void main(String[] args) {
        //zadania poza main - tasks
        Run run=new Run();// utworzyc w run tasks
        run.RunMain();//utworzyc runmain w run
    }
}












//lesson
//import java.util.Scanner;
//
//public class Main{ // wejsc do ustawien - editor - general - scrool
//    public static void main(String[] args) {
//        System.out.println("Wszystko");// wyswietlenie na ekran program
//        System.out.println("Hello wszystkim");
//
//        //wpisać skrót so
//        System.out.println("ADADA");
//        int a=5,b; //deklaracja zmiennych
//        System.out.println("Wartosc a= "+a);
//        System.out.println("Wartosc a^2= "+Math.pow(a,2));// math pow - podniesienie do potegi
//
//
//        //czytanie danych z klawiatury - input data
//        Scanner input = new Scanner(System.in);        //jak scanner na czerwono to ALT ENTER   - importuje biblioteki
//        System.out.println("Podaj wartosc b: ");
//        b=input.nextInt();
//        System.out.println("Wartosc b= "+b);
//        System.out.println("Wartosc b^2= "+Math.pow(b,2));
//
//
//
//        //string imie - tekst
//        System.out.println("Podaj imie:");
//        String imie=input.next();
//        System.out.println("Witaj: "+imie);
//
//
//        System.out.println("Podaj float:");//floaty
//        float a1=input.nextFloat(); // trzeba pisać z przecinkiem
//        System.out.println("Float =  "+a1);
//
//
//    }
//
//}