package Interfete.Exercitiu3;

public class Nokia implements TelephoneBehaviour {

    @Override
    public void call(String telephoneNumber) {
        System.out.println("Nokia a efectuat un apel catre " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Nokia se incarca");
    }
}
