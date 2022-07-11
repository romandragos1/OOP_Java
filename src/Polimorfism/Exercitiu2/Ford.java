package Polimorfism.Exercitiu2;

public class Ford extends Car {

    public Ford(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Ford " + this.model + " a atins viteza maxima in 15 secunde");
    }
}
