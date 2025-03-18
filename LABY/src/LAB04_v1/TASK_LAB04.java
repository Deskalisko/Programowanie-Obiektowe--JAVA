package LAB04_v1;
import LAB02.InputData;
import LAB03.RandomValue;

import java.util.Arrays;


public class TASK_LAB04 {

    public static void zadanie1() {
        InputData input = new InputData();
        System.out.println("Podaj początek przedziału:");
        int start = input.InputInt();
        System.out.println("Podaj koniec przedziału:");
        int end = input.InputInt();
        System.out.println("Podaj ilosc elementow ciągu: ");
        int ilosc = input.InputInt();
        RandomValue Rand = new RandomValue();
        //losowanie elementów tablicy i wyświetlanie ich
        int[] arr=Rand.RandValue(start, end, ilosc);
        System.out.println("Wylosowana tablica: \n");
        System.out.printf(Arrays.toString(arr));

        int sumafor=0,sumaforeach=0;
        double avgfor=0,avgforeach=0;
        //petla for
        for(int i=0; i<arr.length; i++){
            sumafor+=arr[i];
        }
        avgfor=((double) sumafor /arr.length);
        System.out.println("\nSuma dla petli for: " + sumafor);
        System.out.println("\nSrednia dla petli for: " + avgfor);

        //petla foreach
        for(int liczba:arr){
            sumaforeach+=liczba;
        }
        avgforeach=((double) sumaforeach /arr.length);
        System.out.println("\nSuma dla petli foreach: " + sumaforeach);
        System.out.println("\nSrednia dla petli foreach: " + avgforeach);

    }

    public static void zadanie2() {
    }

    public static void zadanie3() {
    }

    public static void zadanie4() {
    }

    public static void zadanie5() {
    }

    public static void zadanie6() {
    }

    public static void zadanie7() {

    }
}
