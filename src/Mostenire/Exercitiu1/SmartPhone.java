package Mostenire.Exercitiu1;

public class SmartPhone extends Phone {

    public SmartPhone(String number, int price) {
        super(number, price);
    }

    public void takeScreenShot() {
        System.out.println("Am efectuat o captura de ecran");
    }

    public void takePicture() {
        System.out.println("Am facut o fotografie de rezolutie mare");
    }

    public void playVideo() {
        System.out.println("Am rulat un fisier video de rezolutie mare");
    }
}
