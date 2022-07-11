package Polimorfism.Exercitiu2;

public class Dacia extends Car {

    public Dacia(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Dacia " + this.model + " a atins viteza maxima in 20 secunde");
        crushEngine();
    }

    public void crushEngine() {
        System.out.println("Motorul autoturismului Dacia " + this.model + " s-a defectat");
    }
}
