package TASKS.LAB07.Abstrakcje;

public class Prostokat extends Figura{
    public double a,b;
    public double Pole() {
        return a*b;
    }
    public double Obwod() {
        return 2*(a+b);
    }
}
