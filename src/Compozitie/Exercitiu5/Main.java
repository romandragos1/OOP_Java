package Compozitie.Exercitiu5;

public class Main {

    public static void main(String[] args) {

// Exercitiu 5 - Creati clasa Heart cu metoda beat();
// Creati clasa Stomach cu proprietatea boolean needsFood;
// Creati clasa Brain cu proprietatea int iq;
// Creati clasa Human cu proprietatile String name, Heart heart, Stomach stomach, Brain brain si metodele eat(), read(), live();
// Fiecare metoda a persoanei va influenta starea sau comportamentul organelor acestuia;
// Creati un om, apelati metodele si printati constant starea acestuia.

        Human human = new Human("Dragos", new Heart(), new Stomach(), new Brain());     // Initializam o persoana

        System.out.println(human);      // Printam la consola starea persoanei

        human.eat();        // Persoana va efectua actiuni conform metodelor eat, read si live
        human.read();
        human.live();

        System.out.println(human);      // Printam din nou la consola starea persoanei
    }
}