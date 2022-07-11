package Compozitie.ExempluTeorie;

public class Car {

    String marca;
    String model;

    public Car(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
