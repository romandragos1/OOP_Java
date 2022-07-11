package Constante.Exercitiu7;

public class Car {

    String marca;
    String model;
    boolean on;

    public Car(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public final void startEngine() {
        if (on) {
            System.out.println("Autoturismul " + this.marca + " " + this.model + " este deja pornit");
        } else {
            System.out.println("Am pornit autoturismul " + this.marca + " " + this.model);
            on = true;
        }
    }

    public final void stopEngine() {
        if (on) {
            System.out.println("Am oprit autoturismul " + this.marca + " " + this.model);
            on = false;
        } else {
            System.out.println("Autoturismul " + this.marca + " " + this.model + " este deja oprit");
        }
    }

    public void accelerate() {
        System.out.println("Am marit viteza autoturismului");
    }
}
