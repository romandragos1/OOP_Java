package Polimorfism.Exercitiu5;

public class Shaorma {

    public void adaugaCarne() {
        System.out.println("Am adaugat carne");
    }

    public void adaugaCartofi() {
        System.out.println("Am adaugat cartofi");
    }

    public void adaugaSalate() {
        System.out.println("Am adaugat salate");
    }

    public void pregatesteShaorma() {
        System.out.println("Preparam shaorma");
        adaugaCarne();
        adaugaCartofi();
        adaugaSalate();
    }
}
