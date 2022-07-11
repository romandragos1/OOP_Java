package Compozitie.Exercitiu7;

public class Monitor {

    String brand;
    int diagonala;
    int price;

    public Monitor(String brand, int diagonala, int price) {
        this.brand = brand;
        this.diagonala = diagonala;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", diagonala=" + diagonala +
                ", price=" + price +
                '}';
    }
}
