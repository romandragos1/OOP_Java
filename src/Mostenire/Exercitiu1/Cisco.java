package Mostenire.Exercitiu1;

public class Cisco extends DeskPhone {

    public Cisco(String number, int price) {
        super(number, price);
    }

    public void sendFax() {
        System.out.println("Faxul a fost trimis");
    }
}
