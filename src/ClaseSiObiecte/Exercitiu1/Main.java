package ClaseSiObiecte.Exercitiu1;

public class Main {

    public static void main(String[] args) {

// Exercitiu 1a - Creati o clasa numita Student cu variabila String name si variabila int age;
// Alocati valoarea age cu 22 si cea a numelui cu John prin crearea unui obiect al clasei Student;

// Exercitiu 1b - Modificati clasa Student adaugand un field String telephoneNumber. Creati metoda call care va primi ca parametru un student;
// Metoda va afisa urmatorul text: "Studentul X, avand numarul de telefon Y, a facut un call catre numarul de telefon Z";

        Student student1 = new Student("John", 22, "0748880148");       // Initializam studentul John

        student1.call("0755443322");        // Studentul John face un prim apel
        student1.call("0264.255.144");      // Studentul John face al doilea apel
    }
}
