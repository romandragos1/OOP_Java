package Abstractizare.Exercitiu2;

public class ThirdClassPassenger extends Passenger {

    public ThirdClassPassenger(String name) {
        super(name);
    }

    @Override
    void useBenefits() {
        System.out.println("Pasagerul " + this.name + " a primit locul alocat in avion");
    }
}
