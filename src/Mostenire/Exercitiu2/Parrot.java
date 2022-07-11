package Mostenire.Exercitiu2;

public class Parrot extends Animal {

    public Parrot(String name, int age) {
        super(name, age);
    }

    public void talk(String whatToSay) {
        System.out.println("Papagalul " + this.name + " spune " + whatToSay + " " + whatToSay);
    }

    public void eat() {
        System.out.println("Papagalul " + this.name + " mananca");
    }
}
