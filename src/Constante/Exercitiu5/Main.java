package Constante.Exercitiu5;

public class Main {

    public static void main(String[] args) {

// Exercitiu 5 - Creati clasa Student cu proprietatile String name, int year si String major, setate prin constructor;
// Odata ales un nume si un major pentru studenti, acestea nu vor mai putea fi modificate; Creati metoda passYear(),
// care modifica structura interna a unui student; Studentii pot fi in anii 1 - 4;
// Initiati un student boboc, dupa care faceti-l sa absolve facultatea.

        Student student = new Student("Dragos Roman", "Java");      // Initializam si cream un student in anul 1
        student.passYear();         // Studentul a trecut in anul 2
        student.passYear();         // Studentul a trecut in anul 3
        student.passYear();         // Studentul a trecut in anul 4
        student.passYear();         // Studentul a absolvit
    }
}
