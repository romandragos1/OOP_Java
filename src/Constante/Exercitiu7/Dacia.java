package Constante.Exercitiu7;

public class Dacia extends Car {

    public Dacia(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void accelerate() {
        System.out.println(this.marca + " " + this.model + " accelereaza");
    }
}
