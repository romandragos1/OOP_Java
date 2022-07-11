package ClaseSiObiecte.Exercitiu14;

public class BUS {

    String brand;
    int maxPassengers;
    int passengersNumber;
    int maxSpeed;

    public BUS(String brand, int maxPassengers, int maxSpeed) {
        this.brand = brand;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public void addPassenger() {
        if (passengersNumber == maxPassengers) {
            System.out.println("Nu mai puteam adauga pasageri");
        } else {
            System.out.println("Un pasager a urcat la bord");
            passengersNumber++;
        }
    }

    public void reachNextStation() {
        if (passengersNumber < maxPassengers / 2) {
            System.out.println("Autobuzul va merge cu viteza maxima de " + maxSpeed);
        } else {
            System.out.println("Autobuzul va merge cu viteza de " + (maxSpeed / 2));
        }
    }
}