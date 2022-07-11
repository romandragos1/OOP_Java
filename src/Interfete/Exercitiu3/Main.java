package Interfete.Exercitiu3;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati interfetele TelephoneBehaviour si SmartphoneBehaviour;
// Un telefon poate suna si poate fi incarcat;
// Un smartphone poate suna, poate fi incarcat, poate face screenshoturi si poate descarca aplicatii;
// Definiti clasele Nokia, Motorola, Samsung si Iphone si legati-le la interfetele specifice;
// Testati functionalitatile.

        Iphone iphone = new Iphone();       // Initializam si cream cele 4 telefoane
        Samsung samsung = new Samsung();
        Nokia nokia = new Nokia();
        Motorola motorola = new Motorola();

        iphone.call("0722555444");      // Apelam metodele declarate pentru fiecare telefon
        iphone.charge();
        iphone.screenshot();
        iphone.downloadapp("Twitter");

        samsung.call("0744333545");
        samsung.charge();
        samsung.screenshot();
        samsung.downloadapp("WhatsApp");

        nokia.call("0788652547");
        nokia.charge();

        motorola.call("0264325458");
        motorola.charge();
    }
}
