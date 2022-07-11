package Interfete.Exercitiu3;

public class Motorola implements TelephoneBehaviour {
    @Override
    public void call(String telephoneNumber) {
        System.out.println("Motorola a efectuat un apel catre " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Motorola se incarca");
    }
}
