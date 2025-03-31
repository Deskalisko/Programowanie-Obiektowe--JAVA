package TASKS.LAB07.Interfejsy;

public interface FiguraGeometryczna {

    public String LABEL= "Moje figury geometryczne"; // stała
    double Pole();
    double Obwod();


/*    W Javie jest możliwość dodawania do intefejsów metod zawierających ciało. Metody te używają słowa
    kluczowego default i są nazywane metodami domyślnymi. Jako, że są one od razu zaimplementowane
            (nie są abstrakcyjne), nie jest wymagane dostarczanie ich implementacji w klasach dziedziczących. W
    razie potrzeby mogą być one nadpisywane w tych klasach.*/

    default String getFullName(){
        return "Interfejs:Figura geometryczna";
    }


}
