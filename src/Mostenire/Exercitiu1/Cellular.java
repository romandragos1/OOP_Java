package Mostenire.Exercitiu1;

public class Cellular extends Phone {

    public Cellular(String number, int price) {
        super(number, price);
    }

    public void takePicture() {
        System.out.println("Am facut o fotografie cu rezolutie mica");
    }

    public void playVideo() {
        System.out.println("Am rulat un fisier video de rezolutie mica");
    }
}
