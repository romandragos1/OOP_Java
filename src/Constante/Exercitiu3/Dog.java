package Constante.Exercitiu3;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cainele " + this.name + " face HAM HAM HAM");
    }
}
