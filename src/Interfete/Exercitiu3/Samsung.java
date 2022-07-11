package Interfete.Exercitiu3;

public class Samsung implements SmartphoneBehaviour {

    @Override
    public void screenshot() {
        System.out.println("Samsung a facut un screenshot");
    }

    @Override
    public void downloadapp(String name) {
        System.out.println("Samsung a downloadat aplicatia " + name);
    }

    @Override
    public void call(String telephoneNumber) {
        System.out.println("Samsung a efectuat un apel catre " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Samsung se incarca");
    }
}
