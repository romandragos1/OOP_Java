package Constante.Exercitiu3;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Pisica " + this.name + " face MIAU MIAU");
    }
}
