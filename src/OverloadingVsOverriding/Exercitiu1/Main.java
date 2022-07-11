package OverloadingVsOverriding.Exercitiu1;

public class Main {

    public static void main(String[] args) {

// Exercitiu 1 - Creati clasa ConsolePrinter, va avea metoda printText(), va primi ca parametru un String pe care il va printa la consola;
// Supraincarcati metoda printText() pentru a primi textul nostru, dar si numarul de printari dorit la consola.

        ConsolePrinter consolePrinter = new ConsolePrinter();                                  // Initializam un obiect de tip ConsolePrinter
        consolePrinter.printText("Text pentru diferentiere metode");                           // Overriding
        System.out.println(" ");
        consolePrinter.printText("Text pentru diferentiere metode", 5);   // Overloading
    }
}
