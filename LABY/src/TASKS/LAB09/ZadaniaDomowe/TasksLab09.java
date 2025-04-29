package TASKS.LAB09.ZadaniaDomowe;

import java.util.*;

public class TasksLab09 {
    public static void zadanie1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imiona ----wpisz ( - ) aby zakończyć)");
        List<String> name = new ArrayList<>();
        while (true) {
            String imie = scanner.nextLine();
            if (imie.equals("-")) {
                break;
            }
            name.add(imie);
        }
//        for (String ime : name) {
//            System.out.println(ime);
//        }

        Set<String> unique = new HashSet<>(name);
        System.out.println("Liczba unikalnych imion: "+unique.size());
    }

    public static void zadanie2() {
    }

    public static void zadanie3() {
    }

    public static void zadanie4() {
    }

    public static void zadanie5() {
    }
}
