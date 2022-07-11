package Polimorfism.Exercitiu6;

public class AK47 extends Shooter {

    public AK47() {
        this.maxRange = 500;
    }

    @Override
    public void shoot() {
        multiShoot();
    }

    public void multiShoot() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Bang bang bang");
        }
    }
}
