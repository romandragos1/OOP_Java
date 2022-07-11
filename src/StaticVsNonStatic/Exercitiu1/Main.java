package StaticVsNonStatic.Exercitiu1;

public class Main {

    public static void main(String[] args) {

// Exercitiu 1 - Creati clasa Student. Studentul va avea un int id si un String name;
// Suprascrieti metoda toString pentru a afisa toate detaliile studentulu;
// Creati 10 studenti, fiecare cu id unic care sa fie incrementat in momentul initializarii. Printati studentii.

        Student student1 = new Student("Blandu Iulian");       // Initializam 10 studenti cu id unic
        Student student2 = new Student("Parau Valentina");
        Student student3 = new Student("Comsa Aurel");
        Student student4 = new Student("Tudor Valentin");
        Student student5 = new Student("Stefan Marius");
        Student student6 = new Student("Robu Robert");
        Student student7 = new Student("Neagu Vasile");
        Student student8 = new Student("Pop Gheorghita");
        Student student9 = new Student("Lumanare Ana");
        Student student10 = new Student("Busa Cristina");

        System.out.println(student1);       // Printam studentii la consola
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student8);
        System.out.println(student9);
        System.out.println(student10);
    }
}