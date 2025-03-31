package TASKS.LAB07.Interfejsy;

public class Kwadrat implements FiguraGeometryczna {
    private double bok;

    public void setBok(double bok) {
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public double Pole() {
        return Math.pow(bok, 2);
    }
    public double Obwod() {
        return 4 * bok;
    }


}
