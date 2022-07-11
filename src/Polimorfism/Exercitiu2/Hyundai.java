package Polimorfism.Exercitiu2;

public class Hyundai extends Car {

    public Hyundai(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Hyundai " + this.model + " a atins viteza maxima in 10 secunde");
    }
}
