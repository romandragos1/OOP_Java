package Mostenire.Exercitiu5;

public class Automobil {

    String marca;
    String model;
    boolean started;

    public Automobil(String marca, String model) {
        this.marca = marca;
        this.model = model;
        started = false;
    }

    public void startEngine() {
        if (started) {
            System.out.println(this.marca + " este deja pornit");
        } else {
            started = true;
            System.out.println(this.marca + " a pornit");
        }
    }

    public void stopEngine() {
        if (started) {
            started = false;
            System.out.println(this.marca + " este oprit");
        } else {
            System.out.println(this.marca + " este deja oprit");
        }
    }
}
