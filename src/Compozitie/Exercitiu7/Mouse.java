package Compozitie.Exercitiu7;

public class Mouse {

    String brand;
    String colour;
    int price;

    public Mouse(String brand, String colour, int price) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
