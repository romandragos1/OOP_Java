package Polimorfism.Exercitiu7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// Exercitiu 7 - Creati clasa VideoPlayer cu metoda playVideo(String movieName);
// Clasa VLCPlayer va porni videoul la o calitate ridicata;
// Clasa WindowsMediaPlayer va porni videoul la o calitate medie;
// Clasa Winamp va porni videol la o calitate slaba;
// Creati un Video Player de fiecare tip de date definit;
// Adaugati 4 filme intr-o lista si faceti toate programele sa ruleze filmele respective, descrescator.

        ArrayList<String> filme = new ArrayList<>(Arrays.asList("A Quiet Place", "Dune", "Morbius", "Uncharted")); // Adaugam 5 filme intr-o lista

        VLCPlayer vlcPlayer = new VLCPlayer();                                  // Initializam cate un video player de fiecare tip
        WindowsMediaPlayer windowsMediaPlayer = new WindowsMediaPlayer();
        Winamp winamp = new Winamp();

        for (int i = filme.size() - 1; i >= 0; i--) {         // Parcurgem lista de filme descrescator cu fiecare video player in parte
            vlcPlayer.playVideo(filme.get(i));
            windowsMediaPlayer.playVideo(filme.get(i));
            winamp.playVideo(filme.get(i));
        }
    }
}
