package Constante.Exercitiu7;

public class Ford extends Car {

    public Ford(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void accelerate() {
        System.out.println(this.marca + " " + this.model + " accelereaza");
    }
}
