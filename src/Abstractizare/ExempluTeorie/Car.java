package Abstractizare.ExempluTeorie;

public abstract class Car {

    String marca;
    String model;

    public Car(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void stratEngine() {
        System.out.println(this.marca + " " + this.model + " a pornit motorul");
    }

    public abstract void accelerate();
}
