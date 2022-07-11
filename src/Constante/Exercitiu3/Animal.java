package Constante.Exercitiu3;

public class Animal {

    String name;
    int hungerLevel;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animalul " + this.name + " scoate sunete");
    }

    public final void eat() {
        System.out.println("Animalul " + this.name + " mananca");
    }
}
