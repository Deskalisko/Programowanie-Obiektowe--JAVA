package TASKS.LAB05.zadaniadomowe;

import TASKS.LAB02.InputData;

public class MenuLab05 {
    public void Uruchom() {
        Menu();
    }

    private void Menu() {
        InputData input= new InputData();
        System.out.println("--- Menu ---");
        System.out.println("1. Zadanie 1 ");
        System.out.println("2. Zadanie 2 ");
        System.out.println("3. Zadanie 3 ");
        System.out.println("4. Zadanie 4 ");
        System.out.println("0. Wyjście ");
        System.out.print("Wybierz opcję: ");
        int choice = input.InputInt();
        switch (choice) {
            case 1:
                zadanie1Run();
                break;
            case 2:
                zadanie2Run();
                break;
            case 3:
                zadanie3Run();
                break;
            case 4:
                zadanie4Run();
                break;
            case 0:
                System.out.println("Wyłączanie programu...");
                System.exit(0);
                break;
            default:
                System.out.println("Nieprawidłowa opcja!");
                Menu();
                break;
        }
    }

    private void zadanie4Run() {
        TASKSLAB05.zadanie4();
    }

    private void zadanie3Run() {
        TASKSLAB05.zadanie3();
    }

    private void zadanie2Run() {
        TASKSLAB05.zadanie2();
    }

    private void zadanie1Run() {
        TASKSLAB05.zadanie1();
    }
}
