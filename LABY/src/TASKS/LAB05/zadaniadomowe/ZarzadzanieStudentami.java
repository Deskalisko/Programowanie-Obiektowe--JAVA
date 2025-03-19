package TASKS.LAB05.zadaniadomowe;

public class ZarzadzanieStudentami {
    //tablica 100 elementowa studentów
    private Student[] studenci = new Student[100];

    public ZarzadzanieStudentami(){
        for (int i = 0; i < studenci.length; i++) {
            studenci[i] = new Student(new Osoba("","",0),0,"",0);
        }

    }
    public void wprowadzStudenta(int index){
        if(index >= 0 && index < studenci.length){
            WprowadzanieStudenta wprowadzenie = new WprowadzanieStudenta();
            wprowadzenie.WprowadzStudentaRun(); // uruchomienie metody wprowadzania danych studenta
            studenci[index] = wprowadzenie.getNowyStudent();//pobranie nowego studenta
            System.out.println("Dane studenta zostały wprowadzone i znajdują się pod indexem: "+index);
        }else{
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void edytujStudenta(int index, String imie, String nazwisko,int wiek, String specjalnosc, int rokStudiow){
        if(index >= 0 && index < studenci.length){
            studenci[index]= new Student(new Osoba(imie,nazwisko,wiek),index,specjalnosc,rokStudiow);
            System.out.println("Dane studenta zostały zaktualizowane pod indexem: "+index);
        }else{
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void usunStudenta(int index){
        if(index >= 0 && index < studenci.length){
            studenci[index] = new Student(new Osoba("","",0),0,"",0);
            System.out.println("Student został usunięty pod indexem: "+index);
        } else{
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void wyswietlStudenta(int index){
        if(index >= 0 && index < studenci.length){
            System.out.println("Student pod indexem: "+index);
            studenci[index].wyswietlDane();
        } else{
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void wyswietlWszystkichStudentow(){
        System.out.println("Lista wszystkich studentów:");
        for (int i = 0; i < studenci.length; i++) {
            System.out.println("Indeks "+i+": ");
            studenci[i].wyswietlDane();
        }
    }

    public void wyswietlZakresStudentow(int start, int end) {
        if (start >= 0 && end < studenci.length && start <= end) {
            System.out.println("Studentow w zakresie od indeksu " + start + " do " + end + ":");
            for (int i = start; i <= end; i++) {
                System.out.println("Indeks " + i + ": ");
                studenci[i].wyswietlDane();
            }
        } else {
            System.out.println("Nieprawidłowy zakres studentów");
        }
    }


}
