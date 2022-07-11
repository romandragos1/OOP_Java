package Polimorfism.Exercitiu6;

public class Sniper extends Shooter {

    public Sniper() {
        this.maxRange = 2000;
    }

    @Override
    public void shoot() {
        System.out.println("Sniperul a lovit tinta la o distanta de " + maxRange + " metri");
    }
}
