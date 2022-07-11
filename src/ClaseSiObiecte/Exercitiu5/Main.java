package ClaseSiObiecte.Exercitiu5;

public class Main {

    public static void main(String[] args) {

// Exercitiu 5 - Creati clasa Masina cu urmatoarele atribute (campuri): String brand, String model, int year, boolean on si functionalitatile
// (metodele): printDetails, startEngine si stopEngine.
// Metodele startEngine si stopEngine vor face lucruri diferite in functie de starea interna a masinii, stare pe care de asemenea o va modifica.
// Creati o masina si apelati metodele acesteia.

        Masina renault = new Masina("Renault Megane", 2020);    // Initializam o masina
        renault.stopEngine();       // Oprim motorul masinii
        renault.startEngine();      // Pornim motorul masinii
        renault.stopEngine();       // Oprim motorul masinii
        renault.printDetails();     // Printam detaliile masinii
    }
}
