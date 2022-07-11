package Mostenire.Exercitiu1;

public class Motorolla extends Cellular {

    boolean clapOpen;

    public Motorolla(String number, int price, boolean clapOpen) {
        super(number, price);
        this.clapOpen = clapOpen;
    }

    public void closeClap() {
        if (clapOpen) {
            System.out.println("Am inchis clapeta telefonului");
            clapOpen = false;
        } else {
            System.out.println("Am deschis clapeta telefonului");
            clapOpen = true;
        }
    }
}
