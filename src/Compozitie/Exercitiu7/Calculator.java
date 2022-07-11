package Compozitie.Exercitiu7;

public class Calculator {

    String brand;
    int price;
    Mouse mouse;
    Keyboard keyboard;
    Monitor monitor;

    public Calculator(String brand, int price, Mouse mouse, Keyboard keyboard, Monitor monitor) {
        this.brand = brand;
        this.price = price;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void printTotalPrice() {
        int totalPrice = this.price + mouse.price + keyboard.price + monitor.price;
        System.out.println("Pretul PC-ului va fi de " + totalPrice);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", mouse=" + mouse +
                ", keyboard=" + keyboard +
                ", monitor=" + monitor +
                '}';
    }
}
