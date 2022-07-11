package Constante.Exercitiu3;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Leul " + this.name + " face ROAAAAR");
    }
}
