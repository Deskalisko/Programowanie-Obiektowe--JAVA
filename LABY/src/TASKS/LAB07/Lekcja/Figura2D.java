package TASKS.LAB07.Lekcja;

public class Figura2D implements FiguraGeometryczna{

    double a=3;

    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return 4*a;
    }
}
