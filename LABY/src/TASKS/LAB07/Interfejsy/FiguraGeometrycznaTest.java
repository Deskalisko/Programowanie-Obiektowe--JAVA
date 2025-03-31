package TASKS.LAB07.Interfejsy;

public class FiguraGeometrycznaTest {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat();
        kwadrat.setBok(10);
        System.out.println("Pole kwadratu: " + kwadrat.Pole());
        System.out.println("Obwód kwadratu: " + kwadrat.Obwod());

        // default - metoda z figura geometryczna
        System.out.println(kwadrat.getFullName());

        Prostokat prostokat = new Prostokat();
        prostokat.setA(5);
        prostokat.setH(10);
        System.out.println("Pole prostokatu: " + prostokat.Pole());
        System.out.println("Obwód prostokatu: " + prostokat.Obwod());

    }
}
