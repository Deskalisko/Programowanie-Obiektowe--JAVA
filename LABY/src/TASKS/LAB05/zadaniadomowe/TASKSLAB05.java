package TASKS.LAB05.zadaniadomowe;

import TASKS.LAB02.InputData;

public class TASKSLAB05 {
    public static void zadanie1() {
        System.out.println("===================Zadanie 1 :================\n");
        DaneOsoby dane = new DaneOsoby();
        dane.DaneOsobyRun();
    }

    public static void zadanie2() {
        System.out.println("===================Zadanie 2 :================\n");
        DaneStudentow dane = new DaneStudentow();
        dane.DaneStudentowRun();
    }

    public static void zadanie3() {
        /*Utwórz klasę (zawierającą metode main),
        która umożliwia wprowadzanie danych studenta z konsoli*/
        System.out.println("===================Zadanie 3 :================\n");
        WprowadzanieStudenta nowy = new WprowadzanieStudenta();
        nowy.WprowadzStudentaRun();
    }

    public static void zadanie4() {
        ZarzadzanieStudentami zarzadzanie = new ZarzadzanieStudentami();
        InputData input = new InputData();
        boolean dzialaj = true;
        while (dzialaj) {
            System.out.println("Co chcesz zrobić z studentami?");
            System.out.println("1. Wprowadź dane studenta");
            System.out.println("2. Edytuj dane studenta");
            System.out.println("3. Usuń dane studenta");
            System.out.println("4. Wyświetl dane studenta");
            System.out.println("5. Wyświetl wszystkich studentów");
            System.out.println("6. Wyświetl studenci w podanym zakresie");
            System.out.println("7. Wyjdź z programu");
            int choice = input.InputInt();
            switch (choice) {
                case 1:
                    System.out.println("Podaj indeks, pod którego chcesz dodać studenta");
                    int index = input.InputInt();
                    zarzadzanie.wprowadzStudenta(index);
                    break;
                case 2:
                    System.out.println("Podaj indeks studenta, który chcesz edytować");
                    int indexEdycja = input.InputInt();
                    if(indexEdycja>=0 &&indexEdycja<100){
                        zarzadzanie.wyswietlStudenta(indexEdycja);
                        System.out.println("Wprowadź nowe dane studenta:");
                        System.out.println("Podaj imię :");
                        input.InputString();
                        String imie=input.InputString();
                        System.out.println("Podaj nazwisko :");
                        String nazwisko = input.InputString();
                        System.out.println("Podaj specjalność");
                        String specjalnosc = input.InputString();
                        System.out.println("Podaj wiek");
                        int wiek = input.InputInt();
                        System.out.println("Podaj rok studiów");
                        int rokStudiow = input.InputInt();
                        zarzadzanie.edytujStudenta(indexEdycja,imie,nazwisko,wiek,specjalnosc, rokStudiow);
                        System.out.println("Obecne dane wyglądają tak:");
                        zarzadzanie.wyswietlStudenta(indexEdycja);
                    }else{
                        System.out.println("Błędny index");
                    }
                    break;

                case 3:
                    System.out.println("Podaj indeks studenta, który chcesz usunąć");
                    int indexUsuniecia = input.InputInt();
                    zarzadzanie.usunStudenta(indexUsuniecia);
                    break;

                case 4:
                    System.out.println("Podaj indeks studenta, który chcesz wyświetlić");
                    int indexWyswietlania = input.InputInt();
                    zarzadzanie.wyswietlStudenta(indexWyswietlania);
                    break;

                case 5:
                    zarzadzanie.wyswietlWszystkichStudentow();
                    break;

                case 6:
                    System.out.println("Podaj początek zakresu");
                    int poczatekZakresu = input.InputInt();
                    System.out.println("Podaj koniec zakresu");
                    int koniecZakresu = input.InputInt();
                    zarzadzanie.wyswietlZakresStudentow(poczatekZakresu, koniecZakresu);
                    break;

                case 7:
                    System.out.println("Zamknięcie programu.");
                    dzialaj = false;
                    break;
                default:
                    System.out.println("Zły wybór. Sprobuj jeszcze raz.");
                    break;
            }
        }
    }
}

/*zad4
W nowym pakiecie utwórz klasę zawierającą 100
elementową tablicę klasy Student(użyj klasy Student
        z zadania 2). Utwórz metodę tworzącą obiekt dla
każdego elementu tablicy i ustawiającą domyślne
wartości dla niego tj. dla typu liczbowego: 0, dla typu
        łańcuchowego: łańcuch pusty "". Utwórz metody
umożliwiające:        •
wprowadzanie danych studenta pod wybrany index tablicy,        •
edycję (nadpisanie danych studenta) spod wybranego indeksu,•
usunięcie danych studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi),
wyświetlenie obiektu o danym indeksie.•
wyświetlenie wszystkich obiektów,        •
wyświetlenie zakresu obiektów w podanym zakresie.
*/
