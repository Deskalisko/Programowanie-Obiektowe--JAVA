package TASKS.LAB07.Lekcja;

public class lekcja_main {
    public static void main(String[] args) {
//        Figura figura = new Kwadrat("Kwadrat");
//        //figura.Obwod();
//        //figura.Pole();
//        figura.view();
//
//
//        Figura figura1 = new Prostoakt("Prostkąt");
//        figura1.view();

        FiguraGeometryczna figuraGeometryczna = new Figura2D();
        System.out.println(figuraGeometryczna.Obwod());
        System.out.println(figuraGeometryczna.Pole());
    }
}
