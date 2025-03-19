package TASKS.LAB05.zadaniadomowe;

public class DaneStudentow {
    public void DaneStudentowRun() {
        Student student1 = new Student(new Osoba("Jan", "Kowalski", 90), 134939, "Informatyka",1);
        student1.wyswietlDane();

        Student student2 = new Student(new Osoba("Anna", "Nowak", 85), 134938, "Matematyka");
        student1.wyswietlDane();

        Student student3 = new Student(new Osoba("Dominik", "Kuraś", 21), 134937, 2);
        student3.wyswietlDane();

        Student student4 = new Student(new Osoba("Kamil", "Wrona",55),"Programowanie",5);
        student4.wyswietlDane();
    }
}
