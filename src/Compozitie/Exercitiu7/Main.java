package Compozitie.Exercitiu7;

public class Main {

    public static void main(String[] args) {

// Exercitiu 7 - Creati clasa Monitor cu proprietatile String brand, int diagonala si int price;
// Creati clasa Keyboard cu proprietatile String brand si int price;
// Creati clasa Mouse cu proprietatile String brand, String colour si int price;
// Creati clasa Calculator cu proprietatile String brand, int price, Mouse mouse, Keyboard keyboard si Monitor monitor;
// Clasa Calculator va avea o metoda NonStatica printTotalPrice() care va calcula si va printa suma tuturor preturilor componentelor;
// Generati 2 calculatoare, fiecare cu piese diferite apoi printati preturile la consola.

        Calculator calculator1 = new Calculator("Samsung", 1800,            // Initializam 2 calculatoare
                new Mouse("A+", "Negru", 165),
                new Keyboard("Logitech", 320),
                new Monitor("Samsung", 18, 990));

        Calculator calculator2 = new Calculator("Apple", 3800,
                new Mouse("Apple", "Alb", 480),
                new Keyboard("Apple", 320),
                new Monitor("Apple", 18, 1990));

        calculator1.printTotalPrice();      // Printam la consoal pretul celor 2 calculatoare
        calculator2.printTotalPrice();
    }
}