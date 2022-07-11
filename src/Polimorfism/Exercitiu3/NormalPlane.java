package Polimorfism.Exercitiu3;

public class NormalPlane extends Plane {

    public NormalPlane(int maxPassengers) {
        super(maxPassengers);
    }

    @Override
    public void fly() {
        System.out.println("Avionul zboara cu o viteza normala");
    }
}
