package Abstractizare.Exercitiu1;

public class Vanzator {

    public InstrumentMusical vindeInstrumentMuzical(String instrumentMuzicalDorit) {
        if (instrumentMuzicalDorit.equalsIgnoreCase("chitara")) {
            return new Chitara();
        } else if (instrumentMuzicalDorit.equalsIgnoreCase("pian")) {
            return new Pian();
        } else if (instrumentMuzicalDorit.equalsIgnoreCase("saxofon")) {
            return new Saxofon();
        } else {
            System.out.println("Nu exista pe stoc acest instrument muzical");
            return null;
        }
    }
}
