package ClaseSiObiecte.Exercitiu4;

public class Main {

    public static void main(String[] args) {

// Exercitiu 4 - Creat clasa Person cu urmatoarele atribute (campuri): nume, inaltime, greutate, energie, si functionalitatile
// (metodele): mananca, doarme, miscare. Fiecare metoda va schimba starea interna a persoanei.
// Creati un obiect de tip Person2 care va apela fiecare dintre cele 4 metode.
// Printati structura persoanei respective dupa apelarea fiecarei metode.

        Person persoana = new Person("Alexandru", 175, 84);       // Initializam o persoana
        persoana.mananca();              // Actiuni persoana
        persoana.mananca();
        persoana.doarme();
        persoana.miscare();
        persoana.miscare();

        System.out.println(persoana);   // Printam detaliile persoanei
    }
}