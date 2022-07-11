package Polimorfism.Exercitiu5;

public class ShaormaDulce extends Shaorma {

    public void adaugaKetchupDulce() {
        System.out.println("Am adaugat ketchup dulce la shaorma");
    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        adaugaKetchupDulce();
    }
}
