package TASKS;
import TASKS.LAB07.zadania_domowe.MenuLab07;
import TASKS.LAB08.ZadaniaDomowe.MenuLab08;
import TASKS.LAB09.ZadaniaDomowe.MenuLab09;
import TASKS.LAB12.ZADANIA.TaskLab12;


import java.util.Scanner;

public class Run {
    public void RunMain() {
        MENU();
    }

    private void MENU() {
        System.out.println("Wybierz którego laba chcesz przeglądać:");
        System.out.println("1. Laboratorium 1");
        System.out.println("2. Laboratorium 2");
        System.out.println("3. Laboratorium 3");
        System.out.println("4. Laboratorium 4");
        System.out.println("5. Laboratorium 5");
        System.out.println("6. Laboratorium 6");
        System.out.println("7. Laboratorium 7");
        System.out.println("8. Laboratorium 8");
        System.out.println("9. Laboratorium 9");
        System.out.println("10. Laboratorium 10");
        System.out.println("11. Laboratorium 11");
        System.out.println("12. Laboratorium 12");
        System.out.println("15. Zakończ program");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                MenuLab01RUN();
                break;
            case 2:
                MenuLab02RUN();
                break;
            case 3:
                MenuLab03RUN();
                break;
            case 4:
                MenuLab04RUN();
                break;
            case 5:
                MenuLab05RUN();
                break;
            case 6:
                MenuLab06RUN();
                break;
            case 7:
                MenuLab07RUN();
                break;
            case 8:
                MenuLab08RUN();
                break;
            case 9:
                MenuLab09RUN();
                break;
            case 10:
                MenuLab10RUN();
                break;
            case 11:
                MenuLab11RUN();
                break;
            case 12:
                MenuLab12RUN();
                break;
            case 15:
                System.out.println("Program został zakonczony.");
                System.exit(0);
                break;
            default:
                System.out.println("Nieprawidłowa opcja.");
        }
    }

    private void MenuLab12RUN() {
        TaskLab12.Zadanie1();

    }

    private void MenuLab11RUN() {
        TASKS.LAB11.ZADANIA.MenuLab11 lab = new TASKS.LAB11.ZADANIA.MenuLab11();
        lab.Menu();
    }

    private void MenuLab10RUN() {
        TASKS.LAB10.Zadania.MenuLab10 lab = new TASKS.LAB10.Zadania.MenuLab10();
        lab.Menu();
    }

    private void MenuLab09RUN() {
        TASKS.LAB09.ZadaniaDomowe.MenuLab09 lab = new TASKS.LAB09.ZadaniaDomowe.MenuLab09();
        lab.MENU();
    }

    private void MenuLab08RUN() {
        MenuLab08 lab08 = new MenuLab08();
        lab08.Uruchom();
    }

    private void MenuLab07RUN() {
        MenuLab07 lab07 = new MenuLab07();
        lab07.Uruchom();
    }

    private void MenuLab06RUN() {
        TASKS.LAB06.zadania_domowe.MenuLab06 Lab06 = new TASKS.LAB06.zadania_domowe.MenuLab06();
        Lab06.Uruchom();

    }

    private void MenuLab01RUN() {
        TASKS.LAB01.MenuLab01 Lab01 = new TASKS.LAB01.MenuLab01();
        Lab01.Uruchom();
    }

    private void MenuLab02RUN() {
        TASKS.LAB02.MenuLab02 Lab02 = new TASKS.LAB02.MenuLab02();
        Lab02.Uruchom();
    }

    private void MenuLab03RUN() {
        TASKS.LAB03.MenuLab03 Lab03 = new TASKS.LAB03.MenuLab03();
        Lab03.Uruchom();
    }

    private void MenuLab04RUN() {
        TASKS.LAB04.MenuLab04 Lab04 = new TASKS.LAB04.MenuLab04();
        Lab04.Uruchom();
    }

    private void MenuLab05RUN() {
        TASKS.LAB05.zadaniadomowe.MenuLab05 Lab05 = new TASKS.LAB05.zadaniadomowe.MenuLab05();
        Lab05.Uruchom();
        
    }
}
