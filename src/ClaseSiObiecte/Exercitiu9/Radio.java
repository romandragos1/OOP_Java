package ClaseSiObiecte.Exercitiu9;

import java.util.ArrayList;
import java.util.Arrays;

public class Radio {

    boolean on;
    int volume;
    int currentPostIndex;
    ArrayList<String> posts;

    public Radio() {
        currentPostIndex = 1;
        posts = new ArrayList<>(Arrays.asList("Magic FM", "Radio ZU", "Digi FM"));
        posts.add("Rock FM");
        posts.add("Europa FM");
    }

    public void turnOn() {
        if (on) {
            System.out.println("Radioul este deja pornit");
        } else {
            System.out.println("Radioul a fost pornit");
            on = true;
        }
    }

    public void turnOff() {
        if (on) {
            System.out.println("Radioul a fost oprit");
            on = false;
        } else {
            System.out.println("Radioul este deja oprit");
        }
    }

    public void turnVolumeUp() {
        if (volume == 10) {
            System.out.println("Radioul este dat la volum maxim");
        } else {
            volume++;
            System.out.println("Am schimbat volumul pe treapta " + volume);
            displayRadioStatus();
        }
    }

    public void turnVolumeDown() {
        if (volume == 0) {
            System.out.println("Radioul este dat la volum minim");
        } else {
            volume--;
            System.out.println("Am schimbat volumul pe treapta " + volume);
            displayRadioStatus();
        }
    }

    public void changePostForward() {
        if (currentPostIndex == posts.size() - 1) {
            currentPostIndex = 0;
        } else {
            currentPostIndex++;
            displayRadioStatus();
        }
    }

    public void changePostBackwards() {
        if (currentPostIndex == 0) {
            currentPostIndex = posts.size() - 1;
        } else {
            currentPostIndex--;
            displayRadioStatus();
        }
    }

    public void displayRadioStatus() {
        if (!on) {
            System.out.println("Radioul este oprit");
        } else {
            System.out.println("Radioul este pe postul " + posts.get(currentPostIndex) + ", dat la volumul " + volume);
        }
    }
}