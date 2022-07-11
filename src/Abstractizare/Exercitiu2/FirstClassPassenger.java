package Abstractizare.Exercitiu2;

public class FirstClassPassenger extends Passenger {

    public FirstClassPassenger(String name) {
        super(name);
    }

    @Override
    void useBenefits() {
        System.out.println("Pasagerul " + this.name + " a primit sampanie, alune si are spatiu suplimentar la picioare");
    }
}
