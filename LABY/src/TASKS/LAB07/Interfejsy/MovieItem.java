package TASKS.LAB07.Interfejsy;

public class MovieItem {
/*
    stałą definiujemy za pomocą
    połączenia dwóch słów kluczowych static final.
    Dodatkowo nazwa stałej powinna być pisana dużymi
    literami (w razie nazwy złożonej z kilku członów - rozdzielamy je
    znakiem podkreślenia _
                    */

    public static final String LABEL = "Default item name";

/*
    Stałą wartość możemy zainicjować wartością tylko w trakcie tworzenia. Możemy to zrobić albo od razu
    w polu, albo w konstruktorze. Nie możemy później zmienić takiej wartości. Przypisanie nowej wartości
    zakończy się błędem kompilacji.

   public void updateLabel() {
        this.LABEL = "Default item name created by JavAPPa"; //nie skompiluje się
    }
    */

}
