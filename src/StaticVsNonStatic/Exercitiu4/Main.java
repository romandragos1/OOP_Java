package StaticVsNonStatic.Exercitiu4;

public class Main {

    public static void main(String[] args) {

// Exercitiul 4 - Creati clasa Person care va contine string firstName si string lastName;
// Gasiti o modalitate ca in orice punct al programului nostru sa putem afla cate obiecte de tip Person au fost initializate.

        Person person1 = new Person("Roman", "Dragos");         // Initializam 3 persoane
        Person person2 = new Person("Roman", "Florina");
        Person person3 = new Person("Roman", "Valentin");

        System.out.println("Au fost initializate un numar de " + Person.counter + " persoane");      // Printam la consola cate persoane au fost initializate

        Person person4 = new Person("Pop", "Ion");          // Initializam alte 3 persoane
        Person person5 = new Person("Popescu", "Ionel");
        Person person6 = new Person("Poparu", "Ioana");

        System.out.println("Au fost initializate un numar de " + Person.counter + " persoane");     // Printam la consola cate persoane au fost initializate
    }
}