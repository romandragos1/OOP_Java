package Polimorfism.Exercitiu3;

public class JetPlane extends Plane {

    public JetPlane() {
        super(2);
    }

    @Override
    public void fly() {
        System.out.println("Avionul JetPlane zboare foarte repede");
    }
}
