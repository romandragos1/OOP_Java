package Interfete.ExempluTeorie1;

public class Bird implements Flyable, Eatable {

    @Override
    public void fly() {
        System.out.println("Pasarea zboara");
    }

    @Override
    public void eat() {
        System.out.println("Pasarea mananca");
    }
}
