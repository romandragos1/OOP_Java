package ClaseSiObiecte.Exercitiu15;

public class Plane {

    String brand;
    String model;
    boolean isFlying;
    int maxPassengers;
    int passengerNumber;

    public Plane(String brand, String model, int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.maxPassengers = maxPassengers;
    }

    public void addPassenger() {
        if (passengerNumber < maxPassengers) {
            System.out.println("Un pasager s-a urcat la bord");
            passengerNumber++;
        } else {
            System.out.println("Avionul este la capacitate maxima de pasageri");
        }
    }

    public void fly() {
        if (isFlying || passengerNumber < (maxPassengers / 2)) {
            System.out.println("Avionul nu poate decola");
        } else {
            System.out.println("Avionul poate decola");
            isFlying = true;
        }
    }

    public void land() {
        if (isFlying) {
            System.out.println("Avionul poate ateriza");
            isFlying = false;
        } else {
            System.out.println("Avionul este deja aterizat");
        }
    }
}