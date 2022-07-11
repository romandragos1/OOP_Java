package Constante.Exercitiu6;

public class Main {

    public static void main(String[] args) {

// Exercitiu 6 - Creati clasa Teacher cu proprietatile String name, int age si String subject;
// Un profesor nu isi va putea schimba niciodata materia predata;
// Initializati 2 profesori si printati la consola detaliile acestora.

        Teacher profesor1 = new Teacher("Negru Alexandru", 46, "Geografie");    // Initializam si cream 2 profesori
        Teacher profesor2 = new Teacher("Popa Livia", 51, "Matematica");

        System.out.println(profesor1);      // Printam la consola detaliile profesorilor
        System.out.println(profesor2);
    }
}
