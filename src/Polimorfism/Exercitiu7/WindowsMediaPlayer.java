package Polimorfism.Exercitiu7;

public class WindowsMediaPlayer extends VideoPlayer {

    @Override
    public void playVideo(String movieName) {
        System.out.println("Am pornit fisierul video " + movieName + " la o calitate medie");
    }
}
