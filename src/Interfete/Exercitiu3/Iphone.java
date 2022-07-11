package Interfete.Exercitiu3;

public class Iphone implements SmartphoneBehaviour {

    @Override
    public void screenshot() {
        System.out.println("Iphone a facut un screenshot");
    }

    @Override
    public void downloadapp(String name) {
        System.out.println("Iphone a downloadat aplicatia " + name);
    }

    @Override
    public void call(String telephoneNumber) {
        System.out.println("Iphone a efectuat un apel catre " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Iphone se incarca");
    }
}
