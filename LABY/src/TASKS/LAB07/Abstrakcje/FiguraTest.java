package TASKS.LAB07.Abstrakcje;

public class FiguraTest {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat();
        kwadrat.a=15;
        System.out.println("A = "+ kwadrat.a);
        System.out.println("Pole kwadratu: " + kwadrat.Pole());
        System.out.println("Obwód kwadratu: " + kwadrat.Obwod());

        Prostokat prostokat = new Prostokat();
        prostokat.a=10;
        prostokat.b=5;
        System.out.println("A = "+ prostokat.a);
        System.out.println("B = "+ prostokat.b);
        System.out.println("Pole prostokata: " + prostokat.Pole());
        System.out.println("Obwód prostokata: " + prostokat.Obwod());
    }
}
