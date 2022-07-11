package Abstractizare.Exercitiu2;

public class SecondClassPassenger extends Passenger {

    public SecondClassPassenger(String name) {
        super(name);
    }

    @Override
    void useBenefits() {
        System.out.println("Pasagerul " + this.name + " a primit apa, alune si are spatiu decent la picioare");
    }
}
