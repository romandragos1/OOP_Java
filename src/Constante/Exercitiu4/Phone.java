package Constante.Exercitiu4;

public class Phone {

    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public final void makeCall(String phoneNumber) {
        System.out.println("Telefonul " + this.brand + " " + this.model + " a efectuat un apel catre numarul de telefon " + phoneNumber);
    }

    public void downloadAppFromStore(String appName) {
        System.out.println("Telefonul " + this.brand + " " + this.model + " a downloadat aplicatia " + appName);
    }
}
