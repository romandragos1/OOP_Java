package OverloadingVsOverriding.Exercitiu2;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Creati clasa Person care va avea un nume si posibilitatea de a manca - metoda eat();
// Supraincarcati metoda eat() pentru a primi ca parametri 1 aliment, 2 alimente si 3 alimente de tip String, apoi afisati un mesaj corespunzator
// la apelarea fiecareia.

        Person person = new Person("Dragos Roman");           // Initializam o persoana
        person.eat("Chips");                                 // Apelam metoda eat folosind Overloading
        person.eat("Fish", "Chips");
        person.eat("Fish", "Chips", "Salad");
    }
}
