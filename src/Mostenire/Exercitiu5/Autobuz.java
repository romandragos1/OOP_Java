package Mostenire.Exercitiu5;

public class Autobuz extends Automobil {

    int maxPassengers;
    int currentPassengers;

    public Autobuz(String marca, String model, int maxPassengers) {
        super(marca, model);
        this.maxPassengers = maxPassengers;
        this.currentPassengers = 0;
    }

    public void addPassenger() {
        if (currentPassengers >= maxPassengers) {
            System.out.println("Locurile din autobuz au ajuns la capacitatea maxima");
        } else {
            currentPassengers++;
            System.out.println("A urcat un pasager in autobuz");
        }
    }

}
