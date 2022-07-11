package ClaseSiObiecte.Exercitiu9;

public class Main {

    public static void main(String[] args) {

// Exercitiu 9 - Creati clasa Radio care va contine atributele (campurile): boolean on, int volume, int currentPostIndex si ArrayList<String> posts.
// In momentul crearii unui radio se vor adauga 5 posturi in lista de posts a acestuia.
// Orice radio initializat va avea postul curent 1, volumul 0 si va fi oprit.
// Radioul va avea urmatoarele functionalitati (metode):
// turnOn(), turnOff() - aceste metode vor porni / opri radioul;
// turnVolumeUp(), turnVolumeDown() - aceste metode vor modifica volumul radioului; volumul poate fi cuprins intre 0 - 10;
// changePostForward(), changePostBackwards() - aceste metode vor modifica postul curent pe baza listei de posturi din structura acestuia;
// displayRadioStatus() - aceasta metoda va printa unul dintre urmatoarele mesaje in functie de structura interna a radioului curent:
// "Radioul este oprit" / "Radioul este pornit pe postul X, dat la volumul Y"
// Creati un obiect de tip Radio. Schimbati de 5 ori volumul si de 10 ori postul curent (forward si backwards) printand de asemenea,
// de fiecare data structura interna a radioului.

        Radio radio = new Radio();          // Initializam Radio-ul
        radio.turnOn();                     // Pornim Radio-ul
        radio.turnVolumeUp();               // Volum mai tare x 1
        radio.changePostForward();          // Cautare post inainte radio x 2
        radio.changePostForward();
        radio.changePostBackwards();        // Cautare post inapoi radio x 2
        radio.changePostBackwards();
        radio.turnVolumeUp();               // Volum mai tare x 2
        radio.turnVolumeUp();
        radio.turnVolumeDown();             // Volum mai incet x 1
        radio.displayRadioStatus();         // Status Radio
        radio.turnVolumeUp();               // Volum mai tare x 9, atentionare volum maxim
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeDown();             // Volum mai incet x 11, atentionare volum minim
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnOff();                   // Inchidem Radio-ul
    }
}