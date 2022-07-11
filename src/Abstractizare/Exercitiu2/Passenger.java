package Abstractizare.Exercitiu2;

public abstract class Passenger {

    String name;

    public Passenger(String name) {
        this.name = name;
    }

    abstract void useBenefits();
}
