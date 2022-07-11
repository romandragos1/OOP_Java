package Polimorfism.Exercitiu5;

public class ShaormaPicanta extends Shaorma {

    public void adaugaKetchupPicant() {
        System.out.println("Am adaugat ketchup picant la shaorma");
    }

    public void adaugaUsturoi() {
        System.out.println("Am adaugat usturoi la shaorma");
    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        adaugaKetchupPicant();
        adaugaUsturoi();
    }
}
