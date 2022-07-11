package Compozitie.Exercitiu1;

public class Laptop {

    static int idCount = 1;
    String marca;
    String model;

    public Laptop(String marca, String model) {
        idCount++;
        this.marca = marca;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
