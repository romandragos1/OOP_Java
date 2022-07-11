package Polimorfism.Exercitiu7;

public class VLCPlayer extends VideoPlayer {

    @Override
    public void playVideo(String movieName) {
        System.out.println("Am pornit fisierul video " + movieName + " la o calitate ridicata");
    }
}
