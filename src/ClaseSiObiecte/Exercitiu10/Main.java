package ClaseSiObiecte.Exercitiu10;

public class Main {

    public static void main(String[] args) {

// Exercitiu 10 - Creati clasa Pencil care va contine atributele (campurile): String color, int remainingInk si functionalitatea (metoda) write()
// care va primi un parametru de tip String text.
// Culoarea pixului va fi primita ca parametru in constructor, iar orice pix initializat va avea 1000 remaining ink.
// Metoda write va consuma 1 remaining ink pentru fiecare litera / numar primite in parametru acesteia de tip String (fara tasta space).
// Initializati un pix, iar prin intermediul metodei write printati la consola un mesaj corespunzator.

        Pencil pencil = new Pencil("Albastru");                             // Initializam pixul
        pencil.write("Acest pix albastru este de o calitate premium");       // Incepem sa scriem cu pixul de la 1000 remaining ink
        System.out.println(pencil.remainingInk);                                 // Verificam remaining ink
    }
}