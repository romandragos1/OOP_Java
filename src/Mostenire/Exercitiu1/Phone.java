package Mostenire.Exercitiu1;

public class Phone {

    String number;
    int price;

    public Phone(String number, int price) {
        this.number = number;
        this.price = price;
    }

    public void call() {
        System.out.println(number + " a efectuat un apel");
    }

    public void showDetails() {
        System.out.println("Telefonul cu numarul : " + number + ", are pretul: " + price);
    }
}
