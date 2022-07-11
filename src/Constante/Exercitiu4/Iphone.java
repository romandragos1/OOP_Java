package Constante.Exercitiu4;

public class Iphone extends Phone {

    public Iphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void downloadAppFromStore(String appName) {
        System.out.println("Telefonul " + this.brand + " " + this.model + " a downloadat aplicatia " + appName + " din i Store");
    }
}
