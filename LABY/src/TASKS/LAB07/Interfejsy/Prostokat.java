package TASKS.LAB07.Interfejsy;

public class Prostokat implements FiguraGeometryczna{
    private double a;
    private double h;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double Pole() {
        return a * h;
    }
    public double Obwod() {
        return 2 * (a + h);
    }
}
