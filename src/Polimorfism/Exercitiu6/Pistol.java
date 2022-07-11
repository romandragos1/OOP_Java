package Polimorfism.Exercitiu6;

public class Pistol extends Shooter {

    public Pistol() {
        this.maxRange = 100;
    }

    @Override
    public void shoot() {
        System.out.println("Pistolul a lovit tinta la o distanta de " + maxRange + " metri");
    }
}
