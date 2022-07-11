package Abstractizare.ExempluTeorie;

public class Hyundai extends Car {

    public Hyundai(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void accelerate() {
        System.out.println(this.marca + " " + this.model + " accelereaza");
    }


}
