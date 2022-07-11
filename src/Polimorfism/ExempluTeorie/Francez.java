package Polimorfism.ExempluTeorie;

public class Francez extends Cetatean{

    public Francez(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        System.out.println(this.nume+" dis bounjor");
//        super.saluta();
    }
}
