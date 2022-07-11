package Mostenire.Exercitiu2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Creati clasa Animal cu proprietatile String name, int age si metoda eat();
// Creati clasa copil Dog cu metoda bark() si eat();
// Creati clasa copil Cat cu metoda meows() si eat();
// Creati clasa copil Parrot cu metoda talk(String whatToSay) si eat();
// Creati 3 animale de fiecare rasa si adaugati-le in liste specifice;
// Faceti toti cainii sa latre, pisicile sa miaune si papagalii sa vorbeasca;
// Faceti ca toate animalele sa manance.

        Dog dog1 = new Dog("Max", 4);                   // Initializam cate 3 animale de fiecare tip si le adaugam in lista specifica
        Dog dog2 = new Dog("Luna", 6);
        Dog dog3 = new Dog("Charlie", 7);
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(       // Alta modalitate de a initializa cele 3 pisici si a le adauga in lista
                new Cat("Nobel", 2),
                new Cat("Leo", 5),
                new Cat("Bella", 8)
        ));

        ArrayList<Parrot> parrots = new ArrayList<>(Arrays.asList(
                new Parrot("Alfie", 1),
                new Parrot("Henry", 2),
                new Parrot("Gizmo", 2)
        ));

        for (Dog dog : dogs) {           // Facem ca toti cainii sa latre si sa manance
            dog.bark();
            dog.eat();
        }
        System.out.println("  ");

        for (Cat cat : cats) {           // Facem ca toate pisicile sa miaune si sa manance
            cat.meows();
            cat.eat();
        }
        System.out.println("  ");

        for (Parrot parrot : parrots) {          // Facem ca toti papagalii sa vorbeasca si sa manance
            parrot.talk("Ahoy");
            parrot.eat();
        }
    }
}