package Compozitie.Exercitiu4;

public class Main {

// Exercitiu 4 - Creati clasa Tyre cu fieldul int size; Creati clasa Engine cu fieldul capacity;
// Creati clasa Car cu fieldurile String brand, string model, Engine engine, Tire tire1, Tire tire 2, Tire tire3, Tire tire4, Tire exchangeTire;
// Toate anvelopele masinii trebuie sa fie de aceeasi marime la initializare, daca nu se va afisa mesaj corespunzator;
// Generati 3 masini, fiecare cu piese diferite apoi printati detaliile acestora.

    public static void main(String[] args) {

        Car car1 = new Car("Skoda", "Rapid", new Engine(1600),      // Initializam o masina cu aceeasi dimensiune a anvelopelor
                new Tire(50), new Tire(50), new Tire(50), new Tire(50), new Tire(50));
        System.out.println(car1);     // Printam la consola prima masina

        Car car2 = new Car("Ford", "Fiesta", new Engine(1000),      // Initializam o masina cu dimensiuni diferite a anvelopelor
                new Tire(50), new Tire(60), new Tire(55), new Tire(50), new Tire(40));
        System.out.println(car2);    // Printam la consola cea de-a doua masina
    }
}