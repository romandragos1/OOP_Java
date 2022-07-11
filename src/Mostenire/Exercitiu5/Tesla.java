package Mostenire.Exercitiu5;

public class Tesla extends Automobil {

    int batteryPercentage;

    public Tesla(String marca, String model) {
        super(marca, model);
        batteryPercentage = 100;
    }

    public void drive() {
        if (batteryPercentage >= 10) {
            System.out.println("Tesla a pornit pe traseu (-10% baterie)");
            batteryPercentage -= 10;
        } else {
            System.out.println("Tesla nu mai are baterie");
        }
    }

    public void charge() {
        batteryPercentage = 100;
        System.out.println("Bateria Tesla este incarcata la 100%");
    }

}
