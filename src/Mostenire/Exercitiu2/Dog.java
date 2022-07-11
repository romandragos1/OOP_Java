package Mostenire.Exercitiu2;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Cainele " + this.name + " latra");
    }

    public void eat() {
        System.out.println("Cainele " + this.name + " mananca");
    }
}
