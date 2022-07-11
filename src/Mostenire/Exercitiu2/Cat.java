package Mostenire.Exercitiu2;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void meows() {
        System.out.println("Pisica " + this.name + " miauna");
    }

    public void eat() {
        System.out.println("Pisica " + this.name + " mananca");
    }
}
