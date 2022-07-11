package Compozitie.Exercitiu2;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Creati clasa Person cu fieldurile String firstName, String lastName si bestFriend de tip Person;
// Creati metoda printFriendship in care fiecare persoana isi va printa prietenul cel mai bun dub forma "X este prietenul cel mai bun al lui Y"
// unde X si Y reprezinta doar firstName-ul persoanei respective.

        Person person1 = new Person("Roman", "Dragos", null);   // Initializam 3 persoane si alocam bestfriend doar ultimelor 2
        Person person2 = new Person("Pop", "Ion", person1);
        Person person3 = new Person("Palade", "Iulian", person2);

        System.out.println(person1);        // Printam la consola detaliile fiecarei persoane
        System.out.println(person2);
        System.out.println(person3);
    }
}