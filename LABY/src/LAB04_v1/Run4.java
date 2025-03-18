package LAB04_v1;

import LAB02.InputData;

public class Run4 {
    public void RunMain() {
        MENU();
    }
    InputData input=new InputData();

    private void MENU() {
        System.out.println("--- MENU ---");
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("5. Zadanie 5");
        System.out.println("6. Zadanie 6");
        System.out.println("7. Zadanie 7");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");

        int choice = input.InputInt();
        switch (choice) {
            case 1:
                zadanie1RUN();
                break;
            case 2:
                zadanie2RUN();
                break;
            case 3:
                zadanie3RUN();
                break;
            case 4:
                Zadanie4RUN();
                break;
            case 5:
                Zadanie5RUN();
                break;
            case 6:
                Zadanie6RUN();
                break;
            case 7:
                Zadanie7RUN();
                break;
            case 8:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                MENU();
        }
    }

    private void Zadanie7RUN() {
        TASK_LAB04.zadanie7();
    }

    private void Zadanie6RUN() {
        TASK_LAB04.zadanie6();
    }

    private void Zadanie5RUN() {
        TASK_LAB04.zadanie5();
    }

    private void Zadanie4RUN() {
        TASK_LAB04.zadanie4();
    }

    private void zadanie3RUN() {
        TASK_LAB04.zadanie3();
    }

    private void zadanie2RUN() {
        TASK_LAB04.zadanie2();
    }

    private void zadanie1RUN() {
        TASK_LAB04.zadanie1();
    }
}
